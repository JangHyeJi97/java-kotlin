class VariableEx {
	public static void main(String[] args) {
		int num1 = 10;  // int형 변수 num1을 선언 및 생성한 후 10을 저장
		int num2 = 20, num3 = num1 + num2;
		// 같은 자료형의 변수일 경우 두 개 이상을 동시에 선언 및 생성할 수 있으며, 초기화도 가능
		System.out.println("num1 : " + num1 +", num2 : " + num2 + ", num3 : " + num3);
		// num1 : 10, num2 : 20, num3 : 30

		char c1 = 'a'; // char형이므로 작은 따옴표로 문자를 묶어서 저장
		char c2 = 65;  // char형 변수에 정수가 저장되면 저장된 정수에 해당하는 유니코드 문자로 변환됨
		System.out.println("c1 : " + c1 + ", c2 : " + c2);	// c1 : a, c2 : A

		long num4 = 10000000000L;
		// 정수형 리터럴 값을 사용시 int의 범위를 벗어나는 경우 접미사로 엘(L)을 붙여서 long형이라는 표시를 함
		// 접미사에 사용된 영문자 엘은 대소문자 구분이 없으나 보통 대문자를 사용함
		System.out.println("num4 : " + num4);  // num4 : 10000000000

		double d1 = 3.14;
		float f1 = 3.14F;
		// 실수의 기본 자료형은 double이므로 실수의 리터럴 값을 float에 넣으려면 접미사 에프(F)를 붙여야 함
		System.out.println("d1 : " + d1); // d1 : 3.14, f1 : 3.14

	}
}