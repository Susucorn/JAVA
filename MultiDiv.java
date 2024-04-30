/*
 * 2024.04.30
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 곱하기, 나누기를 계산하는 기능이 있다
 * 		 그리고 더하기, 빼기를 계산하는 기능도 있다
 */

// PlusMinus 클래스로 부터 상속 받는다
// PlusMinus 클래스의 메소드(기능)들을 다 물려받았으며, 추가로 곱하기 나누기 계산까지 하는 기능을 추가한다
public class MultiDiv extends PlusMinus {
	// 속성 정의
	int multi;
	double div;
	
	// multi 메소드(기능) 정의
	public String multi(int x, int y) {
		multi = x*y;
		return " 두 수의 곱은 " + multi;
	}
	
	// div 메소드(기능) 정의
	// private --> 외부에서 접근할 수 없음. 캡슐화
	private String div(int x, int y) {
		div = x/y;
		return " 두 수의 나눗셈은 " + div;
	}
}
