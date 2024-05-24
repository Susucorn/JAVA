/*
 * 설명 : super 예약어
 */

// 상위 클래스
class ST2a{
	// 멤버 변수
	int x = 1000;
	
	// 메서드
	void display() {
		System.out.println("상위 클래스 메서드");
	}
}

// 상속받은 클래스
class ST2b extends ST2a {
	int x = 2000;
	
	// 오버라이딩 한 메서드
	@Override
	void display() {
		System.out.println("하위 클래스 메서드");
	}
	
	// 메서드를 호출하는 동작 수행하는 메서드
	void write () {
		display();			// 같은 클래스 내의 메서드 호출
		super.display();	// 상위 클래스의 메서드 호출
		
		System.out.println("b 클래스의 x 값 : " + x);
		System.out.println("a 클래스의 x 값 : " + super.x);
	}
	
}
public class SuperTest02 {

	public static void main(String[] args) {
		// 객체 생성
		ST2b stb = new ST2b();
		stb.write(); // 메서드 호출

	}

}
