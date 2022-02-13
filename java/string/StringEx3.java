class StringEx3 {
	public static void main(String[] args) 	{
		String str1 = "test@abc.com";	String str2 = "testabc.com";
		String str3 = "test@abccom";	String str4 = "test.abc@com";

		isEmail(str1);	isEmail(str2);	isEmail(str3);	isEmail(str4);
		
	}
	public static void isEmail(String email) {
	/* 받아온 email을 검사하여 이메일 주소가 맞는지 출력
	1. 반드시 '@'가 있어야 함 : indexOf()로 -1이 아닌지 여부
	2. 반드시 '.'이 있어야 함 : indexOf()로 -1이 아닌지 여부
	3. 반드시 '@'가 '.'보다 앞에 있어야 함 : indexOf()로 위치값 비교
	*/	
		int at = email.indexOf('@');	//email에서 @의 위치 인덱스
		int dot = email.indexOf('.');	//emial에서 .의 위치 인덱스

		if(at == -1) {
			System.out.println(email + "은(는) 이메일 주소가 아닙니다.");	
		} else if(dot == -1)	{
			System.out.println(email + "은(는) 이메일 주소가 아닙니다.");	
		} else if(at > dot) {
			System.out.println(email + "은(는) 이메일 주소가 아닙니다.");	
		} else {System.out.println(email + "은(는) 이메일 주소가 맞습니다.");			
			
		}

	//String ext = email.substring('@' + 1);	//file 문자열의 마지막 점의 위치 다음 글자부터 끝까지 잘라옴
	//double dot = email.lastIndexOf('.');		//file문자열에서 마지막 점의 위치를 dot에 저장
	

		/*if (str1.equals(str1))	System.out.println(str1 + "은(는) 이메일 주소가 맞습니다.");	
		else							System.out.println(str1 + "은(는) 이메일 주소가 아닙니다.");
		if (str2.equals(str2))	System.out.println(str2 + "은(는) 이메일 주소가 맞습니다.");	
		else							System.out.println(str2 + "은(는) 이메일 주소가 아닙니다.");
		if (str3.equals(str3))	System.out.println(str3 + "은(는) 이메일 주소가 맞습니다.");	
		else							System.out.println(str3 + "은(는) 이메일 주소가 아닙니다.");
		if (str4.equals(str4))	System.out.println(str4 + "은(는) 이메일 주소가 맞습니다.");	
		else							System.out.println(str4 + "은(는) 이메일 주소가 아닙니다.");
*/
		
	//if(ext.equals("test@abc.com") || ext.equals("testabc.com") || ext.equals("test@abccom") || ext.equals("test.abc@com")){
			//System.out.println(email + "은(는) 이메일 주소가 맞습니다.");			
		//} else {
			//System.out.println(email + "은(는) 이메일 주소가 아닙니다.");	
		//}
	}

}
