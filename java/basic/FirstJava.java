/*
FirstJava.java 실행순서
c:\Users\8today3>d:						// d 드라이브로 이동
D:\cd jhj\java\babic					// .java 파일이 있는 곳으로 이동
D:\jhj\Java\basic>javac FirstJava.java	// FirstJava.java를 컴파일 해서 FirtstJava.class파일 생성
D:\jhj\Java\basic>java FirstJava		// 컴파일 하여 생성한 클래스 파일을 이용하여 실행시킴
Java를 자바라!!
*/

class FirstJava {
	public static void main(String[] args) {
		System.out.println("Java를 자바라!!");
		System.out.println("2 + 5 = " + 2 + 5);   // 2 + 5 = 25
		System.out.println("2 + 5 = " + (2 + 5));   // 2 + 5 = 7
		System.out.println(2 + 5 + " = 2 + 5");   // 7 = 2 + 5
		System.out.println(2 + " 2 + 5 " + 5);   // 2 2 + 5 5

	}
}
