class MathEx {
	public static void main(String[] args) 	{
		System.out.println("¿øÁÖÀ² : " + Math.PI);	//¿øÁÖÀ² : 3.141592653589793
		System.out.println("5ÀÇ Á¦°ö±Ù : " + Math.sqrt(5));	//5ÀÇ Á¦°ö±Ù : 2.23606797749979
		System.out.println("·Î±× 25 : " + Math.log(25));		//·Î±× 25 : 3.2188758248682006
		System.out.println("2ÀÇ 4½Â : " + Math.pow(2, 4));	//2ÀÇ 4½Â : 16.0

		
		double rad = Math.toRadians(45);
		System.out.println("½ÎÀÎ 45 : " + Math.sin(rad));	//½ÎÀÎ 45 : 0.7071067811865475
		System.out.println("ÄÚ½ÎÀÎ 45 : " + Math.cos(rad));	//ÄÚ½ÎÀÎ 45 : 0.7071067811865476
		System.out.println("ÅºÁ¨Æ® 45 : " + Math.tan(rad));	//ÅºÁ¨Æ® 45 : 0.9999999999999999
	}
}