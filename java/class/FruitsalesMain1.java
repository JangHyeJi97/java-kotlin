/* 사과 판매 및 구매 프로그램
사과판매자 : class FruitSeller
 - 가져야 할 값(멤버변수, 멤버상수) : 사과보유개수, 사과가격(정찰제),매출액
 - 가져야 할 기능(메소드) : 판매(), 현상황보기()

사과구매자 : class FruitBuyer : 사과구매할 돈, 구매한 사과 개수
 - 가져야 할 기능(메소드) : 구매(), 현상황보기()

프로그램제어 : FruitSalesMain1
 - 판매자와 구매자의 인스턴스를 생성하여 사과 판매 및 구매를 시키고 상황을 봄
*/ 

class FruitSeller { // 사과판매자 클래스
	int numOfApple = 20;	// 사과보유개수
	int myMoney = 0;		// 매출액
	final int APPLE_PRICE = 1000;	// 사과가격
	public int saleApple(int money) { 
	// 사과판매메소드(구매자에게 사과값을 받아 그에 해당하는 사과를 리턴하는 메소드)
		int num = money / APPLE_PRICE;	
		//판매할 사과개수를 구하는 식으로 구매자가 낸 돈만큼의 사과개수를 구함 
		myMoney += money;	//구매자가 낸 돈만큼 매출액이 증가
		numOfApple -= num;	//판매한 사과개수만큼 보유개수 감소
		return num;			//구매자에게 사과를 넘김 - saleApple()메소드를 호출한 곳으로 리턴(return)
	}
	public void showSaleResult() { // 판매 현황 보기 메소드
		System.out.println("보유 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
		
	}
}

class FruitBuyer{ // 사과구매자 클래스
	int numOfApple = 0;		// 구매한 사과 개수
	int myMoney = 10000;	// 사과 구매할 돈
	public void buyApple(FruitSeller seller, int money){ 
	// 사과구매 메소드 (특정 판매자(FruitSeller형 인스턴스)에게 구매액을 건넨 후 사과를 받음)
		numOfApple += seller.saleApple(money);
		// 사과를 구매할 돈(money)을 인수로 하여 seller인스턴스의 saleApple() 메소드를 호출
		// 판매자(seller)에게 2000원(money)어치 사과 주세요
		myMoney -= money;
		// 구매후 보유금액에서 사과를 구매한 금액만큼 감소시킴
	}
	public void showBuyResult() { //구매 현황 보기 메소드
		System.out.println("사과 개수 : " + numOfApple);
		System.out.println("현재 잔액 : " + myMoney);
	}
}

class FruitsalesMain1 {
	public static void main(String[] args) 	{
		FruitSeller seller = new FruitSeller();	//사과판매자 객체 생성(line 13)
		// FruitSeller 형 인스턴스 Seller 를 선언 및 생성
		FruitBuyer buyer = new FruitBuyer();	//사과구매자 객체 생성(line 32)
		// FruitBuyer 형 인스턴스 buyer 를 선언 및 생성

		buyer.buyApple(seller, 2000);	//(line 35)
		//buyer 인스턴스 안에있는 buyApple()메소드 호출 //(line17)
		//seller : 사과를 구매하려면 판매자가 필요하므로 판매자 인스턴스인 seller를 가져감
		// - seller라는 인스턴스를 인수로 사용하면 인스턴스의 값에 해당하는 주소값의 복사본을 가져감
		// 2000 : 사과 구매할 돈

		System.out.println("사과 판매자 현황");
		seller.showSaleResult();	// (line 25)

		System.out.println("사과 구매자 현황");
		buyer.showBuyResult();		// (line 43)
	}
}

/*
문제점
 - 판매자나 구매자 인스턴스를 여럿 생성해도 모두 동일한 값(멤버변수)을 가지고 있음

해결책
 - 인스턴스 별로 멤버변수의 값을 다르게 지정할 수 있어야 함
 */
