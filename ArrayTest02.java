/*
 * 2024.04.16
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 배열에 저장된 값 중 최대값과 최소값 출력하는 프로그램
 * 
 * 최대값과 최소값은 ,,, 비교대상이 필요함
 * ex) {34, 23, 56, 12, 77}
 * 			--> 첫번째 값을 기준으로 차례대로 비교해나간다
 * 			--> 비교하여 큰 값은 max, 작은 값은 min 변수에 저장하기
 * 
 * 비교 대상인 0번지 값을 비교할 필요 없음 --> 반복은 1번지부터 하기
 */

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 배열 생성 및 초기화
		int num[] = {12, 65, 33, 72, 2, 39, 92, 77}; 
		
		// 비교 기준은 0번지 값
		int max = num[0];
		int min = num[0];
		
		int i;
		// 배열을 반복하면서 비교하여 최대값, 최소값 찾기
		
		// 최대값
		for (i=1; i<num.length; i++) {
			// 만약 num의 i번째 요소가 max보다 크다면 최대값
			if (num[i] > max) {
				max = num[i];
			}
			
			// 만약 num의 i번째 요소가 min보다 작다면 최소값
			if (num[i] < min) {
				min = num[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);	
		
		System.out.println();
		
		// 확장된 for문 활용
		max = num[0];
		min = num[0];
		
		// num 배열에 저장된 값을 차례대로 j에 저장하여 실행됨
		for (int j : num) {
			if (max < j) {
				max = j;
			}
			
			if (min > j) {
				min = j;
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
