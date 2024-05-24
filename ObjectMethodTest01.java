/*
 * 설명 : Object 클래스의 toString() 메서드
 * 			--> 객체의 문자열 표현을 반환하는 중요한 메서드
 * 			--> 객체를 문자열로 표현할 때 사용함
 * 
 * toString() 메소드를 제정의하여 사용
 */
class AAA1{
	// 멤버 변수
	public int a = 10;

	@Override
	public String toString() {
		// 재정의 하여 리턴값을 내가 만든 클래스의 속성을 출력함
		return "AAA 클래스 객체 속성 a의 값은 : " + a;
	}
	
}
public class ObjectMethodTest01 {

	public static void main(String[] args) {
		// 객체 생성
		AAA1 aa = new AAA1();
		
		// 두 가지 방법으로 출력한다
		System.out.println(aa.toString());
		System.out.println(aa);

	}

}
