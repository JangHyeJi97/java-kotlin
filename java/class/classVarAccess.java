class Accessway {
	static int num = 0;
	Accessway() { incrCnt(); }
	public void incrCnt() { num++; }
}

class classVarAccess {
	public static void main(String[] args) 	{

		AccessWay.way = new AccessWay();
		way.num++;		//�ν��Ͻ��� ���� Ŭ���� ������ ���� ����
		AccessWay.num++;	//Ŭ������ ���� Ŭ���� ������ ���ٰ���
		System.out.println("num : " + AccessWay.num);
	}
}
