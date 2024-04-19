/*
 * 2024.04.19
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : Arrays 클래스와 system 클래스에서 제공하는 메소드 연습
 * 
 *  --> 단순하게 요소 값만 보고싶으면 Arrays.toString() 메소드 사용하기
 */

import java.util.Arrays;

public class ArrayMethodTest01 {

	public static void main(String[] args) {
		int num1[] = {7, 4, 9, 4, 2, 1, 8, 4, 2, 3};
		
		System.out.println("초기 배열의 값 : " + Arrays.toString(num1));
		
		Arrays.fill(num1,  3, 5, 33); // 3번지부터 5-1번지까지 요소를 33으로 바꿈
		System.out.println("fill() 수행 후 배열의 값 : " + Arrays.toString(num1));
		
		Arrays.sort(num1);	// 오름차순 정렬
		System.out.println("sort() 수행 후 배열의 값 : " + Arrays.toString(num1));
		
		// Arrays.binarySearch() 메소드는 배열에서 33의 위치를 찾음, 첫번째로 찾는 33의 위치
		// ** 이 메소드를 사용하려면 반드시 요소들이 정렬 되어있어야 함 **
		// 여러 개의 번지를 알고 싶다면 반복문 활용
		System.out.println("33은 배열의 " + Arrays.binarySearch(num1, 33) + "번째 요소");
		
		int num2[] = {5, 4, 3, 2, 1,};
		System.out.println("num2 : " + Arrays.toString(num2));
		
		// 두 배열을 비교하여 결과 반환
		System.out.println("num1배열과 num2은 같은가? --> " + Arrays.equals(num1, num2));
		
		int num3[] = new int[5];
		
		// 배열에 값 복사하는 메소드
		// num2 배열의 0번지부터 num3의 0번지 위치로 3개 복사됨
		// 남은 공간은 디폴트 값 0으로 저장됨
		System.arraycopy(num2, 0, num3, 0, 3);
		System.out.println("복사된 배열 num3 : " + Arrays.toString(num3));
	}

}
