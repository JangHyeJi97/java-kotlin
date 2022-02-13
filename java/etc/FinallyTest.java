class FinallyTest {
	public static void main(String[] args) 	{
		boolean isDiv = divider(4, 2);
		if (isDiv)	System.out.println("연산 성공");
		else		System.out.println("연산 실패");
		
		isDiv = divider(4, 0);
		if (isDiv)	System.out.println("연산 성공");
		else		System.out.println("연산 실패");
	}
	//divider()메소드 작업(두 개의 정수를 받아 나눗셈을 하고 그 결과를 출력 후 true를 리턴)
	//예외 발생시 false를 리턴
	public static boolean divider(int n1, int n2) {
		try	{
			int result = n1 / n2;
			System.out.println("나눗셈 결과 : " + result);
			return true;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return false;
		} finally{
			System.out.println("finally 영역 실행");
		}
	}
}

	
