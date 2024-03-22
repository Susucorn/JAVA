/*
 * 2024.03.19
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 이중 if
 * 		- 하나의 정수를 입력받아 양수인지 음수인지 확인하는 프로그램
 * 
 * 문제분석 : 양수는 0보다 큰 수  ==> num > 0
 * 			음수는 0보다 작은 수 ==> num < 0
 * 			정수를 입력받아 0보다 큰지 작은지 판단
 * 
 * 알고리즘 :	1. 키보드로부터 정수를 입력받기
 * 			2. 입력받은 정수가 0보다 작은지 판단하기
 * 				2-1. -00은 음수입니다 출력하기
 * 			3. 입력받은 정수가 0보다 큰지 판단하기
 * 				3-1. 00은 양수입니다 출력하기
 */

import java.util.Scanner;

public class DoubleIfTest1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.println("정수 입력 : ");
		
		// 1. 입력받은 정수를 변수에 저장
		int num = stdIn.nextInt();
		
		// 2. 음수인지 판단하기 --> 만약 입력받은 값이 0보다 작다면?
		if (num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
		
		// 3. 양수인지 판단하기 --> 만약 입력받은 값이 0보다 크다면?
		if (num > 0) {
			System.out.println(num + "은(는) 양수입니다.");
		}
		
		// ** 만약 정수가 0보다 작으면(기준) 그렇지않다면(크면)
		if (num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
		
		// 정수가 0보다 작은게 아니라면...
		else {
			System.out.println(num + "은(는) 양수입니다.");
		}
		
		// 조건과 상관없이 무조건 출력되는 문장
		System.out.println("----- 프로그램을 종료합니다.-----");
	}

}
