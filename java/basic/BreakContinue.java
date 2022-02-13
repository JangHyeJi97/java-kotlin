class BreakContinue {
	public static void main(String[] args) {
		// 100이하의 자연수 중 5와 7의 최소공배수를 구하여 출력 - while문을 이용
		int num = 1;

		while (num <= 100) {
			if (num % 5 == 0 && num % 7 == 0){
				break; // 현재 속해있는 루프문을 빠져나감
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수 : " + num);

		// 100이하의 자연수 중 5와 7의 공배수와 그 개수를 구하여 출력 - while문 이용

		num = 0;		// 100까지 루프를 돌릴 변수
		int count = 0;	// 5와 7이 공배수 개수를 저장할 변수

		while (num <= 100) {
			num++;
			if (num % 5 != 0 || num % 7 != 0) { // 5와 7의 공배수가 아니면
				continue; //아랫쪽 실행문들은 무시하고 조건절로 바로 올라감
			}

			count++;
			System.out.println("5와 7의 공배수 : " + num);

		}
		System.out.println("5와 7의 공배수 개수 : " + count);
	}
}
