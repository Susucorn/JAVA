/*
 * 2024.04.12
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : continue, break문 활용하기
 * 
 * 		--> 점수를 입력받아 합계와 평균을 출력하는 프로그램
 * 		--> 음수 입력되면 점수 입력 종료
 * 		--> 100점 이상의 점수는 계산에 포함되지 않는다
 * 
 * 문제분석 : 점수 입력은 무한반복, 음수 입력되면 무한반복 종료
 * 			100점 초과의 점수는 계산에 포함되지 않는다(continue 다시 반복문 처음으로 돌아감)
 * 
 * 알고리즘 : 1. 누적의 합을 저장할 변수 0으로 초기화
 * 			2. 무한 반복
 * 				2-1. 점수를 입력받는다
 * 
 * 					2-2-1. 만약 입력받은 점수가 100점 초과라면? --> continue
 * 					
 * 					2-2-2. if 입력받은 점수가 음수라면 --> break
 * 
 * 					2-2-3. 누적의 합 계산					
 */

import java.util.Scanner;

public class ContinueBreak1 {

	public static void main(String[] args) {
		// Scanner 객체를 생성
		Scanner stdIn = new Scanner(System.in);
		
		// 누적의 합
		int result = 0;
		int count = 0;
		while (true) {
			// 사용자에게 정수 입력받기
			System.out.print("정수 입력 : ");
			int inputNum = stdIn.nextInt();
			
			// 무한 반복 종료 조건
			if (inputNum < 0) {
				System.out.println("음수입력, 점수입력을 종료합니다.");
				break;
			}
			
			// 점수를 다시 입력받아야 하는 조건
			else if (inputNum > 100) {
				System.out.println("100점을 초과하셨습니다. 점수를 다시 입력하세요.");
				continue;
			}
			
			// 누적의 합을 계산
			else {
				result += inputNum;
			}
			
			// 평균 계산을 위함
			count += 1;
		}
		
		System.out.println("합계 : " + result + "\n평균 : " + (result/count));

	}

}
