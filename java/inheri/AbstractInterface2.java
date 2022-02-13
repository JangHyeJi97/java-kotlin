interface PersonalNumberStorage {
	void addPersonalInfo(String name, String pNum);
	String searchName(String pNum);
	// interface에서 선언하는 모든 메소드는 자동으로 public abstract로 선언됨
	// interface에서는 절대 구현된 메소드를 정의할 수 없고 무조건 public abstract로 메소드만 선언해야 함
}

class PersonalInfo {
	private String name, number;
	public PersonalInfo(String name, String number) {
		this.name = name;	this.number = number;
	}
	String getName() { return name; }
	String getNumber() { return number; }
}

class PersonalNumberStorageImpl implements PersonalNumberStorage {
// interface인 PersonalNumberStorage를 implements 했으므로 반드시 PersonalNumberStorage 안에 있는 
// 모든 abstract 메소드드르을 오버라이딩하여 완선해야 함 - 안할 경우 오류 발생
	PersonalInfo[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImpl(int sz) {
		perArr = new PersonalInfo[sz];
		numOfPerInfo = 0;
	}
	public void addPersonalInfo(String name, String pNum) {
	// interface에 있는 abstract메소드를 오버라이딩한 것으로 무조건 public으로 지정해야 함
		perArr[numOfPerInfo] = new PersonalInfo(name, pNum);
		numOfPerInfo++;
	}
	public String searchName(String pNum) {
	// interface에 있는 abstract메소드를 오버라이딩한 것으로 무조건 public으로 지정해야 함
		for (int i = 0 ; i < numOfPerInfo ; i++) {
			if (pNum.equals(perArr[i].getNumber())) {
				return perArr[i].getName();
			}
		}
		return null;
	}
}

class AbstractInterface2 {
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
