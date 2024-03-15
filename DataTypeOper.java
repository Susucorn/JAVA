/*
 2024.03.15
 신라대학교 202395016 컴퓨터공학부 박수연
 설명 : 연산과 자료형
 		
 		- 두 개의 정수를 입력 받아 평균을 계산하는 프로그램
 		
 		1) 두 정수를 키보드로부터 입력 받기
 		2) 평균을 계산 후
 		3) 평균 출력
 */
// Scanner 사용을 위한 라이브러리
import java.util.Scanner;

public class DataTypeOper {

	public static void main(String[] args) {
		// Scanner 객체 생성하기
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 가이드 한다
		System.out.println("<정수 두 개 입력하기>");
		// 정수형으로 입력받아   num1 변수에 저장
		System.out.print("첫 번째 정수 : ");
		int num1 = stdIn.nextInt();		
		// 정수형으로 입력받아   num1 변수에 저장
		System.out.print("두 번쨰 정수 : ");
		int num2 = stdIn.nextInt();		
		
		// 평균을 계산하여 변수에 저장하기 --> 논리 오류
		double avg1 = (num1 + num2) / 2;
		System.out.println("정수 연산 --> " + num1 + " + " + num2 + " = " + avg1);
		
		// 평균을 계산하여 변수에 저장하기 --> 제대로 된 값
		double avg2 = (num1 + num2) / 2.0;
		System.out.println("실수 연산 --> " + num1 + " + " + num2 + " = " + avg2);
	}
}
