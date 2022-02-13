class FruitSeller { 
	private int numOfApple;	
	private int myMoney;		
	private final int APPLE_PRICE;

	public FruitSeller (int num, int money, int price){
		numOfApple = num;
		myMoney = money;
		APPLE_PRICE = price;
	}
	public int saleApple(int money) { 
		int num = money / APPLE_PRICE;	
		myMoney += money;	
		numOfApple -= num;	
		return num;			
	}
	public void showSaleResult() { 
		System.out.println("보유 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer{ 
	private int numOfApple;
	private int myMoney; 

	public FruitBuyer(int num, int money){
		numOfApple = num;
		myMoney = money;
	}
		
	public void buyApple(FruitSeller seller, int money){ 
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		}
	public void showBuyResult() { 
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitsalesMain5 {
	public static void main(String[] args) 	{
		FruitSeller seller1 = new FruitSeller(30, 0, 1500);
		FruitSeller seller2 = new FruitSeller(20, 0, 1000);
		FruitBuyer buyer = new FruitBuyer(0, 10000);
		
		
		buyer.buyApple(seller1, 4500);	
		buyer.buyApple(seller2, 2000);

		System.out.println("사과 판매자1 현황");
		seller1.showSaleResult();

		System.out.println("사과 판매자2 현황");
		seller2.showSaleResult();
		
		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();		
	}
}


/*
문제점
 - 상수였던 APPLE_PRICE가 변수로 변경됨
 - 인스턴스 생성시 두 개의 명령이 필요
 - initMember() 메소드를 언제든지 호출할 수 있음 (다시 호출되면 판매기록이 리셋됨)

해결책
 - APPLE_PRICE를 상수로 지정
 - 인스턴스 생성시 하나의 명령으로 처리
 - 초기화 메소드는 한 번만 호출되게 함(APPLE_PRICE를 상수로 지정할수 있게 됨)
 - 모든 문자는 생성자를 사용하면 사라짐
 */