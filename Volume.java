/*
 * 2024.05.10
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 클래스 기능
 */

import java.util.Scanner;

// 박스의 부피 계산하는 클래스
class Box {
	int width, height, depth;	// 멤버 변수(객체 변수), 클래스 전역 변수
	
	// 생성자 생성, 매개변수 3개 --> 3개의 값을 전달 받아 각 변수에 저장함
	public Box(int w, int h, int d) {
		width = w;	// 매개 변수 값을 객체 변수에 저장
		height = h;
		depth = d;
	}
	
	// 매개변수가 없는 생성자(묵시적 생성자)
	public Box() {
		width = 10;
		height = 20;
		depth = 30;
	}
	
	// 이 클래스의 두 개의 생성자의 이름이 동일함 --> 생성자 오버로딩 (같은 이름의 생성자가 클래스 내에 여러 개 있음)
}
public class Volume {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("가로 길이 : ");
		int w = stdIn.nextInt();
		
		System.out.print("높이 길이 : ");
		int h = stdIn.nextInt();
		
		System.out.print("깊이 길이 : ");
		int d = stdIn.nextInt();

		// 생성자가 있는 클래스로부터 객체를 생성하는 경우? --> 생성자의 매개변수 형과 개수가 일치해야 함
		Box mybox1 = new Box(w, h, d);	// 매개 변수 3개인 생성자 호출
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("입력 받은 값으로 박스의 부피를 구한다면 : " + vol);
		
		Box mybox2 = new Box();			// 매개 변수 없는 생성자 호출
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("정해진 값으로 박스의 부피를 구한다면 : " + vol);
	}

}
