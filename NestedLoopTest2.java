/*
 * 2024.04.05
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 정수 입력하여 별 모양 출력하시
 * 		
 * 		정수 입력 : 5
 * 		*
 * 		**
 * 		***
 * 		****
 * 		*****
 */

import java.util.Scanner;

public class NestedLoopTest2 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 정수 입력받기
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// 세로
		for (int i = 1; i <= num; i++) {
			// 가로
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		// while 문
		int jul = 1;
		while (jul <= num) {
			int kan = 1;
			while (kan <= jul) {
				System.out.print("*");
				kan++;
			}
			System.out.println();
			jul++;
		}
		
	}

}
