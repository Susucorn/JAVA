/*
 * 2024.03.19
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : if, else if
 * 		- 점수 입력받아 학점을 출력하는 프로그램 작성하기
 * 
 * 문제분석 : 90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 				-> 점수는 정수로 입력받기
 * 		
 * 
 * 알고리즘 :	1. 키보드로부터 정수를 입력받기
 * 			2. 입력받은 점수가 90점 이상인가?
 * 				2-1. A학점 출력
 * 			3. 그렇지 않다면 점수가 80점 이상인가?
 * 				3-1. B학점 출력하기
 * 			4. 그렇지 않다면 점수가 70점 이상인가?
 * 				4-1. C학점 출력하기
 * 			5. 그렇지 않다면 점수가 60점 이상인가?
 *			    5-1. D학점 출력하기
 *			6. 그렇지 않다면 ... (나머지는)
 *				6-1. F학점 출력하기
 */

import java.util.Scanner;

public class MultiIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.println("점수 입력 : ");
		
		// 1. 입력받은 정수를 변수에 저장
		int num = stdIn.nextInt();
		
		// 2. 입력받은 점수가 90점 이상이고 100점 이하인가?
		if (num >= 90 && num <= 100) {
			System.out.println("A학점 입니다.");
		}
		
		// 3. 그렇지 않으면 입력받은 점수가 80점 이상, 90점 미만인가?
		else if (num >= 80 && num <= 89) {
			System.out.println("B학점 입니다.");
		}
		
		// 4. 그렇지 않으면 입력받은 점수가 70점 이상, 80점 미만인가?
		else if (num >= 70 && num <= 79) {
			System.out.println("C학점 입니다.");
		}
		
		// 5. 그렇지 않으면 입력받은 점수가 60점 이상, 70점 미만인가?
		else if (num >= 60 && num <= 69) {
			System.out.println("D학점 입니다.");
		}
		
		// 6. 그렇지 않으면 입력받은 점수가 0점 이상, 60점 미만인가?
		else if (num >= 0 && num <= 59) {
			System.out.println("D학점 입니다.");
		}
		
		// 그렇지 않다면...
		else {
			System.out.println("잘못된 점수 입력 입니다.");
		}
	}

}
