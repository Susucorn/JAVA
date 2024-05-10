/*
 * 2024.05.10
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 생성자 오버로딩		
 */
// 박스의 부피 계산하는 클래스
class Box5 {
	// 멤버 변수(객체 변수), 클래스 전역 변수
	int width, height, depth;		// 정수
	double dwidth, dheight, ddepth; // 실수
	
	// 정수형 매개 변수 3개인 생성자
	public Box5(int w, int h, int d) {
		width = 1;
		height = 2;
		depth = 3;
	}
	
	// 실수형 매개 변수 3개인 생성자
	public Box5(double w, double h, double d) {
		dwidth = 10.0;
		dheight = 20.0;
		ddepth = 30.0;
	}
	
	// 정수형 실수형 섞인 매개 변수 3개인 생성자
	public Box5(double w, double h, int d) {
		dwidth = 10;
		dheight = 20;
		ddepth = 30.0;
	}
}

public class BoxOverloading02 {

	public static void main(String[] args) {
		// 정수형 매개변수 3개인 생성자 호출
		Box5 box = new Box5(10, 20, 30);
		int vol = box.width * box.height * box.depth;
		System.out.println("박스의 부피 : " + vol);
		
		// 실수형 매개변수 3개인 생성자 호출
		box = new Box5(10.0, 20.0, 30.0);
		double dvo = box.dwidth * box.dheight * box.ddepth;		
		System.out.println("박스의 부피 : " + dvo);
		
		// 정수형 실수형 섞인 매개변수 3개인 생성자 호출
		box = new Box5(10, 20, 30.0);
		dvo = box.dwidth * box.dheight * box.ddepth;		
		System.out.println("박스의 부피 : " + dvo);
	}

}
