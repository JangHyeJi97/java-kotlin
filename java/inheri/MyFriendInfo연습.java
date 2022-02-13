import java.util.*;

/*ģ�� �ּҷ� ���α׷�
1. ģ���� ��â����ģ���� ��ȸģ���� �з� : ģ���� ������ ������ Ŭ����(��)
	- ģ���� ������ ������ Ŭ����(��) : Friend(�⺻����), StudentFriend(��â����ģ��), SocietyFriend(��ȸģ��)
2. ģ���� ������ ���� �Է��Ͽ� ���� 
	- �Է¹��� ������ �����Ű�� Ŭ���� �Ǵ� �޼ҵ� : FriendHandler(�Է�, ����, �˻�)
3. ����� ģ�� ������ �� ���ϴ� ģ���� ������ �˻� : �˻���� �޼ҵ�
4. ���α׷� ���� �� ���� : MyFriendInfo
*/

class Friend {
//ģ������ �⺻����(�̸�,��ȭ,�ּ�)���� ������ Ŭ����
	 String name, phone, area;
	//ģ������ �⺻�������� ������ ���������
	public Friend(String name, String phone, String area) {
	//FriendŬ������ �����ڷ� �޾ƿ� �Ű��������� ��������� ����(�ϳ��� �ν��Ͻ��� �����Ҷ� ģ�� �⺻������ �����)
		this.name = name;	this.phone = phone;		this.area = area;
	}
	public void showAllInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("�������� : " + area);
		//public void showBasicInfo(){}
		//����Ŭ�������� �������̵� �� �� �ֵ��� �޼ҵ忡 ������ ������ ������ ����
	}
	public void showBasicInfo(){}
}

class StudentFriend extends Friend {
//�� ģ���� ������ Ŭ������ Friend�� ��ӹ޾� ģ�� �⺻������ ������ ��
	private String work;
	//�������� ��ģ������ �ִ� ������ ������ �������
	public StudentFriend(String name, String phone, String area, String work){
		super(name, phone, area);
		//�޾ƿ� ������ �� �⺻�������� �μ��� �Ͽ� ����Ŭ������ FriendŬ������ ������ ȣ��
		this.work = work;
	}
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("���� : " + work);
	}
	public void showBasicInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
	}
}

class SocietyFrined extends Friend{
//��ȸ ģ���� ������ Ŭ������ Friend�� ��ӹ޾� ģ�� �⺻������ ������ ��
	private String major;
	// �������� ��ȸģ������ �ִ� ������ ������ �������
	public SocietyFrined(String name, String phone, String area, String major){
		super(name, phone, area);
		this.major = major;
	}
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("���� : " + major);
	}
	public void showBasicInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + phone);
		System.out.println("���� : " + major);
	}
}

class FriendHandler {
//Friend, HighFriend, UnivFriend Ŭ������ �̿��Ͽ� ���� �۾��� ó���ϴ� Ŭ����
	private Friend[] myFriends;
	// Friend�� �ν��Ͻ�(����Ŭ���� ����)�� ������ �� �ִ� �迭 ����
	//Friend������ ���������ν� Friend�� ����Ŭ������ HighFriend�� UnivFriend�� �ν��Ͻ��� ���尡��
	private int numOfFriends;
	//myFriends �迭�� �ε��� ��ȣ���� ���� ����� ģ�� ���� �ǹ��ϴ� ����
	public FriendHandler(int num) {
		myFriends = new Friend[num];
		//�迭�� ũ�⸦ �μ��� �޾ƿ� myFriends�迭�� ���� - ������ ũ�⸸ŭ ģ�� ������ ������ �� ����
		numOfFriends = 0;
		//myFriends�迭�� ������ ģ�������� �ε��� ��ȣ���� ���� ����� ģ�� ���� �ǹ��ϴ� ��
	}
	private void addFriendInfo(Friend fren){
	//FriendHandler Ŭ���� ���ο����� ����ϹǷ� �ܺο��� �����Ҽ� ���� private���� ������
	//myFriends �迭�� �߰��� ģ������ �ν��Ͻ��� �μ��� �޾ƿ� myFriends �迭�� �����Ű�� �޼ҵ�
	//�Ű������� Friend���� ������ StudentFriend�� UnivFriend�� �ν��Ͻ� ��� �޾ƾ� �ϹǷ� �� Ŭ������ ����Ŭ���������� ����
	//�Ű������� Friend���� �ƴϸ� ��� ������ ģ��������ŭ addFriendInfo() �޼ҵ带 ���� ���� ������ ��
		myFriends[numOfFriends] = fren;
		//�޾ƿ� ģ������ �ν��Ͻ��� myFriends �迭�� ����
		numOfFriends++;
		//���� ģ�������� ������ �ε����� ���� 1����(���� ����Ǿ� �ִ� ģ������ �ν��Ͻ��� �����̱⵵ ��)
	}
	public void addFriend(int choice){
	//����ڰ� �Է��ϴ� ģ�������� �޾� �����Ű�� �޼ҵ�
		String name, phone, area, work, major;	//ģ�������� ������ �������� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");		name = sc.nextLine();
		System.out.print("��ȭ : ");		phone = sc.nextLine();
		System.out.print("�������� : ");		area = sc.nextLine();
		//���� ���� ģ�� ��� �ʿ�� �ϴ� �⺻����(FriendŬ������ �������)���� �Է¹���

		if (choice == 1) {	//��ģ�� ��Ͻ�
			System.out.print("���� : ");		work = sc.nextLine();
			//�л�ģ�� ���� ���� �Է¹���
			addFriendInfo(new StudentFriend(name, phone, area, work));
			//�̸� ���� StudentFriend�� �ν��Ͻ� ���� �� �� �ν��Ͻ��� �μ��� �Ͽ� addStudentInfo()�޼ҵ� ȣ��
		} else {			//����ģ�� ��Ͻ�
			System.out.print("���� : ");		major = sc.nextLine();
			addFriendInfo(new StudentFriend(name, phone, area, major));
		}

		System.out.println("�Է¿Ϸ�\n");
	}
	public void showAllInfo(){
	//��� ģ������ ��� ������ �����ִ� �޼ҵ�	
	}
	public void showBasicInfo(){
	//��� ģ������ �⺻ ������ �����ִ� �޼ҵ�	
	}
}

class MyFriendInfo���� {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);

		while (true) {	//���� �����μ� ��� ���鼭 ���α׷� ��� ���¸� ����
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �л�ģ�� ����");
			System.out.println("2. ��ȸģ�� ����");
			System.out.println("3. ��ü���� ���");
			System.out.println("4. �⺻���� ���");
			System.out.println("9. ���α׷� ����");
			System.out.println("�޴����� >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			//����ڰ� �Է��� �޴���ȣ�� choice������ ����

			switch (choice) {
				case 1: case 2:	//����ڰ� �Է��� �޴���ȣ�� 1�̰ų� 2�̸� 
					handler.addFriend(choice);	break;
					//������ �޴� ��ȣ�� �μ��� �Ͽ� handler�ν��Ͻ��� addFriend()�޼ҵ带 ȣ��
				case 3:
					handler.showAllInfo();		break;
				case 4:
					handler.showBasicInfo();	break;
				case 9:
					System.out.println("���α׷��� �����մϴ�. ");
					return;
			}
		}
	}
}
