class MethodReturn3 {
	public static void main(String[] args) {
		char grade = getGrade(78);
		System.out.println("학점은 ' " + grade + " '학점입니다. ");

		// 5와 7의 최소 공배수를 구하는 메소드
		int num = getNumber();
		System.out.println("5와 7의 최소 공배수 : " + num);
	}
	public static int getNumber1() {
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 5 == 0 && i % 7 ==0) {
				return i;
			}
		}
				
	}
		return -1;	
		// 루프문 자체에 들어가기 위한 조건이 있으므로 조건에 위배되면 아예 return이 안될수도 있기 때문에
		// 루프문에서 return할 경우 반드시 루프문 밖에서 return을 한번 더 해줘야 함


	public static char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60)	{
			return 'D';
		} else {
			return 'F';
		}
	}//
	}
}
