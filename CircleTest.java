/* 2024.06.04
 * 신라대학교 컴퓨터공학부 202395016 박수연
 * 
 * Shape 클래스를 작성하고, 이를 상속받은 Circle 클래스를 작성한다
 * [Shape 클래스]
 * 속성 - String color 속성
 * 생성자 - 속성을 변수로 지정(this)
 * 
 * [Circle 클래스] - Shape 클래스를 상속받음
 * 속성 - double radius
 * 생성자 - 속성을 변수로 지정(this)
 * 메소드 -  원의 면적과 둘레를 계산하는 기능
 * 
 * [main 메소드]
 * 사용자로부터 원의 반지름과 색상을 입력받아, 해당 원의 정보를 출력하는 프로그램을 작성한다
 */

import java.util.Scanner;

// Shape 클래스
class Shape {
	// 속성
	String color;
	
	// 기본 생성자
	public Shape(String color) {
		this.color = color;
		System.out.println("원의 색상 : " + color);
	}
}

// Circle 클래스
class Circle extends Shape {
	// 속성
	double radius;
	
	// 기본 생성자
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		areaRound();	// 메소드 호출
	}
	
	// 원의 면적과 둘레를 계산하는 메소드
	public void areaRound() {
		// 원의 면적
		double area = radius*radius*3.14;
		System.out.println("원의 면적 : " + area);
		
		// 원의 둘레
		double Round = 2*3.14*radius;
		System.out.println("원의 둘레 : " + Round);
	}
}

public class CircleTest {

	public static void main(String[] args) {
		// 객체 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 입력받기
		System.out.print("원의 색상을 입력하세요 : ");
		String color = stdIn.next();
				
		System.out.print("원의 반지름을 입력하세요 : ");
		double radius = stdIn.nextDouble();
		
		// 객체 생성하여 값을 넘겨줌
		Circle c = new Circle(color, radius);
	}

}
