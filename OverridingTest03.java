/*
 * 설명 : 오버라이딩 주석 @Override
 * 			--> 오버라이딩 할 때 쓰면 유용한 주석, 이름과 매개변수가 같지 않은 경우? 경고 발생 시켜 알려줌
 * 		=> Source 클릭 ->Override/implement 클릭해서 오버라이딩 하고 싶은 클래스 클릭
 */

//OT3a 클래스
class OT3a{
	public void show(String str) {
		// 출력문만 수행함
		System.out.println("상위 클래스(OT3a) 메서드 show 수행 : " + str);
	}
}

//OT3b 클래스
class OT3b{
	@Override
	public void show(String str) {
		// super.show(str);	// 상위 클래스의 메소드로 접근할 때 사용
		System.out.println("하위 클래스(OT3b) 메서드 show 수행 : " + str);
	}
}
public class OverridingTest03 {

	public static void main(String[] args) {
		// 객체 생성
		OT3b otb = new OT3b();
		otb.show("오늘은 금요일");

	}

}
