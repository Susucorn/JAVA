/*
 * 2024.05.07
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 두 개의 정수르 입력받아 두 수 사이의 모든 합과 짝수의 합, 홀수의 합을 출력하기
 * 			Sum 클래스는 멤버변수와 3개의 메소드로 구성된다.
 * 			각 메소드는 2개의 값을 전달받아 합을 걔산하고 그 값을 되돌려준다
 * 
 * 문제분석 : 3개의 메소드(기능) - 전체 합 계산, 짝수의 합, 홀수의 합
 * 			멤버변수(클래스 전체에서 쓸 수 있는 전역변수) - sum
 * 			각 메소드에 접근하여 합계를 계산하려면 반드시 객체를 생성해야 함
 * 			객체를 통해 각 메소드에 접근한다
 * 
 * [알고리즘]
 * 		1. 클래스 선언 (Sum)
 * 			1) 멤버변수 sum 선언
 * 			2) 전체 합계 계산하는 메소드 선언
 * 				2-1) 두 개의 매개변수를 전달받아 전체 합계 계산
 * 				2-2) 합계를 돌려줌 (돌려주는 값은 정수형)
 * 			3) 짝수 합계 계산하는 메소드 선언
 *  			3-1) 두 개의 매개변수를 전달받아 짝수 합계 계산
 * 				3-2) 합계를 돌려줌 (돌려주는 값은 정수형)
 *			4) 홀수 합계 계산하는 메소드 선언
 *				4-1) 두 개의 매개변수를 전달받아 홀수 합계 계산
 * 				4-2) 합계를 돌려줌 (돌려주는 값은 정수형)
 * 
 * 		2. 메인 메소드가 있는 클래스 (SumTest01)
 * 			1) 두 개의 정수를 입력받는다
 * 			2) Sum 클래스로부터 객체를 생성
 * 			3) 객체를 통해 두 정수를 전달하여 계산된 합계를 출럭
 */

import java.util.Scanner;

class Sum {
	// 멤버 변수
	public int sum; 	// 멤버변수는 초기화 하지 않아도 됨, 묵시적인 값이 들어가기 때문
	
	// 전체 합계 계산하는 메소드
	public int allSum (int num1, int num2){
		for (int i = num1; i<= num2 i++) {
			sum += i;
		}
		return sum;		// 메소드 호출한 곳으로 값을 리턴
	}
	
	// 짝수의 합계 계산하는 메소드
	public int oddSum (int num1, int num2){
		for (int i = num1; i<= num2 i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;		// 짝수의 값 리턴
	}
	
	// 홀수의 합계 계산하는 메소드
	public int evenSum (int num1, int num2){
		for (int i = num1; i<= num2 i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		return sum;		// 홀수의 값 리턴
	}
}

public class SumTest01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 정수 두 개 입력받기
		System.out.print("두 수 사이의 합계를 계산할 두 정수 입력(작은 수 부터 빈칸으로 구분) : ");
		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();
		
		// Sum 클래스로부터 객체 생성
		Sum s = new Sum();
		
		// 입력받은 값은 s 객체를 통해서 Sum 클래스의 allSum() 메소드로 전달
		
		// 메소드를 호출하여 계산된 결과를 돌려 받아 출력
		
		// 객체를 통해서 Sum 클래스의 allSum() 메소드로 전달
		System.out.println(num1 + "부터 " + num2 + "까지의 합 : " + s.allSum(num1, num2));
		// 객체를 통해서 Sum 클래스의 oddSum() 메소드로 전달
		System.out.println(num1 + "부터 " + num2 + "까지 짝수의 합 : " + s.oddSum(num1, num2));
		// 객체를 통해서 Sum 클래스의 evenSum() 메소드로 전달
		System.out.println(num1 + "부터 " + num2 + "까지 홀수의 합 : " + s.evenSum(num1, num2));
	}

}
