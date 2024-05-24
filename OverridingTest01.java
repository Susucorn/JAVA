/*
 * 
 * 설명 : 상속과 오버라이딩 구분하기
 */

// 클래스
class OT1a{
	public void show(String str) {
		// 출력문만 수행함
		System.out.println("상위 클래스(OT1a) 메서드 show 수행 : " + str);
	}
}

// OT1a 클래스를 상속받은 클래스
class OT1b extends OT1a{
	
	// 매개 변수가 없는 메서드
	public void show() {
		System.out.println("하위 클래스(OT1b) 메서드 show 수행 : ");
	}
}
public class OverridingTest01 {

	public static void main(String[] args) {
		// 하위 클래스의 객체 생성
		OT1b otb = new OT1b();
		// 매개변수 있는 메서드 호출
		otb.show("처음 시작하는 자바");	// 상위 클래스에 상속되어 있으므로 상위 클래스의 메서드가 호출됨
		// 매개변수 없는 메서드 호출
		otb.show();					// 하위 클래스에 있는 메서드 호출됨
		
		// 이 작업은 오버라이딩이 아닌, 단순 상속임 ( 하위 클래스에는 매개 변수가 있는 메서드, 없는 메서드 2개가 있음 )
	}

}
