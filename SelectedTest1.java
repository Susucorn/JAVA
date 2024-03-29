/*
 * 2024.03.26
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 세 자리의 십진수를 입력받아 각 자리의 숫자들이 짝수인지 홀수인지 판단하는 프로그램 작성하기
 * 
 * 문제분석 : 짝수 -> 2로 나눈 나머지가 0
 * 			홀수 -> 2로 나눈 나머지가 1
 * 			세 자리수 -> 100 ~ 999
 * 			ex ) 123 입력했을 때? 1은 홀수, 2는 짝수, 3은 홀수 입니다 출력
 * 					-> 100의 자리, 10의 자리, 1의 자리 구분하기
 * 
 * 알고리즘 : 1. 사용자로부터 세 자리수 입력받기
 * 			2. 입력받은 숫자가 세 자리 숫자인가?
 * 				2-1. 입력받은 세 자리수를 각가 100의 자리, 10의 자리, 1의 자리로 나누어 변수에 저장
 * 				2-2. num을 100으로 나눈 몫이 2로 나누었을 때 나머지가 0이라면?
 * 					-> 100의 자리 숫자는 짝수
 * 					그렇지 않으면
 * 					-> 홀수
 * 				2-3. num을 10으로 나눈 몫이 2로 나누었을 때 나머지가 0이라면?
 * 					-> 10의 자리 숫자는 짝수
 * 					그렇지 않으면
 * 					-> 홀수
 * 
 *   			2-4. num을 1으로 나눈 몫이 2로 나누었을 때 나머지가 0이라면?
 * 					-> 1의 자리 숫자는 짝수
 * 					그렇지 않으면
 * 					-> 홀수
 * 			3. 입력받은 숫자가 세 자리 숫자가 아니라면
 * 				-> 3자리 수 아닙니다 출력
 */

import java.util.Scanner;

public class SelectedTest1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.println("세 자리 수 입력 : ");
		int num = stdIn.nextInt();
		
		// 1. 세 자리 수가 맞는지 판단하기 -> 입력받은 정수가 100~999 범위에 있다면
		if (num >= 100 && num <= 999)
		{
			// 1-1. 각 자리수 저장
			int num100 = num/100;				// 100의 자리 
			int num10 = (num % 100) / 10; 		// 10의 자리
			int num1 = (num % 100) % 10;		// 1의 자리
			
			// 1-2. 각 자리 수가 홀수인지 짝수인지 판단
			
			// 100의 자리 판단
			if (num100 % 2 == 0)
			{
				System.out.println("입력하신 100의 자리 숫자는 짝수입니다.");
			}
			else
			{
				System.out.println("입력하신 100의 자리 숫자는 홀수입니다.");
			}
			
			// 10의 자리 판단
			if (num10 % 2 == 0)
			{
				System.out.println("입력하신 10의 자리 숫자는 짝수입니다.");
			}
			else
			{
				System.out.println("입력하신 10의 자리 숫자는 홀수입니다.");
			}
			
			// 1의 자리 판단
			if (num1 % 2 == 0)
			{
				System.out.println("입력하신 1의 자리 숫자는 짝수입니다.");
			}
			else
			{
				System.out.println("입력하신 1의 자리 숫자는 홀수입니다.");
			}
			
		}
		
		// 3.그렇지 않으면... --> 입력한 정수가 3자리 수가 아니라면
		else
		{
			System.out.println("입력하신 정수는 3자리 수가 아닙니다.");
		}

	}

}
