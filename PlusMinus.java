/*
 * 2024.04.30
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : PlusMinus 클래스 생성하기
 * 		 더하기, 빼기 계산하는 기능이 있다
 */
public class PlusMinus {
	// 속성 정의 (어떤 속성을 가지고 있는가)
	int plus, minus;	// 변수 선언
	
	// 기능(메소드 -- 어떤 일을 하는가)
	
	// Plus 기능 --> 2개의 정수형 값을 전달 받아 합계를 구한 값을 돌려주는 일을 함
	public String plus(int x, int y) {
		plus = x+y;
		return " 두 수의 합은 " + plus;
	}
	
	// Minus 기능 --> 2개의 정수형 값을 전달 받아 뺄셈을 구한 값을 돌려주는 일을 함
	public String minus(int x, int y) {
		minus = x-y;
		return " 두 수의 차는 " + minus;
	}
}
