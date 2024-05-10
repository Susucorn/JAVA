/*
 * 2024.05.10
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : this 키워드 : 객체 변수임을 알려주는 키워드
 */
class Box03 {
	int width, height, depth;	// 멤버 변수
	
	// 생성자
	public Box03 (int width, int height, int depth) {
		// this 키워드 : 현재 객체 변수를 의미
		// 객체 변수 width 에 매개 변수 width (객체 변수를 구분하기 위해 앞에 this 키워드 붙임)
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class ThisTest03 {

	public static void main(String[] args) {
		Box03 box = new Box03(1, 2, 3);
		System.out.println(box.width);
	}
	
}
