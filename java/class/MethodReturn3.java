class MethodReturn3 {
	public static void main(String[] args) {
		char grade = getGrade(78);
		System.out.println("������ ' " + grade + " '�����Դϴ�. ");

		// 5�� 7�� �ּ� ������� ���ϴ� �޼ҵ�
		int num = getNumber();
		System.out.println("5�� 7�� �ּ� ����� : " + num);
	}
	public static int getNumber1() {
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 5 == 0 && i % 7 ==0) {
				return i;
			}
		}
				
	}
		return -1;	
		// ������ ��ü�� ���� ���� ������ �����Ƿ� ���ǿ� ����Ǹ� �ƿ� return�� �ȵɼ��� �ֱ� ������
		// ���������� return�� ��� �ݵ�� ������ �ۿ��� return�� �ѹ� �� ����� ��


	public static char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60)	{
			return 'D';
		} else {
			return 'F';
		}
	}//
	}
}
