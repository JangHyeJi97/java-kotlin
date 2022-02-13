class SimpleMath {
	public double add(double n1, double n2) { return n1 + n2;}
	public double mul(double n1, double n2) { return n1 * n2;}
}

class TriangleMath {
	public static double calTriArea(double bottom, double height) {
		SimpleMath sm = new SimpleMath();
		double result = sm.mul(bottom, height);
		result = result / 2;
		return result;
	}
}

class ClassMethod2 {
	public static void main(String[] args) 	{
		TriangleMath tm = new TriangleMath();
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : " + tm.calTriArea(12.5, 13.7));
	}
}
