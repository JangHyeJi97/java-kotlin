class MethodReturn2 {
	public static void main(String[] args) {
		divide(4, 2);	//2
		divide(0, 2);	//0
		divide(4, 0);	//
	}
	public static void divide(int n1, int n2) {
		if (n2 == 0){
			System.out.println("0으로는 나눌 수 없습니다.")
		}
	System.out.println("나눗셈 결과 : " + n1 / n2);
	}
}
