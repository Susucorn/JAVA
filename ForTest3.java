/*
 * 2024.04.05
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 정수를 입력받아 그 수의 약수를 출력하는 프로그램
 * 
 * 문제분석 : 사용자에게 정수를 입력받기 위한 Scanner 객체 필요
 * 			약수 --> 나누었을 때 0이 되는 수들		ex) 6의 약수 --> 1, 2, 3, 6
 * 
 * 알고리즘 :	1. 사용자에게 정수 입력받기
 * 			2. 1부터 입력한 정수까지 반복하면서 1증가시킴
 * 				2-1. 만약 입력받은 수를 나누었을 때 나머지가 0이라면?
 * 						약수 출력
 */

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 정수 입력받기
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		System.out.print(num + "의 약수 : ");
		for (int i=1; i<=num; i++) {
			// 약수 조건
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n");
		
		// while 문
		int j=1;
		
		System.out.print(num + "의 약수 : ");
		
		while (j <= num) {
			if (num % j == 0) {
				System.out.print(j + " ");
			}
			j++;
		}

	}

}
