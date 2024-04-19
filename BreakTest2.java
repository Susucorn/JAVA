/*
 * 2024.04.12
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 반복문, 제어문을 사용하여 * 찍기
 * 
 * 알고리즘 : 1. 변수 선언 및 초기화
 * 			2. 반복 1 (i가 10보다 작을때까지)
 * 				2-2 반복 2 (j가 i보다 작을 때까지)
 * 					2-2-1. if j가 6보다 크다면 반복 탈출
 * 					2-2-2. * 모양 찍기
 * 				줄바꿈 출력
 * 
 * 			--> 만약 순서가 바뀐다면? 누적의 합, 증감식, 탈출 조건식 (O)
 */
public class BreakTest2 {

	public static void main(String[] args) {
		int i, j;
		for (i=1; i<10; i++) {
			for (j=1; j<i; j++) {
				if (j > 6) break;
				
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
