class StringEx5 {
	public static void main(String[] args) {
		// 1~1000사이의 정수중 8이 들어있는 숫자의 개수를 출력
		int count = 0;
		for (int i = 1 ; i <= 1000 ; i++ ) 	{
			String tmp = i + "";	// 정수 i를 문자열 인스턴스로 생성
			if (tmp.indexOf('8') >= 0)	count++;
		}
		System.out.println("8이 들어있는 숫자의 개수 : " + count);

		//1~1000 사이의 정수중 8의 개수는?
		count = 0;
		for (int i = 1 ; i <= 1000 ; i++ ) 	{
			String tmp = i + "";	//정수 i를 문자열 인스턴스로 생성
			for (int j = 0 ; j < tmp.length() ; j++ ) {
				//0번부터 문자열의 마지막 인덱스까지 루프를 돔
				if(tmp.charAt(j) == '8')	count++;
			}
		}
		System.out.println("8의 총 개수 : " + count);
	}
}
