/*
 * 문제 :  Student_class 클래스를 작성한다.
 * 		이 클래스의 속성
 * 		private String name
 * 		private int studentId
 * 		private double grade
 * 		
 * 		요구 사항을 만족하는 생성자 작성
 * 		기본 생성자 : name --> 홍길동, student --> 0, grade --> 0.0으로 초기화
 * 		매개 변수가 있는 생성자 : 이름, 학생 ID, 학점을 입력받아 초기화
 * 
 * 		메소드 : printStudentInfo() --> 학생의 정보를 출력하는 동작 수행
 * 		----------------------------------------------------------------
 * 		Student 클래스
 * 		main 메소드 : Student_class로부터 객체를 두 개 생성하고, 각각의 정보를 출력하는 동작 수행
 * 		[출력 결과]
 * 		Name: 홍길동, Student ID: 0, 학점 : 0.0
 * 		Name: 박수연, Student ID: 202395016, 학점 : 3.8
 */

class Student_class{
	// 1. 속성 정의
	private String name;		// 이름
	private int studentId;		// 학번
	private double grade;		// 학점
	
	// 2. 생성자 
	
	// 1) 매개 변수가 없는 생성자 (기본 생성자, 매개변수 없는 객체 만들 시 호출되는 생성자)
	public Student_class(){
		this.name = "홍길동";		// 멤버변수의 name에 값을 담는다
		this.studentId = 0;		// 멤버변수의 studentId
		this.grade = 0.0;		// 멤버변수의 grade
		
		// 기본 세팅 된 학생 정보
	}
	
	// 2) 매개 변수가 있는 생성자 (생성자 오버로딩 --> 매개 변수의 개수, 타입이 달라야 한다)
	public Student_class(String name, int studentId, double grade) {
		this.name = name;
		this.studentId = studentId;
		this.grade = grade;
		// 학생 정보를 전달 받아 세팅함
	}
	
	// 3. 메서드
	// 결과 출력문이 메서드 내에 있으므로 void
	public void printStudentInfo() {
		System.out.println("Name : " + name + ", Student ID : " + studentId + ", 학점 : " + grade);
	}
}
public class Student {

	public static void main(String[] args) {
		// 1. 객체 생성
		// 생성자 두 개를 호출함, 매개변수 X 와 매개변수 O
		
		// 1) 매개변수 없는 생성자 호출
		Student_class s1 = new Student_class();
		s1.printStudentInfo();	// 메서드 호출
		
		// 매개변수 있는 생성자 호출
		Student_class s2 = new Student_class("박수연", 202395016, 3.8);	// 값을 전달, 매개 변수 개수와 타입 맞게 전달하기
		s2.printStudentInfo();	// 메서드 호출

	}

}
