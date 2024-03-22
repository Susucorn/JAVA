/*
 * 2024.03.19
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : if, else if
 * 		- 하나의 정수를 입력받아 양수인지, 음수인지, 0인지 확인하는 프로그램
 * 
 * 문제분석 : 양수는 0보다 큰 수  ==> num > 0
 * 			음수는 0보다 작은 수 ==> num < 0
 * 			0은 0이다 == > num == 0
 * 		
 * 
 * 알고리즘 :	1. 키보드로부터 정수를 입력받기
 * 			2. 입력받은 정수가 양수인가?
 * 				2-1. 양수입니다 출력하기
 * 			3. 그렇지 않다면 정수가 음수인가?
 * 				3-1 음수입니다 출력하기
 * 			4. 그렇지 않다면...
 * 				4-1. 0 입니다 출력하기
 */

import java.util.Scanner;

public class MultiIfTest1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.println("정수 입력 : ");
		
		// 1. 입력받은 정수를 변수에 저장
		int num = stdIn.nextInt();
		
		// 2. 양수인가?
		if (num > 0) {
			System.out.println("입력하신 숫자는 양수 입니다.");
		}
		// 3. 그렇지 않다면 음수인가?
		else if (num < 0) {
			System.out.println("입력하신 숫자는 음수 입니다.");
		}
		
		// 4. 그렇지 않다면... (0이다)
		else {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
	}

}
