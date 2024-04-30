/*
 * 2024.04.30
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 2차원 배열을 생성하고, 랜덤 수를 배열의 초깃값으로 설정한다.
 */

import java.util.Arrays;
import java.util.Random;

public class MultiArrayTest01 {

	public static void main(String[] args) {
		// 2차원 배열 생성
		// 줄, 칸(4줄 4칸 짜리 2차원 배열)
		int [][] num = new int[4][4];
		int i, j;	
		
		// 랜덤으로 값 초기화, 랜덤 객체를 생성함
		Random random = new Random();
		
		// 랜덤으로 2차원 배열에 값 저장
		
		for (i=0; i<4; i++) {		// 줄
			for (j=0; j<4; j++) {	// 칸
				num[i][j] = random.nextInt(10);		// 0~9까지
			}
		}
		
		// 2차원 배열 출력
		for (i=0; i<4; i++) {		// 줄
			for (j=0; j<4; j++) {	// 칸
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열의 내용을 문자열로 출력	 ( 1차원 배열은 Array.toString() )
		System.out.println(Arrays.deepToString(num));
		
		/*
		 * 	-- 각 줄의 칸의 값들을 합하여 출력하기--
		 * 	0번 줄의 0, 1, 2, 3칸의 합을 계산
		 * 1번 줄의 0, 1, 2, 3칸의 합을 계산
		 * 2번 줄의 0, 1, 2, 3칸의 합을 계산
		 * 3번 줄의 0, 1, 2, 3칸의 합을 계산
		 */

		int sum;
		
		// 배열의 줄 길이 까지
		for (i=0; i<num.length; i++) {		// 줄
			sum = 0;				// 이 줄에 초기화를 해야 함
		
			// 배열의 줄의 칸 길이까지
			for (j=0; j<num[i].length; j++) {	// 칸
				sum += num[i][j];	// 합계 계산
				System.out.print(num[i][j] + " ");
			}
			
			System.out.println("합 : " + sum);
		}
		
	}

}
