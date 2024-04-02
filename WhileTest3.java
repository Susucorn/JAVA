/*
 * 2024.04.02
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 정수를 입력받아 정수의 팩토리얼 값을 출력하는 프로그램
 * 
 * 문제분석 : 사용자에게 정수를 입력받기 위한 Scanner 객체 필요
 * 			팩토리얼 --> 입력받은 수가 3이라면... 3! = 3 * 2 * 1
 * 			입력받은 수 부터 1까지 곱함, 1씩 감소
 * 
 * 알고리즘 :	1. 사용자에게 정수 입력받기
 * 			2. 입력받은 수부터 -> 초깃값
 * 			3. 1까지 -> 조건식
 * 				3-1. 곱셈 출력
 * 				3-2. 입력받은 수 1씩 감소
 */

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 정수 입력받기
		System.out.println("팩토리얼 값 입력 : ");
		int fac = stdIn.nextInt();
		
		// 팩토리얼 계산을 위한 초깃값 1 
		int result = 1;
		
		while (fac >= 1) {
			// 팩토리얼 값을 담음, 3을 입력했다면 (3*1) * (2*1) * (1*1)
			result = fac * result;
			
			// 증감식
			fac--;
		}
		
		System.out.println("팩토리얼 값 : " + result);
	}

}
