class ForEx {
	public static void main(String[] args) {
		for (int i = 0 ; i < 3 ; i++ ) 	{
			System.out.println("I like Java" + i);
		}

		int n = 1;
		System.out.print("n : ");
		for (; n <= 5 ; n += 2)	{
		// 외부 변수 사용시 for문의 변수 선언을 생략할 수 있음 
			System.out.print(n + "  ");
		}	// n : 1 3 5
		System.out.println("\nn : " + n);

		int m;
		for (m = 1 ; m <= 5 ; m += 2) {
		// 외부 변수 사용시 초기화만 for문 안에서 진행해도 무방
			System.out.print(m + "  ");
		}
		System.out.println("\nm : " + m);

		for (int i = 0, j = 10 ; i < 5 ; i++, j--) {
		// 쉼표로 구분하여 여러 개의 변수를 사용할 수도 있음
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}
		