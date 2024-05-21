/*
 * 2024.05.21
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 클래스 변수와 클래스 메소드의 상속
 */
class C1 {
	// 클래스 변수
	private static int x = 100;
	public static int y = x;
	static int z = x;
	
	// 클래스 메소드
	public static int cc() {
		return x;
	}
}

class C2 extends C1 {
	public static String x;
	static int y;
	
	// 이 클래스에는 x, y, z, cc() 가 있음
	// x, y는 C2 클래스에 있는 클래스 변수 이다.
}
public class InheritanceTest03 {

	public static void main(String[] args) {
		// 클래스 변수와 클래스 메소드는 클래스 이름으로 바로 접근하기
		System.out.println("C1 클래스의 cc() 값 : " + C1.cc());
		System.out.println("C1 클래스의 y 값 : " + C1.y);
		System.out.println("C1 클래스의 z 값 : " + C1.z);
		
		System.out.println();
		
		System.out.println("C2 클래스의 x 값 : " + C2.x);	// 디폴트 값
		System.out.println("C2 클래스의 y 값 : " + C2.y);	// 디폴트 값
		System.out.println("C2 클래스의 z 값 : " + C2.z);	
		System.out.println("C2 클래스의 cc() 값 : " + C2.cc());
		
		C2.x = "오늘은 화요일 입니다.";
		C2.y = 200;
		C2.z = 300;		// C1.z = 300
		
		System.out.println();
		System.out.println("C2 클래스의 x 값 : " + C2.x);
		System.out.println("C2 클래스의 y 값 : " + C2.y);
		System.out.println("C2 클래스의 z 값 : " + C2.z);
	}

}
