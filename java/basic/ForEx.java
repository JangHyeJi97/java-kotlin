class ForEx {
	public static void main(String[] args) {
		for (int i = 0 ; i < 3 ; i++ ) 	{
			System.out.println("I like Java" + i);
		}

		int n = 1;
		System.out.print("n : ");
		for (; n <= 5 ; n += 2)	{
		// �ܺ� ���� ���� for���� ���� ������ ������ �� ���� 
			System.out.print(n + "  ");
		}	// n : 1 3 5
		System.out.println("\nn : " + n);

		int m;
		for (m = 1 ; m <= 5 ; m += 2) {
		// �ܺ� ���� ���� �ʱ�ȭ�� for�� �ȿ��� �����ص� ����
			System.out.print(m + "  ");
		}
		System.out.println("\nm : " + m);

		for (int i = 0, j = 10 ; i < 5 ; i++, j--) {
		// ��ǥ�� �����Ͽ� ���� ���� ������ ����� ���� ����
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}
		