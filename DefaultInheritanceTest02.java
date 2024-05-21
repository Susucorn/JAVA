/*
 * 2024.05.21
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 상속과 생성자
 */

class DB1 {
	public double d1;
	
	// 묵시적 생성자
	public DB1() {
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
		d1 = 10*10;
	}
}

class DB2 extends DB1 {
	public double d2;
	
	// 묵시적 생성자
	public DB2() {
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
		d2 = 10*10*10;
	}
	
	// 명시적 생성자
	public DB2(double d) {
		System.out.println("클래스 DB2의 명시적 생성자 수행");
		d2 = d*d*d;
	}
}

// 하위 클래스에는 묵시적, 명시적 생성자가 다 존재함
// 명시적 생성자를 호출하면, 상위 클래스의 묵시적 생성자가 우선 수행된다.
class DB3 extends DB2 {
	public double d3;
	
	// 묵시적 생성자
	public DB3() {
		System.out.println("클래스 DB3의 묵시적 생성자 수행");
		d3 = 10*10*10*10;
	}
	
	// 명시적 생성자
	public DB3(double d) {
		System.out.println("클래스 DB3의 명시적 생성자 수행");
		d3 = d*d*d*d;
	}
}
public class DefaultInheritanceTest02 {

	public static void main(String[] args) {
		// 객체 생성
		DB3 db3 = new DB3(5);	// 매개변수에 값을 전달
		// 상속 관계에서는 묵시적 생성자가 우선 수행.
		System.out.println("10의 2제곱 : " + db3.d1);
		System.out.println("10의 3제곱 : " + db3.d2);
	}

}
