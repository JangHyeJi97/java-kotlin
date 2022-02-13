class BasicBox {
	public void basicWrap() { System.out.println("basic wrap"); }
}

class PaperBox extends BasicBox {
	public void paperWrap() { System.out.println("paper wrap"); }
}

class GoldBox extends PaperBox {
	public void goldWrap() { System.out.println("gold wrap"); }
}

class InstanceOf3 {
	public static void main(String[] args) {
		BasicBox box1 = new BasicBox();
		PaperBox box2 = new PaperBox();
		GoldBox box3 = new GoldBox();

		wrapBox(box1);		wrapBox(box2);		wrapBox(box3);
	}
	public static void wrapBox(Object box) {
	// 매개변수의 자료형이 Object이므로 모든 종류의 데이터를 매개변수로 받을 수 있음
		if (box instanceof GoldBox) {
			((GoldBox)box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox)box).paperWrap();
		} else {
			((BasicBox)box).basicWrap();
			// Object로 받았기 때문에 BasicBox가 아닌 Object클래스에서 basicWrap()메소드를 실행시키므로 
			// 실행전에 BasicBox클래스로 형변환을 해야 함
		}
	}
}
