/*
 * 2024.05.21
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 상속과 생성자
 */

class DA1 {
	public double d1;
	
	// 묵시적 생성자
	public DA1() {
		System.out.println("클래스 DA1의 묵시적 생성자 수행");
		d1 = 10*10;
	}
}

class DA2 extends DA1 {
	public double d2;
	
	// 묵시적 생성자
	public DA2() {
		System.out.println("클래스 DA2의 묵시적 생성자 수행");
		d2 = 10*10*10;
	}
	
	// d2, DA2(), d1을 가지고 있음
}

class DA3 extends DA2 {
	public double d3;
	
	// 묵시적 생성자
	public DA3() {
		System.out.println("클래스 DA3의 묵시적 생성자 수행");
		d3 = 10*10*10*10;
	}
	
	// d3, DA3(), d2, d1을 가지고 있음
	// 생성자는 상속되지 않는다.
}

public class DefaultInheritanceTest01 {

	public static void main(String[] args) {
		// 객체 생성
		DA3 da3 = new DA3();	// DA3의 묵시적 생성자가 수행이 된다
		// ** 상위 클래스의 묵시적 생성자가 우선 수행 된다.
		
		System.out.println("----------------------------------------------------");
		// 객체 생성
		DA2 da2 = new DA2();

	}

}
/*
	상속관계에서 하위 클래스에서 묵시적 생성자가 있는 경우,
	하위 클래스로부터 객체가 생성될 때 상위 클래스의 묵시적 생성자가 우선 수행된다.
*/