class Computer {
// 일반적인 컴퓨터의 기능을 클래스로 구현해 놓은 것
	String owner;
	public Computer(String name) { owner = name; }
	public void calculate() { System.out.println("요청 사항을 처리합니다."); }
}

class Notebook extends Computer {	// Notebook is a Computer(Notebook은 일종의 Computer이다)
// Computer클래스를 상속받음으로써 Computer클래스의 기능(멤버)들을 기본적으로 갖추고 있는 Notebook클래스가 됨
	int battery;
	// Computer에는 없고, Notebook에만 있는 특성
	public Notebook(String name, int chag) {
		super(name);
		battery = chag;
	}
	public void charging() { battery += 5; }
	public void movingCal() {
		if (battery < 1) { System.out.println("충전이 필요합니다."); return; }
		System.out.print("이동하면서 ");
		calculate();
		battery--;
	}
}

class TabletNote extends Notebook {
// Computer를 상속받은 Notebook을 상속받았으므로 Computer와 Notebook 클래스의 기능들을 기본적으로 모두 갖추고 있게 됨
	String pen;
	public TabletNote(String name, int chag, String pen) {
		super(name, chag);
		this.pen = pen;
	}
	public void write(String penInfo) {
		if (battery < 1) { System.out.println("충전이 필요합니다."); return; }
		if (!pen.equals(penInfo)) { System.out.println("등록된 펜이 아닙니다."); return; }
		System.out.print("이동하면서 필기 내용과 ");
		calculate();
		battery--;
	}
}

class ISAInheritance {
	public static void main(String[] args) {
		Notebook nb = new Notebook("홍길동", 5);
		TabletNote tn = new TabletNote("전우치", 5, "ISE-123-456");

		nb.movingCal();
		tn.write("ISE-123-456");
	}
}
