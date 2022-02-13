class NumberEx1 {
	int num;
	public NumberEx1(){
		num = 10;
		System.out.println("생성자 호출!!");
	}
	public int getNumber(){return num;}
}

class ConstructorEX {
	public static void main(String[] args) 	{
		NumberEx1 num1 = new NumberEx1();
		System.out.println("num1 : " + num1.getNumber());
	}
}
