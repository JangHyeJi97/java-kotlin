class OperatorEx {
	public static void main(String[] args) {
		int n1 = 7, n2 = 3, n3;
		System.out.println("7 / 3 = " + (n1 / n2));		// 7 / 3 = 2
		System.out.println("7 % 3 = " + (n1 % n2));		// 7 % 3 = 1

		double d1 = 3.0;
		System.out.println("7 / 3.0 = " + (n1 / d1));	// 7 / 3.0 = 2.3333333333333335
		System.out.println("7 % 3.0 = " + (n1 % d1));	// 7 % 3.0 = 1.0
		// 산술연산에서 피연산자 중 하나라도 실수일 경우 결과값은 실수로 나옴
		// 실수의 나눗셈 연산은 정확한 결과값을 얻을 수 없으므로 BigDecimal클래스를 사용해야 함

		n1 = 5; 		n2 = ++n1; 		n3 = --n1;
		//prifix방식으로 증감연산자 사용(먼저 증감한 후 대입)
		System.out.println("n1 : " + n1 + ", n2 : " + n2 + ", n3 : " + n3);
		// n1 : 5, n2 : 6, n3 : 5

		n1 = 5; 		n2 = n1++; 		n3 = n1--;
		// postfix방식으로 증감연산자 사용(먼저 대입한 후 증감)
		System.out.println("n1 : " + n1 + ", n2 : " + n2 + ", n3 : " + n3);
		// n1 : 5, n2 : 5, n3 : 6
		// 증감연산자를 prefix나 postfix 방식으로 나누어 사용하는 것이 헷갈리면 증감과 사용 부분을 따로 작업함

		n1 = 0;		n2 = 0;
		boolean result;
		
		result = (n1 += 10) < 0 && (n2 += 10) > 0;
		// && 연산이므로 앞의 조건이 false이면 뒤의 조건에 상관없이 결과가 false이므로 뒷쪽 조건은 실행 안함
		System.out.println("result : " + result);	//result : false
		System.out.println("n1 : " + n1 + ", n2 : " + n2);	// n1 : 10, n2 : 0

		result = (n1 += 10) > 0 || (n2 += 10) > 0;
		// || 연산이므로 앞의 조건이 true이면 뒤의 조건에 상관없이 결과가 true이므로 뒷쪽 조건은 실행 안함
		System.out.println("result : " + result);	//result : true
		System.out.println("n1 : " + n1 + ", n2 : " + n2);	// n1 : 20, n2 : 0

		// 논리식 내부에서는 값을 변경하는 수식을 사용하지 않는 것이 좋다.
		n1 = 0;		n2 = 0;		
		n1 += 10;	n2 += 10;
		result = n1 < 0 && n2 > 0;
		System.out.println("result : " + result);	//result : false
		System.out.println("n1 : " + n1 + ", n2 : " + n2);	// n1 : 10, n2 : 10

		n1 += 0;		n2 += 10;		
		result = n1 > 0 || n2 > 0;
		System.out.println("result : " + result);	//result : true
		System.out.println("n1 : " + n1 + ", n2 : " + n2);	// n1 : 20, n2 : 20








		

		
	}
}
