/*
 * 2024.05.07
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 원의 넓이를 구하기 위한 프로그램 작성
 * 			원의 특성을 나타내는 클래스 (SimpleCircle)를 정의하시오.
 * 			클래스 변수 PI를 이용하여 원의 넓이를 구하는 프로그램을 완성하시오.
 * 
 * 문제분석 : 원의 특성인 원주율 3.14를 선언하는 클래스 작성 ==>
 * 			3.14는 클래스 변수(static)로 선언 ==> 종단 변수(final)로 선언
 * 			반지름과 원주율을 가지고 원의 넓이를 계산한다
 * 			반지름은 사용자에게 입력받는다
 * 
 * [알고리즘]
 * 		1. 클래스 선언 (SimpleCircle)
 * 			1) 클래스 종단 변수인 (final) 원주율 PI 선언 --> 속성 정의
 * 		2. 메인 메소드가 있는 클래스 (CircleArea)
 * 			1) 반지름을 입력받는다
 * 			2) 원의 넓이를 구한다 ( 반지름*반지름*원주율 )
 * 				--> ** 클래스 변수로 선언했기 때문에 객체가 필요없음, 클래스명으로 바로 접근이 가능
 * 			3) 결과 출력
 */
import java.util.Scanner;

class SimpleCircle {
	// 클래스 종단 변수 선언
	// 공통으로 선언해야 할 변수를 클래스 종단 변수로 만듦
static final double PI = 3.14;
}

public class CircleArea {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 반지름 입력받기
		System.out.print("원의 반지름을 입력하세요 : ");
		int r = stdIn.nextInt();
		
		// 원의 넓이 계산
		double area = r*r*SimpleCircle.PI;
		
		// 출력
		System.out.println("반지름이 " + r + "인 원의 넓이 : " + area);

	}

}
