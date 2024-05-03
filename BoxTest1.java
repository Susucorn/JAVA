/* 2024.05.03
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 클래스 변수
 */

// 외부 클래스
class Box1{
	// 클래스의 멤버 변수
	int width, height,depth;
	long idNum;
	static long boxId = 0;	// 클래스 변수
	
	// 생성자 (멤버 변수의 초깃값 지정)
	public Box1() {
		idNum = ++ boxId;
	}
}
public class BoxTest1 {

	public static void main(String[] args) {
		// 객체 생성
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		Box1 mybox3 = new Box1();
		Box1 mybox4 = new Box1();
		
		System.out.println("mybox1의 id 번호 : " + mybox1.idNum); // 1
		System.out.println("mybox2의 id 번호 : " + mybox1.idNum); // 2
		System.out.println("mybox3의 id 번호 : " + mybox1.idNum); // 3
		
		System.out.println("mybox4의 id 번호 : " + mybox1.boxId); // 4
		// 이 코드의 경고? boxId는 클래스 변수, 오류는 아니지만 클래스 변수는 --> 클래스명.클래스 변수 형태로 접근하자
		
		// 클래스명으로 출력
		System.out.println("mybox4의 id 번호 : " + Box1.boxId); // 4
	}

}
