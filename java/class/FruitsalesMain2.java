class FruitSeller { 
	int numOfApple;	
	int myMoney;		
	int APPLE_PRICE;
	// 일반 메소드에서는 멤버 상수에 값을 지정할 수 없으므로 APPLE_PRICE를 상수로 선언할 수 없음
	// 일반 메소드는 다시 호출할 수 있으므로 상수의 값이 변경될까봐
	public void initMember(int num, int money, int price){
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
	public void showSaleResult() { // 판매 현황 보기 메소드
		System.out.println("보유 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer{ 
	int numOfApple = 0;		
	int myMoney = 10000;	
	public void buyApple(FruitSeller seller, int money){ 
		numOfApple += seller.saleApple(money);
		myMoney -= money;
		}
	public void showBuyResult() { 
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitsalesMain2 {
	public static void main(String[] args) 	{
		FruitSeller seller1 = new FruitSeller();
		// FruitSeller 형 인스턴스 seller1을 선언 및 생성
		seller1.initMember(30, 0, 1500);
		//seller1 인스턴스 안의 initMember() 메소드를 호출하여 멤버변수들의 값을 초기화
		
		FruitSeller seller2 = new FruitSeller();
		// FruitSeller 형 인스턴스 seller2을 선언 및 생성
		seller2.initMember(20, 0, 1000);
		//seller2 인스턴스 안의 initMember() 메소드를 호출하여 멤버변수들의 값을 초기화
		
		FruitBuyer buyer = new FruitBuyer();
		// FruitSeller 형 인스턴스 buyer를 선언 및 생성

		buyer.buyApple(seller1, 4500);	// seller1 판매자에게 4500원 어치 사과를 구매
		buyer.buyApple(seller2, 2000);	// seller2 판매자에게 2000원 어치 사과를 구매
		//	각기 다른 판매자에게 사과를 구매함

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
 - 모든 문자는
 */