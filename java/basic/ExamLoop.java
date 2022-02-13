class ExamLoop {
	public static void main(String[] args) {
		/* 구구단 출력(2~5단)
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

		// 100이하의 자연수들 중 2와 7의 공배수의 총합을 출력
		int sum = 0;	// 공배수의 합 누적치를 저장할 변수
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				sum += i;
			}
		}
		System.out.println("2와 7의 공배수의 총합 : " + sum);

		//구구단 중 2,4,6단만 출력하면서 2단은 2x2, 4단은 4x4, 6x6까지만 출력(세로로 출력)

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
