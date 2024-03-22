/*
 * 2024.03.19
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 단순 if
 * 		- 하나의 정수를 입력받아 홀수인지 짝수인지 확인하는 프로그램
 * 
 * 문제분석 : 홀수는 2로 나누었을 때 나머지가 1인 수 ==> num % 2 != 0
 * 			짝수는 2로 나누었을 때 나머지가 0인 수 ==> num % 2 == 0
 * 			정수를 입력받아 2로 나누었을 때 나머지가 0인가? 비교하고 판단
 * 				혹은 나머지가 1인가 or 나머지가 0이 아닌가? 비교하고 판단
 * 
 * 알고리즘 :	1. 키보드로부터 정수를 입력받기
 * 			2. 입력받은 정수가 짝수인가?
 * 				2-1. 00은 짝수입니다 출력하기
 * 			3. 그렇지 않다면
 * 				3-1 00은 홀수입니다 출력하기
 */

import java.util.Scanner;

public class DoubleIfTest2 {

	public static void main(String[] args) {
		// Scanner 객체 생성하기
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 가이드 하기
		System.out.println("정수 입력 : ");
		
		// 입력받은 정수를 num에 저장
		int num = stdIn.nextInt();
		
		// 입력받은 정수를 2로 나누었을 때 나머지가 0인가? --> 짝수인가?
		if (num % 2 == 0) {
			System.out.println("입력하신 " + num + "은 짝수입니다.");
		}
		
		// .. 나머지가 0이 아니라면
		else {
			System.out.println("입력하신 " + num + "은 홀수입니다.");
		}
	}
}
