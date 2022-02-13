class Circle {
	double radius;
	public Circle(double r) {
		radius = r;
	}

	final double PI = 3.1415;
	
	public void setRadius(double r) { radius = r; }
	
	public double getArea() { return radius * radius * 2 * PI; } // 원의 넓이
	public double getPeri() {return radius * PI * 2;} // 원의 둘레
		
}

class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle (3.5); // 반지름이 3.5인 원 인스턴스 생성
		System.out.println("원의 넓이 : " + circle.getArea());
		System.out.println("원의 둘레 : " + circle.getPeri());

		circle.setRadius(12.5);
			//반지름을 12.5로 변경
		System.out.println("원의 넓이 : " + circle.getArea());
		System.out.println("원의 둘레 : " + circle.getPeri());
	}
}
