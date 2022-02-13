class Gun {
	int bullet;
	public Gun(int num) { bullet = num; }
	public void shot() {
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police {
	Gun pistol;	// Gun형 인스턴스 pistol을 선언 - 생성되지는 않음
	int handcuff;
	public Police(int num, int bcuff) {
		handcuff = bcuff;
		if (num > 0)	pistol = new Gun(num);
		// 총알이 있으면 총(Gun) 클래스의 인스턴스를 생성함(Gun을 가진 Police인스턴스 생성)
		else			pistol = null;
		// 총알이 없으면 총(Gun) 클래스의 인스턴스를 생성하지 않음(Gun을 가지지 않은 Police인스턴스 생성)
	}
	public void putHandcuff() {
		System.out.println("SNAP!!");
		handcuff--;
	}
	public void shot() {
		if (pistol == null)	System.out.println("총이 없는데요??");
		else				pistol.shot();
	}
}

class HASComposite {
	public static void main(String[] args) {
		Police pman1 = new Police(5, 3);
		pman1.shot();
		pman1.putHandcuff();

		Police pman2 = new Police(0, 3);
		pman2.shot();
	}
}
