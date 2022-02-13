class MethodPrimeNumber {
	public static void main(String[] args) {
		/*
		1~100사이 정수들 중 소수를 구하여 출력
		단, 전달된 값이 소수인지 여부를 판단해 주는 메소드를 제작하여 작업
		1~100 까지 숫자중 2로 나누었을때 나온거 , 5 3
		*/ 
		for (int i = 1, j = 0 ; i <= 100 ; i++) {
			if(isPrime(i)) {
				System.out.print((i < 10 ? " " : "") + i + "  ");
				j++;
				if (j % 10 == 0)	System.out.println();
			}
		}
	}
	public static boolean isPrime(int n) {
	//받아온 정수가(n)가 소수인지 여부를 리턴하는 메소드
		if(n == 1 || (n != 2 && n % 2 == 0)) {
			//n의 값이 1이 아니거나 2가 아니면서 짝수인 경우는 소수가 아님
				return false;
		}
			for (int i = 2; i < n / 2 ; i++) {
				if (n % i == 0) return false; 
			}

			return true;
	}
}
