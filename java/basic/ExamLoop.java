class ExamLoop {
	public static void main(String[] args) {
		/* ������ ���(2~5��)
		2 X 1 = 2	3 X 1 = 3	...		5 X 1 = 5
		2 X 2 = 4	3 X 2 = 6	...		5 X 2 = 10
		...
		2 X 9 = 18	3 X 9 = 27	...		5 X 9 = 45
		*/
		for (int i = 1 ; i <= 10 ; i++ ) {
			for (int j = 2 ; j < 5 ; j++) {
				System.out.print(j + " X " + i + " = " + i * j + (i * j < 10 ? "  " : "  "));
			}
			System.out.println();
		}

		// 100������ �ڿ����� �� 2�� 7�� ������� ������ ���
		int sum = 0;	// ������� �� ����ġ�� ������ ����
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("2�� 7�� ������� ���� : " + sum);

		//������ �� 2,4,6�ܸ� ����ϸ鼭 2���� 2x2, 4���� 4x4, 6x6������ ���(���η� ���)

		for (int i = 2; i <7 ; i += 2) {
			for (int j = 1 ; j <= 10 ; j++) {
				System.out.println (i + "X" + j + " = " + i * j);
				if (i == j) break;
				{
				}
			}
		}
	}		
}
