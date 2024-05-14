/*
 * 2024.05.14
 * 신라대학교 202395016 컴퓨터공학부 박수연	
 */
class Box08 {
	// 접근 한정자가 없는 객체 변수(속성)
	int width;
	int height;
	int depth;
	
	// 생성자
	public Box08 (int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		
	}
	
	// 메소드
	int volume() {
		int vol = width*height*depth;
		return vol;
	}
}
public class Box8Test01 {

	public static void main(String[] args) {
		// 객체 생성과 동시에 생성자 호출
		Box08 mybox1 = new Box08(10, 20, 30);
		// 값 변경 가능 --> width에 접근 한정자 없기 때문
		mybox1.width = 20;		
		
		// 객체 이름으로 메소드 호출, 변수에 저장
		int vol1 = mybox1.volume();
		System.out.println("정수 박스의 부피 : " + vol1);
		
	}

}
