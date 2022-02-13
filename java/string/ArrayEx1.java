class ArrayEx1 {
	public static void main(String[] args) {
		int[] arrInt = new int[3];	// int형 데이터 3개를 저장할 수 있는 arrInt라는 배열 생성
		arrInt[0] = 10;	// arrInt배열의 0번 인덱스 칸에 10을 저장
		arrInt[1] = 20;
		arrInt[2] = 30;
		int sum = arrInt[0] + arrInt[1] + arrInt[2];
		System.out.println("sum : " + sum);

		String[] arrStr = new String[3];	// String형 데이터 3개를 저장할 수 있는 arrStr이라는 배열 생성
		arrStr[0] = "Java";
		arrStr[1] = "JSP";
		arrStr[2] = "Servlet";
		for (int i = 0 ; i < arrStr.length ; i++) {
		// length : 배열에서는 length가 메소드가 아닌 속성(field)으로 배열의 크기를 의미
			System.out.println(arrStr[i]);
		}

		// arrStr 배열에 들어있는 문자열의 첫번째 글자만 출력
		for (int i = 0 ; i < arrStr.length ; i++) {
			System.out.println(arrStr[i].charAt(0));
		}

		String str = "010-1234-5678";
		String[] arrPhone = str.split("-");
		// str의 문자열을 하이픈(-)을 기준으로 잘라서 String 배열로 생성
		for (int i = 0 ; i < arrPhone.length ; i++) {
			System.out.println(arrPhone[i]);
		}
	}
}
