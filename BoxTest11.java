/* 
 * 2024.05.17
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 메소드 오버로딩
 */
class Box11{
	// 객체 변수
	private int ivol;
	private int dvol;
	
	// 생성자 오버로딩 2개
	
	// 1번째 생성자
	public Box11 (int w, int h, int d) {
		volume(w, h, d);	// 정수형 매개변수 3개인 메소드 오버로딩
	}
	
	// 2번째 생성자
	public Box11 (double w, double h, double d) {
		volume(w, h, d);	// 실수형 매개변수 3개인 메소드 오버로딩
	}
	
	// 메소드 오버로딩 2개
	
	// 첫 번째 메소드
	private void volume (int w, int h, int d) {
		ivol = w * h * d;	// 정수형 타입 메소드 호출
	}
	
	// 두 번째 메소드
	private void volume (double w, double h, double d) {
		dvol = w * h * d;	// 실수형 타입 메소드 호출
	}
	
	// 타입이 맞는 메소드 호출
	public int get_ivol() {
		return ivol;
	}
	
	public double get_dvol() {
		return dvol;
	}
}
public class BoxTest11 {

	public static void main(String[] args) {
		// 객체 생성, 정수형 매개변수 3개인 생성자 호출
		Box11 mybox1 = new Box11(10, 20, 30);
		System.out.println("박스 부피 (정수형 매개 변수) : " + mybox1.get_ivol());
		
		mybox1 = new Box11(10.0, 20.0, 30.0);
		System.out.println("박스 부피 (실수형 매개 변수) : " + mybox1.get_dvol());
		
		mybox1 = new Box11(10, 20, 30.0);
		System.out.println("박스 부피 (정수형 실수형 섞인 매개 변수) : " + mybox1.get_dvol());
	}

}
