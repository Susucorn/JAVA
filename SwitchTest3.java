/*
 * 2024.03.26
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : switch ~ case문
 * 			-> 숫자와 연산자를 입력 받아 사칙연산 프로그램 작성하기
 * 			-> 입력 방식 : 3 + 4 (띄어쓰기로 구분한다)
 * 
 * 문제분석 : 숫자 연산자 숫자 순서로 입력받아
 * 			해당 연산자에 따른 결과를 출력
 * 			나눗셈의 결과는 소수점 두 자리까지만 출력 -> 나누기는 0으로 나눌 수 없음, 두 번째 정수가 0이라면 출력 불가능
 * 			3 + 4로 입력했을 때 '+' 연산자를 추출하려면? --> 입력된 문자열에서 첫 번째 문자 추출 charAt(0)
 */

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 사용자에게 어떤 동작을 해야하는지 알려주기
		System.out.print("수행할 연산을 입력 (3 + 4 띄어쓰기로 구분) : ");
		
		// 1. 입력받은 문자열을 변수에 저장	
		int num1 = stdIn.nextInt();
		char op = stdIn.next().charAt(0); // stdIn.next()만 입력하면 오류발생
		int num2 = stdIn.nextInt();
		int result;
		
		// 입력받은 num2가 0이라면... (나눗셈)
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } 
        
        else {
    		switch (op)
    		{
    			// 덧셈
    			case '+' :
    				result = num1 + num2; 
    				System.out.println("결과 : " + result);
    				break;
    				
    			// 뺄셈	
    			case '-' :
    				result = num1 - num2; 
    				System.out.println(num1-num2);
    				break;
    				
    			// 곱셈	
    			case '*' :
    				result = num1 * num2; 
    				System.out.println(num1*num2);
    				break;
    				
    			// 나눗셈	
    			case '/' :
		            result = num1 / num2;
		            System.out.println("결과 : " + (float)result);   
    		        break;
    		    
    		    // 예외의 값이라면...
    		    default:
    		    	System.out.println("연산 수행이 불가능한 값을 입력하셨습니다.");
    		    	break;
    		}
        }
        	


	}

}
