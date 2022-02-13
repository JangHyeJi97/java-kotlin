abstract class PersonalNumberStorage {
// 클래스 내부의 메소드들 중 하나 이상이 abstract 메소드이므로 클래스도 abstract로 선언됨
	public abstract void addPersonalInfo(String name, String pNum);
	public abstract String searchName(String pNum);
	// 메소드를 abstract로 선언하여 하위클래스에서 오버라이딩하게 함
}

class PersonalInfo {
// 개인정보를 저장하는 클래스 - 한 명의 이름과 번호를 저장
	private String name, number;
	public PersonalInfo(String name, String number) {
		this.name = name;	this.number = number;
	}
	String getName() { return name; }
	String getNumber() { return number; }
}

class PersonalNumberStorageImpl extends PersonalNumberStorage {
// abstract 클래스인 PersonalNumberStorage를 상속받았으므로 반드시 PersonalNumberStorage 클래스 안에 있는 
// abstract 메소드를 모두 오버라이딩하여 완성해야 함 - 안하면 현 클래스도 abstract로 선언해야 함

	PersonalInfo[] perArr;
	// 사람들의 개인정보를 담은 PersonalInfo형 인스턴스를 저장할 배열 선언
	int numOfPerInfo;
	// perArr 배열의 인덱스겸 현재 들어있는 데이터 개수를 저장할 변수

	public PersonalNumberStorageImpl(int sz) {
		perArr = new PersonalInfo[sz];
		numOfPerInfo = 0;
	}
	public void addPersonalInfo(String name, String pNum) {
	// 상위클래스인 PersonalNumberStorage 클래스의 abstract 메소드로 오버라이딩하여 완성해야 함
		perArr[numOfPerInfo] = new PersonalInfo(name, pNum);
		// 받아온 name과 pNum을 이용하여 PersonalInfo형 인스턴스를 생성한 후 perArr 배열에 저장
		numOfPerInfo++;
		// 현재 저장된 데이터 개수와 다음에 저장될 위치 인덱스를 위해 1증가
	}
	public String searchName(String pNum) {
	// 상위클래스인 PersonalNumberStorage 클래스의 abstract 메소드로 오버라이딩하여 완성해야 함
		for (int i = 0 ; i < numOfPerInfo ; i++) {
			if (pNum.equals(perArr[i].getNumber())) {
			// 인수로 받아온 번호(pNum)와 perArr배열의 i인덱스에 있는 인스턴스의 getNumber()메소드로 추출한 번호가 같으면
				return perArr[i].getName();
				// 해당 인스턴스에서 이름을 추출하여 리턴하고 메소드 종료
			}
		}
		return null;	// 검색결과가 없으면 null을 리턴
		// null은 비어있는 객체(인스턴스)를 의미하므로 리턴타입이 기본자료형만 아니면 어떤 리턴타입이라도 사용할 수 있음
	}
}

class AbstractInterface1 {
	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);

		storage.addPersonalInfo("홍길동", "950000-1234567");
		storage.addPersonalInfo("전우치", "970000-1234567");

		String result = storage.searchName("950000-1234567");
		if (result == null)		result = "검색 결과가 없음";
		System.out.println(result);

		result = storage.searchName("970000-1234567");
		if (result == null)		result = "검색 결과가 없음";
		System.out.println(result);

		result = storage.searchName("0000");
		if (result == null)		result = "검색 결과가 없음";
		System.out.println(result);
	}
}
