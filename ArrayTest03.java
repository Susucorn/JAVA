/*
 * 2024.04.16
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 1차원 배열에 정수 값을 저장하여 생성한다.
 * 		 사용자로부터 정수를 하나 입력받아 그 정수가 어디에 몇 개 있는지 출력하라
 * 		 입력한 값이 배열에 없다면 "입력한 값이 없습니다." 출력하라
 *	
 * 문제분석 : 간단하게 한 자리 숫자 15개를 가진 1차원 배열을 선언함
 * 			사용자에게 정수를 입력받기 위해 Scanner 객체 필요
 * 			개수를 셀 변수 하나가 필요함, count
 * 			사용자가 입력한 값을 배열 요소와 차례대로 비교한다
 * 				--> 값이 있다면 ? 어디 위치에 몇 개 입니다, count++
 * 				--> 개수를 세는 count 변수가 0이면? --> 입력받은 값이 배열 내에 없다
 * 
 * 알고리즘 : 1. 1차원 배열 선언, 개수를 셀 변수 count 선언
 * 			2. 사용자에게 정수 하나 입력받기
 * 			3. 배열 요소를 차례대로 반복
 * 				3-1. 만약 입력받은 값이 배열의 i번째와 같다면 
 * 					위치와 개수 출력
 * 					count 1씩 증가
 * 				3-2. 만약 count가 0이면
 * 					입력받은 값이 배열 내에 없다
 * 			4. 총 개수 출력
 */

import java.util.Scanner;

public class ArrayTest03 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 배열 생성 및 초기화
		int num[] = {5, 7, 1, 9, 4, 5, 5, 6, 3, 8, 8, 1, 6, 7, 5, 1}; 
		
		// 개수 출력
		int count = 0;
		
		// 사용자에게 정수 하나 입력받기
		System.out.print("정수 하나 입력 : ");
		int number = stdIn.nextInt();
		
		for (int i=0; i<num.length; i++) {
			// 만약 입력받은 값이 i번째 요소와 같다면
			if (number == num[i]) {
				System.out.println(i + "번지에 존재");
				count++;
			}
			
			// 만약 count가 0이면... (입력받은 값이 배열 내에 없다)
			if (count == 0) {
				System.out.println("입력하신 숫자는 배열 내에 없습니다.");
			}
		}
		
		System.out.println("총 개수 : " + count);
		

	}

}
