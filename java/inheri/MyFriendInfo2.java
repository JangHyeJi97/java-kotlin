import java.util.*;

class Friend {
// 친구들의 기본정보(이름, 전화, 주소)들을 저장할 클래스
	String name, phone, addr;
	// 친구들의 기본정보들을 저장할 멤버변수들
	public Friend(String name, String phone, String addr) {
	// Friend클래스의 생성자로 받아온 매개변수들을 멤버변수들에 저장(하나의 인스턴스를 생성할 때 친구 기본정보가 저장됨)
		this.name = name;	this.phone = phone;		this.addr = addr;
	}
	public void showAllInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + addr);
	}
	public String getName() { return name; }
	// name멤버변수를 리턴하는 getter 메소드
}

class HighFriend extends Friend {
// 고교 친구를 저장할 클래스로 Friend를 상속받아 친구 기본정보를 가지게 됨
	String work;
	// 직업으로 고교친구에만 있는 정보를 저장할 멤버변수
	public HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);
		// 받아온 정보들 중 기본정보들을 인수로 하여 상위클래스인 Friend클래스의 생성자 호출
		this.work = work;
	}
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("직업 : " + work);
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
	}
}

class UnivFriend extends Friend {
// 대학 친구를 저장할 클래스로 Friend를 상속받아 친구 기본정보를 가지게 됨
	String major;
	// 전공으로 대학친구에만 있는 정보를 저장할 멤버변수
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		// 받아온 정보들 중 기본정보들을 인수로 하여 상위클래스인 Friend클래스의 생성자 호출
		this.major = major;
	}
	public void showAllInfo() {
		super.showAllInfo();
		System.out.println("전공 : " + major);
	}
	public void showBasicInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phone);
		System.out.println("전공 : " + major);
	}
}

class FriendHandler {
// Friend, HighFriend, UnivFriend 클래스들을 이용하여 실제 작업을 처리하는 클래스
	private Friend[] myFriends;
	// Friend형 인스턴스(하위클래스 포함)만 저장할 수 있는 배열 선언
	// Friend형으로 선언함으로써 Friend의 하위클래스인 HighFriend와 UnivFriend형 인스턴스도 저장가능
	private int numOfFriends;
	// myFriends 배열의 인덱스 번호이자 현재 저장된 친구 수를 의미하는 변수
	public FriendHandler(int num) {
		myFriends = new Friend[num];
		// 배열의 크기를 인수로 받아와 myFriends배열을 생성 - 지정된 크기만큼 친구정보를 저장할 수 있음
		numOfFriends = 0;
		// myFriends배열에 저장할 친구정보의 인덱스 번호이자 현재 저장된 친구 수를 의미하는 값
	}
	private void addFriendInfo(Friend fren) {
	// FriendHandler 클래스 내부에서만 사용하므로 외부에서 접근할 수 없게 private으로 선언함
	// myFriends 배열에 추가할 친구정보 인스턴스를 인수로 받아와 myFriends배열에 저장시키는 메소드
	// 매개변수가 Friend형인 이유는 HighFriend와 UnivFriend형 인스턴스 모두 받아야 하므로 두 클래스의 상위클래스형으로 선언
	// 매개변수가 Friend형이 아니면 모든 종류의 친구정보 만큼 addFriendInfo() 메소드를 각기 따로 만들어야 함
		myFriends[numOfFriends] = fren;
		// 받아온 친구정보 인스턴스를 myFriends배열에 저장
		numOfFriends++;
		// 다음 친구정보를 저장할 인덱스를 위해 1증가(현재 저장되어 있는 친구정보 인스턴스의 개수이기도 함)
	}
	public void addFriend(int choice) {
	// 사용자가 입력하는 친구정보를 받아 저장시키는 메소드
		String name, phone, addr, work, major;	// 친구정보를 저장할 변수들을 선언

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");		name = sc.nextLine();
		System.out.print("전화 : ");		phone = sc.nextLine();
		System.out.print("주소 : ");		addr = sc.nextLine();
		// 고교와 대학 친구 모두 필요로 하는 기본정보(Friend클래스의 멤버변수)들을 입력받음

		if (choice == 1) {	// 고교 친구 등록시
			System.out.print("직업 : ");	work = sc.nextLine();
			// 고교 친구 전용 정보 입력받음
			addFriendInfo(new HighFriend(name, phone, addr, work));
			// 이름없는 HighFriend형 인스턴스 생성 후 그 인스턴스를 인수로 하여 addFriendInfo() 메소드 호출
		} else {			// 대학 친구 등록시
			System.out.print("전공 : ");	major = sc.nextLine();
			addFriendInfo(new UnivFriend(name, phone, addr, major));
		}

		System.out.println("입력완료\n");
	}
	public void showAllInfo() {
	// 모든 친구들의 모든 정보를 보여주는 메소드
		for (int i = 0 ; i < numOfFriends ; i++) {
			myFriends[i].showAllInfo();
			// myFriends[i] : myFriends 배열의 i인덱스에 들어있는 Friend형 인스턴스
			// .showAllInfo() : 안에 있는 showAllInfo() 메소드 호출
			// showAllInfo() 메소드는 하위클래스(HighFriend,k UnivFriend)에서 오버라이딩 했기 때문에 
			// 상위클래스인 Friend가 아닌 하위클래스의 메소드가 실행됨
			System.out.println();
		}
	}
	public void showBasicInfo() {
	// 모든 친구들의 기본 정보를 보여주는 메소드
		for (int i = 0 ; i < numOfFriends ; i++) {
			if (myFriends[i] instanceof HighFriend) {
			// 배열의 i인덱스에 들어있는 인스턴스가 HighFriend형으로 형변환이 가능하면
				((HighFriend)myFriends[i]).showBasicInfo();
			} else {
				((UnivFriend)myFriends[i]).showBasicInfo();
			}
			System.out.println();
		}
	}
	public void searchFriend() {
	// 이름으로 친구정보를 검색하여 출력하는 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String keyword = sc.nextLine();		// 검색어(친구정보들 중 이름)

		for (int i = 0 ; i < numOfFriends ; i++) {
		// 저장된 친구정보들 만큼 루프를 돌면서 입력받은 검색어와 동일한 이름이 있는 검사 후 출력
		// 이름 : myFriends 배열안에 들어있는 인스턴스들의 name 멤버변수
			if (keyword.equals(myFriends[i].getName())) {
			// 검색어와 동일한 이름을 가진 인스턴스가 myFriends배열에 있으면
				myFriends[i].showAllInfo();
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}
}

class MyFriendInfo2 {
	public static void main(String[] args) {
		FriendHandler handler = new FriendHandler(10);
		// FriendHandler 형 인스턴스 handler를 선언 및 생성

		while (true) {	// 무한루프로서 계속 돌면서 프로그램 대기 상태를 유지
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교친구 저장");
			System.out.println("2. 대학친구 저장");
			System.out.println("3. 전체정보 출력");
			System.out.println("4. 기본정보 출력");
			System.out.println("5. 친구검색-이름");
// 검색할 이름 : ???
// 검색결과 출력 - showAllInfo()를 이용하여 검색된 친구의 정보를 보여줌
// 검색결과가 없으면 "검색결과가 없습니다." 메시지 출력
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			// 사용자가 입력한 메뉴번호를 choice변수에 저장

			switch (choice) {
				case 1: case 2:	// 사용자가 입력한 메뉴번호가 1이거나 2이면
					handler.addFriend(choice);	break;
					// 선택한 메뉴번호를 인수로 하여 handler인스턴스의 addFriend()메소드를 호출
				case 3:
					handler.showAllInfo();		break;
				case 4:
					handler.showBasicInfo();	break;
				case 5:
					handler.searchFriend();		break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
	}
}
