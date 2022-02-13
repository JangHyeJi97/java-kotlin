class Circle {
	double radius;
	public Circle(double r) {
		radius = r;
	}

	final double PI = 3.1415;
	
	public void setRadius(double r) { radius = r; }
	
	public double getArea() { return radius * radius * 2 * PI; } // ���� ����
	public double getPeri() {return radius * PI * 2;} // ���� �ѷ�
		
}

class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle (3.5); // �������� 3.5�� �� �ν��Ͻ� ����
		System.out.println("���� ���� : " + circle.getArea());
		System.out.println("���� �ѷ� : " + circle.getPeri());

		circle.setRadius(12.5);
			//�������� 12.5�� ����
		System.out.println("���� ���� : " + circle.getArea());
		System.out.println("���� �ѷ� : " + circle.getPeri());
	}
}
