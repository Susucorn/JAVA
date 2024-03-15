/*
 2024.03.15
 신라대학교 202395016 컴퓨터공학부 박수연
 설명 : 3항 연산자
 	
 		- 정수를 입력 받아 짝수인지 확인하는 프로그램
 */
import java.util.Scanner;

public class TernaryOpTest {
		// Scanner 객체 생성하기
		Scanner stdIn = new Scanner(System.in);
	
		System.out.print("정수입력 : ");
		int num = stdIn.nextInt();
	
		// 불린형 변수 선언 true, false
		boolean result;
		// num을 2로 나눈 나머지가 0인가? --> 참이면 true값을 저장하고, 거짓이면 false를 저장한다
		result = (num % 2 ==0) ? true:false;
	
		System.out.println(num + "은 짝수입니까?");
		System.out.println(result);
	}
}
