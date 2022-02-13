/* ��� �Ǹ� �� ���� ���α׷�
����Ǹ��� : class FruitSeller
 - ������ �� ��(�������, ������) : �����������, �������(������),�����
 - ������ �� ���(�޼ҵ�) : �Ǹ�(), ����Ȳ����()

��������� : class FruitBuyer : ��������� ��, ������ ��� ����
 - ������ �� ���(�޼ҵ�) : ����(), ����Ȳ����()

���α׷����� : FruitSalesMain1
 - �Ǹ��ڿ� �������� �ν��Ͻ��� �����Ͽ� ��� �Ǹ� �� ���Ÿ� ��Ű�� ��Ȳ�� ��
*/ 

class FruitSeller { // ����Ǹ��� Ŭ����
	int numOfApple = 20;	// �����������
	int myMoney = 0;		// �����
	final int APPLE_PRICE = 1000;	// �������
	public int saleApple(int money) { 
	// ����ǸŸ޼ҵ�(�����ڿ��� ������� �޾� �׿� �ش��ϴ� ����� �����ϴ� �޼ҵ�)
		int num = money / APPLE_PRICE;	
		//�Ǹ��� ��������� ���ϴ� ������ �����ڰ� �� ����ŭ�� ��������� ���� 
		myMoney += money;	//�����ڰ� �� ����ŭ ������� ����
		numOfApple -= num;	//�Ǹ��� ���������ŭ �������� ����
		return num;			//�����ڿ��� ����� �ѱ� - saleApple()�޼ҵ带 ȣ���� ������ ����(return)
	}
	public void showSaleResult() { // �Ǹ� ��Ȳ ���� �޼ҵ�
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
		
	}
}

class FruitBuyer{ // ��������� Ŭ����
	int numOfApple = 0;		// ������ ��� ����
	int myMoney = 10000;	// ��� ������ ��
	public void buyApple(FruitSeller seller, int money){ 
	// ������� �޼ҵ� (Ư�� �Ǹ���(FruitSeller�� �ν��Ͻ�)���� ���ž��� �ǳ� �� ����� ����)
		numOfApple += seller.saleApple(money);
		// ����� ������ ��(money)�� �μ��� �Ͽ� seller�ν��Ͻ��� saleApple() �޼ҵ带 ȣ��
		// �Ǹ���(seller)���� 2000��(money)��ġ ��� �ּ���
		myMoney -= money;
		// ������ �����ݾ׿��� ����� ������ �ݾ׸�ŭ ���ҽ�Ŵ
	}
	public void showBuyResult() { //���� ��Ȳ ���� �޼ҵ�
		System.out.println("��� ���� : " + numOfApple);
		System.out.println("���� �ܾ� : " + myMoney);
	}
}

class FruitsalesMain1 {
	public static void main(String[] args) 	{
		FruitSeller seller = new FruitSeller();	//����Ǹ��� ��ü ����(line 13)
		// FruitSeller �� �ν��Ͻ� Seller �� ���� �� ����
		FruitBuyer buyer = new FruitBuyer();	//��������� ��ü ����(line 32)
		// FruitBuyer �� �ν��Ͻ� buyer �� ���� �� ����

		buyer.buyApple(seller, 2000);	//(line 35)
		//buyer �ν��Ͻ� �ȿ��ִ� buyApple()�޼ҵ� ȣ�� //(line17)
		//seller : ����� �����Ϸ��� �Ǹ��ڰ� �ʿ��ϹǷ� �Ǹ��� �ν��Ͻ��� seller�� ������
		// - seller��� �ν��Ͻ��� �μ��� ����ϸ� �ν��Ͻ��� ���� �ش��ϴ� �ּҰ��� ���纻�� ������
		// 2000 : ��� ������ ��

		System.out.println("��� �Ǹ��� ��Ȳ");
		seller.showSaleResult();	// (line 25)

		System.out.println("��� ������ ��Ȳ");
		buyer.showBuyResult();		// (line 43)
	}
}

/*
������
 - �Ǹ��ڳ� ������ �ν��Ͻ��� ���� �����ص� ��� ������ ��(�������)�� ������ ����

�ذ�å
 - �ν��Ͻ� ���� ��������� ���� �ٸ��� ������ �� �־�� ��
 */
