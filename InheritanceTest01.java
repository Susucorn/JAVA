/*
 * 2024.05.21
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 상속과 한정자	
 */
// 클래스 A
class A {
	public int aa = 1;	// 모든 곳에서 접근 가능한 멤버변수
}

// 클래스 A를 상속받은 클래스
class B extends A {
	private int bb = 2;	// 클래스 내에서만 접근 가능한 멤버변수
	public int bb() {	// 모든 곳에서 접근 가능한 메소드
		return bb;		// 메소드를 통해 접근 불가능한 bb를 사용할 수 있음(외부에서 bb의 값을 변경 X)
	
		// B 클래스에는 aa, bb, bb()가 존재함 --> 상속 받았기 때문
	}
}

class C extends B {
	// C 클래스에는 aa, bb, bb()가 존재함 --> 상속 받았기 때문
	int cc = 3;		// 같은 패키지 내에서만 접근 가능한 멤버 변수 (접근 한정자 X)
}
public class InheritanceTest01 {

	public static void main(String[] args) {
		// 객체 생성
		C objC = new C();
		
		System.out.println("cc의 값은 ? " + objC.cc);
		// System.out.println("bb의 값은 ? " + objC.bb);		// 오류 발생, bb 객체 변수는 private로 선언
		System.out.println("bb의 값은 ? " + objC.bb());		// 메소드로 접근하여 bb 값 출력 가능
		System.out.println("aa의 값은 ? " + objC.aa);		// 메소드로 접근하여 bb 값 출력 가능
	}

}
