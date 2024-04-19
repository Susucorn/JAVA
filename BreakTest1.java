/*
 * 2024.04.12
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 1부터 입력받은 수까지의 합을 구하는 프로그램
 * 
 * 문제분석 : 사용자에게 정수를 입력받기 위해 Scanner 객체가 필요
 * 			1부터 입력받은 수 까지 1씩 증가함
 * 			1+2+3+4+5+..... 입력받은 수까지 누적의 값을 담는다
 * 			누적의 값을 담을 변수 0으로 초기화
 * 			무한 반복 안에 제어문 존재
 * 
 * 알고리즘 : 1. 사용자에게 정수 입력받기
 * 			2. 변수 선언 및 초기화
 * 			3. 무한반복
 * 				3-1. if 입력받은 수보다 크다면 break
 * 				3-2. 누적의 합 구하기
 * 				3-3. 1씩 증가
 * 
 * 			--> 만약 순서가 바뀐다면? 누적의 합, 증감식, 탈출 조건식 (O)
 */

import java.util.Scanner;

public class BreakTest1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 정수 입력받기
		System.out.print("정수 입력 : ");
		int inputNum = stdIn.nextInt();
		
		// 변수 초기화
		int num = 1, result = 0;
		
		while (true) {
			// 무한 반복 탈출 조건
			if (num > inputNum) break;
			
			// 누적의 합
			result += num;
			
			// 증감식
			num++;
		}
		
		System.out.println("합 : " + result);
	}

}
