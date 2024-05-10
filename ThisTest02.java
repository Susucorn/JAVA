/*
 * 2024.05.10
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : this 키워드 : 객체 변수임을 알려주는 키워드!
 * 			이 코드의 문제점은 ?
 */

class Box2 {
	int width, height, depth;	// 멤버 변수
	
	// 생성자
	public Box2 (int width, int height, int depth) {
		// 자신의 변수에 자신의 값을 저장하는 코드임, 생성자 메소드 내의 변수로만 취급되고 있음
		// 문제점 ? --> 객체 변수와 매개 변수 이름이 같음
		width = width;
		height = height;
		depth = depth;
	}
}
public class ThisTest02 {

	public static void main(String[] args) {
		Box2 box = new Box2(1, 2, 3);
		System.out.println(box.width);	// 묵시적 값 0이 출력됨, 2번 코드로 간다
	}
	
}
