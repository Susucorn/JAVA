/*
 2024.03.15
 신라대학교 202395016 컴퓨터공학부 박수연
 설명 : 변수와 자료형
 */
public class VarDataType {

	public static void main(String[] args) {
		// 상수 선언 --> 값이 변하지 않는다 (모두 대문자로 만들기)
		final int MAX = 100;
		final double PI = 3.14;
		
		// PI = 3.141592; 		// 오류 발생 --> 상수는 한 번 값이 결정되면 변경할 수 없음
		
		int r = 5;
		double pi = 3.14159;
		String name = "박수연";	// 문자열 - 쌍따옴표
		char blood = 'A';		// 문자 - 작은따옴표
		
		// char blood1 = 'AB'; // 오류 발생 --> 문자는 1byte, 문자열로 저장하기
		
		// 원주율 출력
		System.out.println("원주율은 " + PI + " 입니다.");
		System.out.println("원주율은 " + pi + " 입니다.");
		System.out.println("\n");
		
		// 원의 넓이 계산하여 출력
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + r*r * PI + " 입니다.");
		System.out.println("반지름이 " + r + "인 원의 넓이는 "  + r*r * pi + " 입니다.");
		System.out.println("\n");
		
		// 원의 넓이를 계산한 결과를 변수에 저장한 후 출력하자
		double area = r * r * pi;		
		System.out.println("반지름이 " + r + "인 원의 넓이는 " + area + " 입니다.");
		System.out.println("\n");
		
		// printf로 출력하기
		area = r * r * PI;	// 앞에서 자료형 선언을 했으므로 생략 가능
		System.out.printf("반지름이 %d인 원의 넓이는 %f 입니다.\n", r, area);
	}
}
