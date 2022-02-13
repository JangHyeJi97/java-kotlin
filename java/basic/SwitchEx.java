class SwitchEx {
	public static void main(String[] args) {
		int num = 2;
		switch (num) {
			case 1:
				System.out.println("num변수의 값은 1");	break;
			case 2:
				System.out.println("num변수의 값은 2");	break;
			case 3:
				System.out.println("num변수의 값은 3");	break;
			default:
				System.out.println("num변수의 값은 몰라");
		}

		// num의 값이 1, 2, 3이면 "상" 4, 5, 6이면 "중" 7, 8, 9이면 "하"라고 출력
		switch (num) {
			case 1: case 2: case 3:	// num의 값이 1이거나 2이거나 3이면
				System.out.println("상");	break;
			case 4: case 5: case 6:
				System.out.println("중");	break;
			case 7: case 8: case 9:
				System.out.println("하");	break;
		}

		// jdk 1.7부터 문자열도 사용가능
		switch ("bb") {
			case "ab":
				System.out.println("값은 ab");	break;
			case "bb":
				System.out.println("값은 bb");	break;
			case "cb":
				System.out.println("값은 cb");	break;
		}
	}
}
