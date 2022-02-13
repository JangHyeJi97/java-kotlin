class Accessway {
	static int num = 0;
	Accessway() { incrCnt(); }
	public void incrCnt() { num++; }
}

class classVarAccess {
	public static void main(String[] args) 	{

		AccessWay.way = new AccessWay();
		way.num++;		//인스턴스를 통해 클래스 변수에 접근 가능
		AccessWay.num++;	//클래스를 통해 클래스 변수에 접근가능
		System.out.println("num : " + AccessWay.num);
	}
}
