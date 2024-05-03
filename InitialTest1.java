/*
 * 2024.05.03
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 클래스 모음
 */

// 외부 클래스
class Intial {
	// 멤버 변수
	int num;
	double rate;
	String name;
	int[] score;
	
	// 메소드
	public void aMethod() {
		int count = 0;
		System.out.println(num);
		System.out.println(count);
	}
}

// main 메서드가 있는 클래스
public class InitialTest1 {

	public static void main(String[] args) {
		int var1;
		double var2;
		
		// System.out.println(var1);
		// System.out.println(var2);	--> 오류 발생! 초깃값 없음
		
		// 객체 생성
		Intial ob1 = new Intial();
		
		// 클래스 객체로 호출하여 값을 출력하기
		System.out.println("객체 변수 num : " + ob1.num);
		System.out.println("객체 변수 rate : " + ob1.rate);
		System.out.println("객체 변수 name : " + ob1.name);
		System.out.println("객체 변수 score : " + ob1.score);
		
		ob1.aMethod();
	}

}
