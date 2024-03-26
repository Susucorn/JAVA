/*
 * 2024.03.26
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : switch ~ case문
 * 
 * 문제분석 : 입력받아야 할 값은 1~12 이다 --> 범위를 벗어난다면? 해당 월 없습니다 출력하기
 * 			-- switch ~ case문 사용
 */

import java.util.Scanner;

public class switchTest2 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.println("달(월) 입력(영문자) : ");
		
		// 1. 입력받은 문자열을 변수에 저장
		String month = stdIn.next();
		
		// 2. 출력할 문자열을 변수로 선언함
		String MtoS;
		
		// switch ~ case --> 입력받은 month 변수를 기준으로
		switch (month)
		{
			// 봄
			case "March" : case "April" : case "May" :
				MtoS = "봄 입니다.";
				break;
				
			// 여름
			case "June" : case "July" : case "August" :
				MtoS = "여름 입니다.";
				break;
				
			// 가을 --> break문이 없다면 전부 출력
			case "September" : 
				System.out.print("멋진 9월과 ");
				
			case "October" : 
				System.out.print("아름다운 10월과 ");
				
			case "November" :
				System.out.print("낙엽의 11월은 ");
				MtoS = "가을 입니다.";
				break;
				
			// 겨울
			case "Desember" : case "January" : case "Febuary" :
				MtoS = "겨울 입니다.";
				break;
			
			// 예외의 값이라면...
			default :
				MtoS = "벗어난 달(월)이거나 잘못 입력하셨습니다.";
				break;
		}
		
		System.out.println("입력하신 달(월)은 " + MtoS);

	}

}
