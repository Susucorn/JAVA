/*
 * 2024.04.05
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : do While문 활용
 * 
 * 문제분석 : 입력받아야 할 값은 1~12 이다 --> 범위를 벗어난다면? 해당 월 없습니다 출력하기
 * 			-- switch ~ case문 사용
 */

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		
		do {
			// 사용자에게 정수 입력받기 --> 최소 한 번은 동작해야 하는 것
			System.out.print("달(월)을 입력 (종료 0) : ");
			month = stdIn.nextInt();
			
			switch (month)
			{
				// 봄 --> if (month == 3 || month == 4 || month == 5)
				case 3: case 4: case 5:
					System.out.println("입력하신 달(월)은 봄 입니다.");
					break;	// switch문은 break를 꼭 적어줘야함 --> 그렇지 않으면 결과가 다 출력됨!
					
				// 여름
				case 6: case 7: case 8:
					System.out.println("입력하신 달(월)은 여름 입니다.");
					break;
					
				// 가을
				case 9: case 10: case 11:
					System.out.println("입력하신 달(월)은 가을 입니다.");
					break;
					
				// 겨울
				case 12: case 1: case 2:
					System.out.println("입력하신 달(월)은 겨울 입니다.");
					break;	
				
				// 종료
				case 0:
					System.out.print("시스템 종료");
					break;
				
				// 나머지 값이 들어온다면
				default:
					System.out.print("입력하신 달(월)은 없습니다.");
					break;
			}
		}while(month != 0);
	}
}
