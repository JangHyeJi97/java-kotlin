class TV {
	public void onTV() { System.out.println("영상 출력 중"); }
}

interface Computer {
	void dataReceive();
}

class ComputerImpl {
	public void dataReceive() { System.out.println("영상 데이터 수신 중"); }
}

class IPTV extends TV implements Computer {
	ComputerImpl com = new ComputerImpl();
	public void dataReceive() {
		com.dataReceive();
	}
	public void powerOn() {
		dataReceive();
		onTV();
	}
}

class MultiInheri1 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV();
		iptv.powerOn();

		TV tv = iptv;
		// IPTV의 상위클래스인 TV형 인스턴스에 IPTV의 인스턴스가 저장

		Computer com = iptv;
		// IPTV에서 구현한 Computer형 인스턴스에 IPTV의 인스턴스가 저장됨
		// Computer는 interface이지만 상위클래스인것 처럼 동작할 수도 있음
	}
}
