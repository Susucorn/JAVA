/*
 * calculator_class 클래스 작성
 * --> 이 클래스는 두 개의 정수와 실수를 더하고 빼는 메서드가 존재함
 * 
 * int add(int a, int b) --> 두 정수의 합 반환하는 동작 수행
 * double add(double a, double b) --> 두 실수의 합을 반환하는 동작 수행
 * int subtract(int a, int b) --> 두 정수의 차를 반환하는 동작 수행
 * double subtrac(double a, double b) --> 두 실수의 차를 반환하는 동작 수행
 * 
 * Calculator 클래스
 * main 메서드 : Calculator_class로부터 객체를 생성, 두 정수를 입력 받아 합과 차를 출력한다
 * 
 * [출력결과]
 * 첫 번째 정수 입력 : 3
 * 두 번째 정수 입력 : 5
 * 두 정수의 합계 : 8
 * 두 정수의 차 : -2
 * 첫 번째 실수 입력 : 7.3
 * 두 번째 실수 입력 : 5.5
 * 두 실수의 합계 : 12.8
 * 두 실수의 차 : 1.8
 * 
 * 메소드 오버로딩 --> 매개변수의 타입이 다름
 */

import java.util.Scanner;

class calculator_class{
	// 속성 X 생성자는 기본 생성자가 호출됨(아무것도 없는)
	
	// 1. 메서드
	
	// 정수의 더하기 메서드
	public int add(int a, int b) {
		return a+b;
	}
	
	// 실수의 더하기 메서드
	public double add(double a, double b) {
		return a+b;
	}
	
	// 정수의 빼기 메서드
	public int subtract(int a, int b) {
		return a-b;
	}
	
	// 실수의 빼기 메서드
	public double subtract(double a, double b) {
		return a-b;
	}
	
	// 메서드 오버로딩 --> 매개변수 타입 달라야함
}
public class Calculator {

	public static void main(String[] args) {
		// 1. 객체 생성
		
		// 기본 생성자 호출됨(아무것도 없는)
		calculator_class calc = new calculator_class();

		
		// 2.
		// 2개의 정수 입력받아 동작 수행 시키기
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int n1 = stdIn.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int n2 = stdIn.nextInt();
		
		// 입력한 값을 가지고 정수 합을 구하는 메서드 호출
		System.out.println("두 정수의 합 : " + calc.add(n1, n2));		
		// 입력한 값을 가지고 정수 차를 구하는 메서드 호출
		System.out.println("두 정수의 합 : " + calc.subtract(n1, n2));	
		
		
		// 3.
		// 2개의 실수 입력받아 동작 수행 시키기
		System.out.print("첫 번째 실수 입력 : ");
		double n3 = stdIn.nextDouble();
		System.out.print("두 번째 실수 입력 : ");
		double n4 = stdIn.nextDouble();
		
		// 입력한 값을 가지고 실수 합을 구하는 메서드 호출
		System.out.println("두 실수의 합 : " + calc.add(n3, n4));	
		// 입력한 값을 가지고 실수 차를 구하는 메서드 호출
		System.out.println("두 실수의 합 : " + calc.subtract(n3, n4));	
	}

}
