/*
 * 설명 : Object 클래스의 equals 메서드
 */
class Box11{
	public int width, height, depth;
	
	public void Box11(int w, int h, int d){
		this.width = w;
		this.height = h;
		this.depth = d;
	}
}
public class ObjectMethodTest02 {

	public static void main(String[] args) {
		// 객체 생성
		Box11 b1 = new Box11(10, 20, 30);
		Box11 b2 = new Box11(10, 20, 30);
		Box11 b3 = b2;	// 주소 공유
		
		System.out.println(b1.equals(b2)? "b1과 b2 같음" : "b1과 b2 다름");
		System.out.println(b2.equals(b3)? "b2과 b3 같음" : "b2과 b3 다름");
		
		String s1 = new String("처음 시작하는 자바");
		String s2 = new String("처음 시작하는 자바");
		// 매개변수의 값을 비교함, 주소는 다르지만 매개변수 값이 값으므로 같다 출력
		// 객체가 가진 문자열을 비교
		System.out.println(s1.equals(s2)? "s1과 s2 같음" : "s1과 s2 다름");
		System.out.println(s1==s2? "s1과 s2 같음" : "s1과 s2 다름");
	}

}
