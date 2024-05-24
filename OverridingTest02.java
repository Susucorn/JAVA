/*
 * 
 * 설명 : 오버라이딩 --> 상위 클래스의 메서드를 재정의 하는 것
 */

// 클래스
class OT2a{
	public void show(String str) {
		// 출력문만 수행함
		System.out.println("상위 클래스(OT1a) 메서드 show 수행 : " + str);
	}
}

// OT1a 클래스를 상속받은 클래스
class OT2b extends OT2a{
	
	// 오버라이딩 --> 상위 클래스의 메서드를 재정의
	// 메서드명 동일함, 매개변수의 타입과 개수가 동일함 (매개변수명은 달라도 됨)
	public void show(String s) {
		System.out.println("하위 클래스(OT1b) 메서드 show 수행 : " + s);
	}
}
public class OverridingTest02 {

	public static void main(String[] args) {
		// 하위 클래스로부터 객체 생성
		OT2b otb = new OT2b();
		// 상속 받더라도 "재정의"를 했기 때문에 하위 클래스의 메서드가 호출됨
		otb.show("쉽다..? 자바");
		
		// 상위 클래스로부터 객체 생성
		OT2a ota = new OT2a();
		otb.show("쉽지 않다... 자바");	// 상위 클래스의 메서드가 호출됨
		
		// 이 코드는 상위, 하위 클래스는 한정자가 모두 public
		// 하위 클래스의 한정자 범위가 더 커야함 ( 상위 < 하위 )
	}

}
