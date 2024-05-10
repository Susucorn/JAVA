/*
 * 2024.05.10
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 생성자의 매개 변수 이름도 의미 있는 이름으로 짓자!
 */

class Box1 {
	int width, height, depth;	// 멤버 변수
	
	// 생성자
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = h;
	}
}
public class ThisTest01 {

	public static void main(String[] args) {
		Box1 box = new Box1(1, 2, 3);
		System.out.println(box.width);
	}

}
