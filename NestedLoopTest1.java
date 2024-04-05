/*
 * 2024.04.05
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 전체 구구단 작성하기
 * 
 * 문제분석 : 단은 2~9 까지, 곱하는 수는 1~9까지
 * 			2단 ..., 3단 ..., 4단........ 9단 출력
 * 
 * 알고리즘 : == for문 ==
 * 			1. 단은 2부터 9까지 반복
 * 				--> 00단 출력
 * 				1-1. 곱하는 수는 1부터 9까지 반복
 * 
 * 			== while문 ==
 * 			1. 단은 2단부터
 * 			2. 단은 9단까지
 * 				2-1 수는 1부터
 * 				2-2 수는 9까지 반복
 * 					구구단 출력
 * 					수를 1증가
 * 				2-3 단을 1증가
 */
public class NestedLoopTest1 {

	public static void main(String[] args) {
		
		// for 문
		
		// 단
		for (int dan = 2; dan <=9; dan++) {
			System.out.println("======== " + dan + "단 ========");
			// 곱하는 수
			for (int su = 1; su <=9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan*su));
			}
		}
			
	}
}
