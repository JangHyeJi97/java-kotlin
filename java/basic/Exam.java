class Exam {
	public static void main(String[] args) {
		//int score = 88;
		 // score�� ������ 70�̻��̸� 'C', 80�̻��̸� 'B', 90�̻��̸� 'A', 60�̻��̸� 'D', 60�̸��̸� 'F'
		 // switch���� �̿��Ͽ� �۾�
		//switch (num) {
			//case 1 :
				//num >= 90;
				//System.out.println("A");		break;
			//case 2:
				//num >= 80;
				//System.out.println("B");		break;
			//case 3:
				//num >= 70;
				//System.out.println("C");		break;
			//case 4:
				//num >= 60;
				//System.out.println("D");		break;
		//	default:
				//System.out.println("F");		break;
	//	}







		int num = 8;
		 //num�� ����ִ� ���ڰ��� �̿��Ͽ� ������ ������ �۾��� �����ϴ� switch�� �ۼ�
		switch (num) {
			case 0:
				System.out.println("num������ ���� 0�̴�");		break;
			case 1:
				System.out.println("num������ ���� 1�̴�");		break;
			case 2:
				System.out.println("num������ ���� 2�̴�");		break;
			case 3:
				System.out.println("num������ ���� 3�̴�");		break;
			case 4:
				System.out.println("num������ ���� 4�̴�");		break;
			case 5:
				System.out.println("num������ ���� 5�̴�");		break;
			case 6:
				System.out.println("num������ ���� 6�̴�");		break;
			case 7:
				System.out.println("num������ ���� 7�̴�");		break;
			case 8:
				System.out.println("num������ ���� 8�̴�");		break;
			case 9:
				System.out.println("num������ ���� 9�̴�");		break;
		}

		switch (num) {
			case 1: case 2: case 3:	
				System.out.println("�ʹ��̴�");	break;
			case 4: case 5: case 6:
				System.out.println("�߹��̴�");	break;
			case 7: case 8: case 9:
				System.out.println("���̴�");	break;
			}
		
		switch (num) {
			case 1: case 3: case 5:	case 7: case 9:
				System.out.println("num�� �������� Ȧ����");	break;
			case 2: case 4: case 6: case 8:
				System.out.println("num�� �������� ¦����");	break;
			default:
				System.out.println("num�� �������� Ȧ���� ¦���� �ƴϴ�");	break;
			}
	







		
		//SwitchEx.java ���Ͽ� �ִ� ��� switch���� if������ ����

		int num = 2;
		if (num < 5) {
				System.out.println("5�̸�");
				} else {
				System.out.println("5�ʰ�"); 
					}
		
		char c1 = 'b';
		if (c1 == 'a') {
				System.out.println(c1 + "�� a�Դϴ�.");
		} else if (c1 == 'b') {
			System.out.println(c1 + "�� b�Դϴ�.");
		} else if (c1 == 'c') {
			System.out.println(c1 + "�� c�Դϴ�.");
		} else {
			System.out.println("�𸨴ϴ�.");
		}

		// jdk 1.7���� ���ڿ��� ��밡��
		int score = bb;
		if (score > cc) {
				System.out.println("��� �̻��Դϴ�.");
		} else {
				System.out.println("��� �����Դϴ�.");
		}
	}
}
	

