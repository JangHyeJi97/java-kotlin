class WhileDoEx {
	public static void main(String[] args) {
		int num = 1;
	while (num < 101) {
		System.out.println("I like Java" + num);
		num++;
		}

		//���� 1���� 100������ ���� while���� �̿��Ͽ� ���ѵ� ���
		num = 1;
		int sum = 0;	// ���� ����� �ݵ�� �ʱ�ȭ�� ����� ��
		while (num <= 100) 	{
			sum = sum + num;
			num++;
		}
		System.out.println("1���� 100������ �� : " + sum);		//5050
		System.out.println("num : " + 101);		//101

		num = 1;
		//num�� ���� 1,3,5,7,9�� ��µǰ� �۾�
		while (num < 10) {
				System.out.println("I like Java : " + num);
				num += 2;
		}

		System.out.println("num : " + num);
		do	{
			System.out.println("I like Java : " + num);
			num += 2;
		} while (num < 10);
		//num�� ���� do-while�� ���۽� 11�̾����� do-while���� Ư���� �� ���� �׳� �����Ŵ
		int i;
		sum = 0;
		for (i = 1 ; i < 101 ; i++) {
			sum += i;
		}
		System.out.println("1���� 100������ �� : " + sum);
	}
}
	
	
