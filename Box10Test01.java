/*
 * 2024.05.14
 * 신라대학교 202395016 컴퓨터공학부 박수연	
 */
class Box10 {
	// 객체 변수(속성)
	private int width;
	private int height;
	private int depth;
	private int vol;
	private int idNum;
	
	// 클래스 변수
	private static int boxID = 0;
	
	// 생성자
	public Box10 (int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		
		volume(); // 메소드 호출
	}
	
	// 리턴값 X 메소드
	private void volume() {
		vol = width * height * depth;
	}
	
	// 리턴값 O 메소드
	public String getvolume() {
		return idNum + "번 박스의 부피 : " + vol;
	}
	
	// 클래스 메소드
	public static long getCurrentID() {
		// return idNum;	오류발생, idNum은 클래스 변수 (static)가 아니기 때문
		return boxID;
	}
}
public class Box10Test01 {

	public static void main(String[] args) {
		//객체 선언
		Box10 mybox1;
		
		// 반복문 사용하여 객체 생성하고 생성자 호출
		for (int i=1; i<=5; i++) {
			mybox1 = new Box10(i, i+1, i+2);
			System.out.println(mybox1.getvolume());
		}
		
		System.out.println("마지막 생성된 박스 번호는 " + Box10.getCurrentID());
		
		// 클래스 변수는 클래스 명으로 접근하는 게 원칙.
		// System.out.println(Box10.boxID);
		// 이 코드가 오류가 나는 이유? -> 클래스 변수이긴 하지만 private 접근 제한자가 있다
	}

}
