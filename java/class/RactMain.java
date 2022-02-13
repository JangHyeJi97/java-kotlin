/*
가로와 세로 정보를 저장할 수 있는 Ract 클래스 제작
1. 인스턴스 생성과 동시에 멤버변수들을 초기화 시킴
2. 가로와 세로 정보를 변경할 수있는 메소드 제작
3. 직사각형의 넓이와 둘레를 계산해서 리턴하는 메소드 제작
	- 가로 12, 세로 17인 직사각형 인스턴스 생성 후 넓이 출력
	- 가로를 9, 세로를 7로 변경한 후 둘레 출력
	*/

class Rect{
	private int width, height;
	public Rect(int w, int h) {//생성자
		width = w; height = h;
	//생성자에서 초기화하므로 인스턴스 생성과 동시에 초기화가 됨
	}
	public void setWidth(int w) {width = w;}
	public void setHeight(int h) {height = h;}
	public int getArea() {return width * height;}
	public int getPeri() {return (width + height) * 2;}
}


class RactMain {
	public static void main(String[] args) 	{
		Rect rect = new Rect(12, 17); // 가로 12, 세로 17인 직사각형 인스턴스 생성
		System.out.println("넓이 : " + rect.getArea());

		rect.setWidth(9);		rect.setHeight(7);
		//가로를 9, 세로를 7로 변경
		System.out.println("둘레 : " + rect.getPeri());

	}
}
