/*
 * 2024.04.16
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 1차원 배열을 생성하고, 묵시적 초깃값을 출력
 * 			사용자로부터 값을 입력받아 배열에 저장하고, 합과 평균을 출력하는 프로그램
 * 
 */

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		int i, sum=0;
		double avg;
		
		// 배열 생성
		int num[] = new int[5];
		
		System.out.println("배열의 길이 : " + num.length);
		System.out.println("== 배열의 저장된 초깃값 ==");
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		System.out.println();
		
		System.out.println("===== 반복문 활용 =====");
		for (i=0; i<5; i++) {
			System.out.println((i+1) + "번째 요소 : " + num[i]);
		}
		
		System.out.println("\n");
		
		// 사용자로부터 값 입력받아 배열에 저장
		for (i=0; i<num.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			num[i] = stdIn.nextInt();
		}
		
		// 배열 요소 출력
		System.out.println("입력받은 요소 출력");
		for (i=0; i<num.length; i++) {
			System.out.println((i+1) + "번째 요소 : " + num[i]);
		}
		
		// 배열에 저장된 값들의 합과 총점 계산하여 출력
		for (i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("배열 요소들의 합 : " + sum);
		avg = (double)sum/num.length; 	// 형 변환하기
		System.out.println("배열 요소들의 평균 : " + avg);
	}

}
