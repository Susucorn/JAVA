/*
 * 2024.04.05
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 1부터 10까지의 합을 출력
 */
public class DoWhileTest1 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 1;	// 초깃값
		
		do {
			sum += num;
			num++;	// 증감식
		}while(num<=10);	// 조건식
		
		System.out.println("1~10까지의 합 : " + sum);
	}
}
