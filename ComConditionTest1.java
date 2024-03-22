/*
 * 2024.03.22
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 조건식 연습하기
 * 		  -- 월을 입력받아 해달 계절 출력하기
 * 			3, 4, 5 --> 봄
 * 			6, 7, 8 --> 여름
 * 			9, 10, 11 --> 가을
 * 			12, 1, 2 --> 겨울
 * 
 * 문제분석 : 입력받아야 할 값은 1~12 이다 --> 범위를 벗어난다면? 해당 월 없습니다 출력하기
 * 			-- 내포 if 활용하기
 * 
 * 알고리즘 : 1. 키보드로부터 정수 입력받기
 * 			2. 입력받은 값이 0~12 범위 안에 있는가?
 * 				1) 입력받은 값이 3 || 4 || 5 라면
 * 					봄 출력하기
 *  * 			2) 입력받은 값이 6 || 7 || 8 라면
 * 					여름 출력하기
 *  * 			3) 입력받은 값이 9 || 10 || 11 라면
 * 					봄 출력하기
 *  * 			4) 그렇지 않다면 ... --> 범위 내의 나머지 값이라면
 * 					겨울 출력하기
 * 			3. 그렇지 않으면 ... --> 0~12 범위에 없다면
 * 				1) 해당 월 없습니다 출력
 */

import java.util.Scanner;

public class ComConditionTest1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.println("달(월) 입력 : ");
		
		// 1. 입력받은 정수를 변수에 저장
		int month = stdIn.nextInt();
		
		// 2. 조건 --> 입력받은 정수가 0~12 내에 있는가?
		if (month >= 1 && month <= 12) {
			// 봄
			if (month == 3 || month == 4 || month == 5) {
				System.out.println("입력하신 달(월)은 봄 입니다.");
			}
			// 여름
			else if (month == 6 || month == 7 || month == 8) {
				System.out.println("입력하신 달(월)은 여름 입니다.");
			}
			// 가을
			else if (month == 9 || month == 10 || month == 11) {
				System.out.println("입력하신 달(월)은 가을 입니다.");
			}
			// 겨울
			else {
				System.out.println("입력하신 달(월)은 겨울 입니다.");
			}
		}
		
		// 3. 그렇지 않다면... --> 입력받은 정수가 0~12 내에 없다면
		else {
			System.out.println("입력하신 달(월)은 없거나 잘못 입력하셨습니다.");
		}

	}

}
