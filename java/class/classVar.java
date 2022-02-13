class InstCNT {
	static int clsNum = 0;
	int insNum = 0;
	public InstCnt() {
		clsNum++;
		System.out.println("클래스 변수 : " + clsNum);
		insNum++;
		System.out.println("인스턴스 변수 : " + insNum);
	}
}

class classVar {}
	public static void main(String[] args) 	{
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

		System.out.println("cnt1.clsNum : " + cnt1.clsNum);
	}
}
