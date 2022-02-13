class WhileDoEx {
	public static void main(String[] args) {
		int num = 1;
	while (num < 101) {
		System.out.println("I like Java" + num);
		num++;
		}

		//정수 1부터 100까지의 합을 while문을 이용하여 구한뒤 출력
		num = 1;
		int sum = 0;	// 누적 연산시 반드시 초기화를 해줘야 함
		while (num <= 100) 	{
			sum = sum + num;
			num++;
		}
		System.out.println("1부터 100까지의 합 : " + sum);		//5050
		System.out.println("num : " + 101);		//101

		num = 1;
		//num의 값이 1,3,5,7,9로 출력되게 작업
		while (num < 10) {
				System.out.println("I like Java : " + num);
				num += 2;
		}

		System.out.println("num : " + num);
		do	{
			System.out.println("I like Java : " + num);
			num += 2;
		} while (num < 10);
		//num의 값이 do-while문 시작시 11이었으나 do-while문의 특성상 한 번은 그냥 실행시킴
		int i;
		sum = 0;
		for (i = 1 ; i < 101 ; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}
}
	
	
