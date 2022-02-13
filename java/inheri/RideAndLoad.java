class Aa {
	public void testA() { System.out.println("Aa's test"); }
	public void rideMethod() { System.out.println("Aa's method"); }
	public void loadMethod() { System.out.println("void method"); }
}

class Bb extends Aa {
	public void testB() { System.out.println("Bb's test"); }
	public void rideMethod() { System.out.println("Bb's method"); }				// 오버라이딩
	public void loadMethod(int n) { System.out.println("int method"); }			// 오버로딩
}

class Cc extends Bb {
	public void testC() { System.out.println("Cc's test"); }
	public void rideMethod() { System.out.println("Cc's method"); }				// 오버라이딩
	public void loadMethod(double n) { System.out.println("double method"); }	// 오버로딩
}

class RideAndLoad {
	public static void main(String[] args) {
		Aa ref1 = new Cc();		Bb ref2 = new Cc();		Cc ref3 = new Cc();
		// 상위클래스로 선언한 후 하위클래스로 인스턴스를 생성할 수 있음
		// JVM에선 실제 인스턴스의 자료형인 하위클래스가 아닌 선언한 상위클래스의자료형으로 인식하여 상위클래스의 메소드들만 사용가능
		// 단, 오버라이딩된 메소드에 한해서는 하위클래스의 메소드가 실행됨

		/*
		ref1.testA() : 실행가능
		ref1.testB()와 ref1.testC() : 실행불가 - ref1이 Aa클래스형으로 JVM에 인식되므로 Aa클래스의 메소드들만 실행가능

		ref2.testA()와 ref2.testB() : 실행가능 - ref2가 Bb클래스형이므로 상속받은 Aa클래스의 메소드들도 실행가능
		ref2.testC() : 실행불가 - ref2가 Bb클래스형으로 JVM에 인식되므로 Aa클래스와 Bb클래스의 메소드들만 실행가능

		ref3 인스턴스로는 testA(), testB(), testC() 모두 실행가능
		*/

		ref1.rideMethod();		ref2.rideMethod();		ref3.rideMethod();
		// Cc's method			Cc's method				Cc's method
		// 상위클래스로 선언하고 하위클래스로 생성한 인스턴스로는 상위클래스의 메소드에만 접근이 가능하나 
		// 오버라이딩된 메소드에는 예외적으로 최하위클래스의 오버라이딩된 메소드가 실행됨

		ref3.loadMethod();		ref3.loadMethod(1);		ref3.loadMethod(3.14);
		// void method			int method				double method
		// 최하위클래스의 인스턴스에서는 상위클래스까지 포함하여 이름이 같은 오버로딩된 메소드들을 사용할 수 있음
	}
}
