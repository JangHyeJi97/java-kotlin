/*1.�ܼ�â���� �޴��� �����ְ�, �޴���ȣ�� �Է¹޾� ó���� ��
	 - �޴� : 1.�����Է� 2.�����˻� 3.��ü���� 4.����

  2.�����Է� �� ���� : �й�, �̸�, ��������, ��������, ��������
	 - ���� ������ ���� ����� Ŭ������ ����� �ν��Ͻ��� �迭�� ����

  3.�����˻� : �й��� �Է� �޾� �ش� ���� �˻� �� ���� ���
  	 - ������� ��) �й� : [1112023] / �̸� : [ȫ�浿] / �� ���� ���� / ��� : [�������]
	 - ��ü���� : ��ü �л��� ������ '�����˻�'�� ��� ����ó�� ��� �����ֱ�
	 - ���� : ���α׷� ����
*/

import java.util.*;

/*���� ���� ���α׷�
1. �й��� �̸�, ����(��������, ��������, ��������)���� �з� 
	- �й��� �̸�(�л�����)�� ������ Ŭ���� : Student
	- ������ ������ Ŭ���� : Grade
2. �л� ������ ���� �Է��Ͽ� ����
	- �Է¹��� ������ �����Ű�� Ŭ���� �Ǵ� �޼ҵ� : ReportCardHandler(�Է�, ����, �˻�)
3. ����� �л� ���� �� ���ϴ� �л��� ���� ������ �˻� : �˻���� �޼ҵ�
4. ���α׷� ���� �� ���� : FirstStudent
*/
class Student {
//�л����� �⺻����(�й�, �̸�)�� ������ Ŭ����
	String classOf, name;
	//�л����� �⺻�������� ������ ���������
	public Student(String classOf, String name)	{
	//StudentŬ������ �����ڷ� �޾ƿ� �Ű��������� ��������� ����(�ϳ��� �ν��Ͻ��� �����Ҷ� ģ�� �⺻������ �����)
		this.classOf = classOf;	this.name = name;
	}
	public void showAllInfo(){
		System.out.println("�й� : " + classOf);
		System.out.println("�̸� : " + name);
		//public void showBasicInfo(){}
		//����Ŭ�������� �������̵� �� �� �ֵ��� �޼ҵ忡 ������ ������ ������ ����
	}
	public void showBasicInfo(){}
}

class Grade extends Student {
//������ ������ Ŭ������ Student�� ��ӹ޾� �л� �⺻������ ������ ��
	private String korean, history, math;
	//������ �������� �ִ� ������ ������ �������
	public Grade(String classOf, String name) {
		super(classOf, name);
		//�޾ƿ� ������ �� �⺻�������� �μ��� �Ͽ� ���� Ŭ������ StudentŬ������ ������ ȣ��
		this.korean = korean; this.history = history; this.math = math;
	}
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + history);
		System.out.println("���� ���� : " + math);
	}
	public void showBasicInfo(){
		System.out.println("�й� : " + classOf);
		System.out.println("�̸� : " + name);
	}
}

class ReportCardHandler {
//Student, Grade Ŭ������ �̿��Ͽ� ���� �۾��� ó���ϴ� Ŭ����
	private Student[] FirstStudents;
	// Student�� �ν��Ͻ�(����Ŭ���� ����)�� ������ �� �ִ� �迭 ����
	// Student������ ���������ν� Student�� ���� Ŭ������ Grade�� �ν��Ͻ��� ���尡��
	private int numOfStudents;
	// FirstStudent �迭�� �ε��� ��ȣ���� ���� ����� �л� ���� �ǹ��ϴ� ����
	public ReportCardHandler(int num) {
		FirstStudents = new Student[num];
		//�迭�� ũ�⸦ �μ��� �޾ƿ� FirstStudentInfo�迭�� ���� - ������ ũ�⸸ŭ �л� ������ �����Ҽ� ����
		numOfStudents = 0;
		//FirstStudents�迭�� ������ ģ�������� �ε��� ��ȣ���� ���� ����� �л� ���� �ǹ��ϴ� ��
	}
	private void addStudentInfo(Student student){
	//Student Ŭ���� ���ο����� ����ϹǷ� �ܺο��� ������ �� ���� private���� ������
	//FirstStudents �迭�� �߰��� �л����� �ν��Ͻ��� �μ��� �޾ƿ� FirstStudents �迭�� �����Ű�� �޼ҵ�
	//�Ű������� Student���� ������ Grade�� �ν��Ͻ��� �޾ƾ� �ϹǷ� ����Ŭ���������� ����
	//�Ű������� Student���� �ƴϸ� ��� ������ �л�������ŭ addStudentInfo() �޼ҵ带 ���� ���� ��������
		FirstStudents[numOfStudents] = student;
		//�޾ƿ� �л����� �ν��Ͻ��� FirstStudents �迭�� ����
		numOfStudents++;
		//���� �л������� ������ �ε����� ���� 1����(���� ����Ǿ� �ִ� ģ������ �ν��Ͻ��� �����̱⵵ ��)
	}
	public void addStudent(int choice){
	//����ڰ� �Է��ϴ� �л������� �޾� �����Ű�� �޼ҵ�
		String classOf, name, korean, history, math; //�л������� ������ �������� ����

		Scanner sc = new Scanner(System.in);
		System.out.print("�й� : ");		classOf = sc.nextLine();
		System.out.print("�̸� : ");		name = sc.nextLine();
		//������ ��Ÿ���� ���� �л��⺻����(StudentŬ������ �������)���� �Է¹���

		
		
		if (int = 1) {//���� ��Ͻ�
			System.out.println("���� ���� : " + korean);		korean = sc.nextLine();
			System.out.println("���� ���� : " + history);		history = sc.nextLine();
			System.out.println("���� ���� : " + math);		math = sc.nextLine();
			//���� ���� �Է¹���
			
			addStudentInfo(new Grade(classOf, name, korean, history, math));
			//�̸����� Grade�� �ν��Ͻ� ������ �� �ν��Ͻ��� �μ��� �Ͽ� addStudentInfo()�޼ҵ� ȣ��
		}
		
		System.out.println("�Է¿Ϸ�\n");
	}
	public void showAllInfo(){
	//��� �л����� ��� ������ �����ִ� �޼ҵ�
	}
	public void showBasicInfo(){
	//��� �л����� �⺻������ �����ִ� �޼ҵ�
	}
}

class FirstStudentInfo {
	public static void main(String[] args) {
		ReportCardHandler handler = new ReportCardHandler(10);

		while (true) {	//���� �����μ� ��� ���鼭 ���α׷� ��� ���¸� ����
			System.out.println(".*.*.*�޴� ����*.*.*.*");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� �˻�");
			System.out.println("3. ��ü ����");
			System.out.println("4. ���α׷� ����");
			System.out.println("�޴����� >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			//����ڰ� �Է��� �޴���ȣ�� choice������ ����
			
			switch (choice) {
				case 1 :	case 2 : //����ڰ� �Է��� �޴���ȣ�� 1�̰ų� 2�̸�
					handler.addStudent(choice);	break;
					//������ �޴� ��ȣ�� �μ��� �Ͽ� handler �ν��Ͻ��� addStudent()�޼ҵ带 ȣ��
				case 3 : 
					handler.showAllInfo();		break;
				case 9 :
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}
	}
}