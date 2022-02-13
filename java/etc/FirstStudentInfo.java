/*1.콘솔창에서 메뉴를 보여주고, 메뉴번호를 입력받아 처리할 것
	 - 메뉴 : 1.정보입력 2.정보검색 3.전체정보 4.종료

  2.정보입력 및 저장 : 학번, 이름, 국어점수, 국사점수, 수학점수
	 - 받은 정보는 정보 저장용 클래스를 만들어 인스턴스로 배열에 저장

  3.정보검색 : 학번을 입력 받아 해당 정보 검색 후 정보 출력
  	 - 출력정보 예) 학번 : [1112023] / 이름 : [홍길동] / 각 과목별 점수 / 평균 : [평균점수]
	 - 전체정보 : 전체 학생의 정보를 '정보검색'의 출력 정보처럼 모두 보여주기
	 - 종료 : 프로그램 종료
*/

import java.util.*;

/*성적 관리 프로그램
1. 학번과 이름, 성적(국어점수, 국사점수, 수학점수)으로 분류 
	- 학번과 이름(학생정보)을 저장할 클래스 : Student
	- 성적을 저장할 클래스 : Grade
2. 학생 정보를 직접 입력하여 저장
	- 입력받은 정보를 저장시키는 클래스 또는 메소드 : ReportCardHandler(입력, 저장, 검색)
3. 저장된 학생 성적 중 원하는 학생의 성적 정보를 검색 : 검색기능 메소드
4. 프로그램 시작 및 제어 : FirstStudent
*/
class Student {
//학생들의 기본정보(학번, 이름)을 저장할 클래스
	String classOf, name;
	//학생들의 기본정보들을 저장할 멤버변수들
	public Student(String classOf, String name)	{
	//Student클래스의 생성자로 받아온 매개변수들을 멤버변수에 저장(하나의 인스턴스를 생성할때 친구 기본정보가 저장됨)
		this.classOf = classOf;	this.name = name;
	}
	public void showAllInfo(){
		System.out.println("학번 : " + classOf);
		System.out.println("이름 : " + name);
		//public void showBasicInfo(){}
		//하위클래스에서 오버라이딩 할 수 있도록 메소드에 내용은 없지만 정의해 놓음
	}
	public void showBasicInfo(){}
}

class Grade extends Student {
//학점을 저장할 클래스로 Student를 상속받아 학생 기본정보를 가지게 됨
	private String korean, history, math;
	//점수로 학점에만 있는 정보를 저장할 멤버변수
	public Grade(String classOf, String name) {
		super(classOf, name);
		//받아온 정보들 중 기본정보들을 인수로 하여 상위 클래스인 Student클래스의 생성자 호출
		this.korean = korean; this.history = history; this.math = math;
	}
	public void showAllInfo(){
		super.showAllInfo();
		System.out.println("국어 점수 : " + korean);
		System.out.println("국사 점수 : " + history);
		System.out.println("수학 점수 : " + math);
	}
	public void showBasicInfo(){
		System.out.println("학번 : " + classOf);
		System.out.println("이름 : " + name);
	}
}

class ReportCardHandler {
//Student, Grade 클래스를 이용하여 실제 작업을 처리하는 클래스
	private Student[] FirstStudents;
	// Student형 인스턴스(하위클래스 포함)만 저장할 수 있는 배열 선언
	// Student형으로 선언함으로써 Student의 하위 클래스인 Grade형 인스턴스도 저장가능
	private int numOfStudents;
	// FirstStudent 배열의 인덱스 번호이자 현재 저장된 학생 수를 의미하는 변수
	public ReportCardHandler(int num) {
		FirstStudents = new Student[num];
		//배열의 크기를 인수로 받아와 FirstStudentInfo배열을 생성 - 지정된 크기만큼 학생 정보를 저장할수 있음
		numOfStudents = 0;
		//FirstStudents배열에 저장할 친구정보의 인덱스 번호이자 현재 저장된 학생 수를 의미하는 값
	}
	private void addStudentInfo(Student student){
	//Student 클래스 내부에서만 사용하므로 외부에서 접근할 수 없게 private으로 선언함
	//FirstStudents 배열에 추가할 학생정보 인스턴스를 인수로 받아와 FirstStudents 배열에 저장시키는 메소드
	//매개변수가 Student형인 이유는 Grade형 인스턴스를 받아야 하므로 상위클래스형으로 선언
	//매개변수가 Student형이 아니면 모든 종류의 학생정보만큼 addStudentInfo() 메소드를 각기 따로 만들어야함
		FirstStudents[numOfStudents] = student;
		//받아온 학생정보 인스턴스를 FirstStudents 배열에 저장
		numOfStudents++;
		//다음 학생정보를 저장할 인덱스를 위해 1증가(현재 저장되어 있는 친구정보 인스턴스의 개수이기도 함)
	}
	public void addStudent(int choice){
	//사용자가 입력하는 학생정보를 받아 저장시키는 메소드
		String classOf, name, korean, history, math; //학생정보를 저장할 변수들을 선언

		Scanner sc = new Scanner(System.in);
		System.out.print("학번 : ");		classOf = sc.nextLine();
		System.out.print("이름 : ");		name = sc.nextLine();
		//성적을 나타내기 위한 학생기본정보(Student클래스의 멤버변수)들을 입력받음

		
		
		if (int = 1) {//성적 등록시
			System.out.println("국어 점수 : " + korean);		korean = sc.nextLine();
			System.out.println("국사 점수 : " + history);		history = sc.nextLine();
			System.out.println("수학 점수 : " + math);		math = sc.nextLine();
			//성적 정보 입력받음
			
			addStudentInfo(new Grade(classOf, name, korean, history, math));
			//이름없는 Grade형 인스턴스 생성후 그 인스턴스를 인수로 하여 addStudentInfo()메소드 호출
		}
		
		System.out.println("입력완료\n");
	}
	public void showAllInfo(){
	//모든 학생들의 모든 정보를 보여주는 메소드
	}
	public void showBasicInfo(){
	//모든 학생들의 기본정보를 보여주는 메소드
	}
}

class FirstStudentInfo {
	public static void main(String[] args) {
		ReportCardHandler handler = new ReportCardHandler(10);

		while (true) {	//무한 루프로서 계속 돌면서 프로그램 대기 상태를 유지
			System.out.println(".*.*.*메뉴 선택*.*.*.*");
			System.out.println("1. 정보 입력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 전체 정보");
			System.out.println("4. 프로그램 종료");
			System.out.println("메뉴선택 >> ");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			//사용자가 입력한 메뉴번호를 choice변수에 저장
			
			switch (choice) {
				case 1 :	case 2 : //사용자가 입력한 메뉴번호가 1이거나 2이면
					handler.addStudent(choice);	break;
					//선택한 메뉴 번호를 인수로 하여 handler 인스턴스의 addStudent()메소드를 호출
				case 3 : 
					handler.showAllInfo();		break;
				case 9 :
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
	}
}