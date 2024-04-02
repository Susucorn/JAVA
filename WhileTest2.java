/*
 * 2024.04.02
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 알고싶은 단을 입력 받아 구구단을 출력하는 프로그램
 * 
 * 문제분석 : 사용자에게 정수를 입력받기 위해 Scanner 객체가 필요
 * 			곱하는 수는 1부터 9까지 1씩 증가함
 * 			곱셈의 결과는 단 * 수
 * 			구구단 곱셈의 과정이 하나씩 출력되어야 함 (반복문 안에 출력문 존재)
 * 
 * 알고리즘 : 1. 사용자에게 정수로 단을 입력받기
 * 			2. 곱하는 수는 1부터 -> 초깃값
 * 			3. 곱하는 수는 9까지 -> 조건문
 * 				3-1. 곱셈 출력 후
 * 				3-2. 곱하는 수 1씩 증가
 */

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 정수 입력받기
		System.out.println("단 입력 : ");
		int dan = stdIn.nextInt();
		
		// 곱하는 수 초깃값
		int su = 1;
		
		while (su <=9) {
			// 구구단 출력
			System.out.println(dan + " * " + su + " = " + (dan*su));
			
			// 증감식
			su++;
		}
	}

}
