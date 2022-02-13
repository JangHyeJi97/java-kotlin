class ToStringEx {
	private String name, city;
	public ToStringEx(String name, String city) {
		this.name = name;	this.city = city;
	}
	public String toString() {
	// Object클래스의 메소드로 오버라이딩함
		return "이름 : " + name + ", 도시 : " + city;
	}
}

class ToStringMain {
	public static void main(String[] args) {
		ToStringEx ts1 = new ToStringEx("홍길동", "서울");
		System.out.println(ts1);	// ToStringEx@15db9742
		// 오버라이딩 후 : 이름 : 홍길동, 도시 : 서울

		ToStringEx ts2 = new ToStringEx("전우치", "부산");
		System.out.println(ts2);	// ToStringEx@6d06d69c
		// 오버라이딩 후 : 이름 : 전우치, 도시 : 부산
	}
}
