class BufferBuiler {
	public static void main(String[] args) 	{
		String str = "AB"; //String형 인스턴스 str1을 생성
		StringBuilder sb = new StringBuilder //String형 인스턴스 str1을 생성
		System.out.println(sb); // AB

		sb.append(25);					System.out.println(sb); // AB25
		sb.append('Y').append(true);	System.out.println(sb); // AB25true

		sb.insert(2,false);				System.out.println(sb); // AB25
		sb.insetr(sb.length(), 'z');						System.out.println(sb); // AB25true


		sb.delete(3,6);		System.out.println(sb); // AB25true
		sb.deleteCharAt(5);		System.out.println(sb); // AB25true

		
		sb.setCharAt(3,'K');		System.out.println(sb); // AB25true
		sb.reverse();		System.out.println(sb); // AB25true

	
			String str2 = new String(sb);
			//문자열 변경이 끝난 StringBuilder형 인스턴스 sb를 String 인스턴스로 생성
			System.out.println(sb); // 
	}
}
