class Exam {
	public static void main(String[] args) {
		//int score = 88;
		 // score의 점수가 70이상이면 'C', 80이상이면 'B', 90이상이면 'A', 60이상이면 'D', 60미만이면 'F'
		 // switch문을 이용하여 작업
		//switch (num) {
			//case 1 :
				//num >= 90;
				//System.out.println("A");		break;
			//case 2:
				//num >= 80;
				//System.out.println("B");		break;
			//case 3:
				//num >= 70;
				//System.out.println("C");		break;
			//case 4:
				//num >= 60;
				//System.out.println("D");		break;
		//	default:
				//System.out.println("F");		break;
	//	}







		int num = 8;
		 //num에 들어있는 숫자값을 이용하여 세가지 종류의 작업을 실행하는 switch문 작성
		switch (num) {
			case 0:
				System.out.println("num변수의 값은 0이다");		break;
			case 1:
				System.out.println("num변수의 값은 1이다");		break;
			case 2:
				System.out.println("num변수의 값은 2이다");		break;
			case 3:
				System.out.println("num변수의 값은 3이다");		break;
			case 4:
				System.out.println("num변수의 값은 4이다");		break;
			case 5:
				System.out.println("num변수의 값은 5이다");		break;
			case 6:
				System.out.println("num변수의 값은 6이다");		break;
			case 7:
				System.out.println("num변수의 값은 7이다");		break;
			case 8:
				System.out.println("num변수의 값은 8이다");		break;
			case 9:
				System.out.println("num변수의 값은 9이다");		break;
		}

		switch (num) {
			case 1: case 2: case 3:	
				System.out.println("초반이다");	break;
			case 4: case 5: case 6:
				System.out.println("중반이다");	break;
			case 7: case 8: case 9:
				System.out.println("말이다");	break;
			}
		
		switch (num) {
			case 1: case 3: case 5:	case 7: case 9:
				System.out.println("num의 변수값은 홀수다");	break;
			case 2: case 4: case 6: case 8:
				System.out.println("num의 변수값은 짝수다");	break;
			default:
				System.out.println("num의 변수값은 홀수도 짝수도 아니다");	break;
			}
	







		
		//SwitchEx.java 파일에 있는 모든 switch문을 if문으로 변경

		int num = 2;
		if (num < 5) {
				System.out.println("5미만");
				} else {
				System.out.println("5초과"); 
					}
		
		char c1 = 'b';
		if (c1 == 'a') {
				System.out.println(c1 + "은 a입니다.");
		} else if (c1 == 'b') {
			System.out.println(c1 + "은 b입니다.");
		} else if (c1 == 'c') {
			System.out.println(c1 + "은 c입니다.");
		} else {
			System.out.println("모릅니다.");
		}

		// jdk 1.7부터 문자열도 사용가능
		int score = bb;
		if (score > cc) {
				System.out.println("평균 이상입니다.");
		} else {
				System.out.println("평균 이하입니다.");
		}
	}
}
	

