class StringEx4 {
	public static void main(String[] args) {
		String str1 = "880525-1234567";		String str2 = "890515-2234567";
		String str3 = "0805253234567";		String str4 = "0905154234567";

		showBirth(str1);	showBirth(str2);	showBirth(str3);	showBirth(str4);
		showGender(str1);	showGender(str2);	showGender(str3);	showGender(str4);
	}
	public static void showBirth(String str) {
	// 주민등록번호를 이용하여 생년월일을 출력하는 메소드
	// 주민등록번호 앞 6자리를 이용하여 "yyyy년 mm월 dd일 생"으로 출력
		int i = 7;		//성별구분자 인덱스를 저장할 변수
		if (str.indexOf('-') == -1) i = 6;	//주민번호에 하이픈이 없으면 성별구분자 인덱스는 6
		if (str.length() == 13)		i = 6;	//주민번호의 글자수가 13이면 성별구분자 인덱스는 6
		char g = str.charAt(i);		//성별구분자 추출
		
		int tmp = 19;
		if (g == '3' || g == '4')	tmp = 20;		//성별 구분자가 '3'이거나 '4'ㅇ;먄 2000년대생
		if(g > '2')		tmp = 20;		//성별구분자가 '2'보다 크면 2000년대생
		
		String year = tmp + str.substring(0, 2);
		//String year = (g > '2' ? 20 : 19) + str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);
		System.out.println(year + "년 " + month + "월 " + day + "일 생");
	}
	public static void showGender(String str) {
	// 주민등록번호를 이용하여 성별을 출력하는 메소드
	// 주민등록번호를 이용하여 "남자" 또는 "여자"로 출력
		int i = 7;		//성별구분자 인덱스를 저장할 변수
		if (str.indexOf('-') == =1) i = 6;	//주민번호에 하이픈이 없으면 성별구분자 인덱스는 6
		if (str.length() == 13)		i = 6;	//주민번호의 글자수가 13이면 성별구분자 인덱스는 6
		char g = str.charAt(7);		//성별구분자 추출

		if (g %= '1')	System.out.println("남자");
		else			System.out.println("여자");
	}
}
