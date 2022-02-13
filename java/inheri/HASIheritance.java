class Gun {
	int bullet;
	public Gun(int num) { bullet = num; }
	public void shot() {
		System.out.println("BBANG!!");
		bullet--;
	}
}

class Police extends Gun {	// Police has a Gun(Police는 Gun을 소유한다는 관계 성립)
// 모든 Police가 Gun을 소유해야만 성립하는 관계가 됨
// 만약 Gun을 소유하지 않는 Police가 있다면 그 Police의 인스턴스는 생성할 수가 없음
	int handcuff;
	public Police(int num, int bcuff) {
		super(num);
		handcuff = bcuff;
	}
	public void putHandcuff() {
		System.out.println("SNAP!!");
		handcuff--;
	}
}

class HASInheritance {
	public static void main(String[] args) {
		Police pman = new Police(5, 3);
		pman.shot();
		pman.putHandcuff();
	}
}
