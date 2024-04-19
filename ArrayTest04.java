/*
 * 2024.04.19
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 배열의 복사
 * 			배열의 복사는 주소를 복사함 --> 같은 주소를 가리키게 됨
 */
// 컨트롤 + 쉬프트 + O
import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 배열 선언 잋 초기화
		int num1[] = {10, 20, 30};
		int num2[] = {40, 50, 60};
		
		System.out.print("num1 값 :  ");
		
		// Arrays.toString 배열의 내용을 문자열의 형태로 반환하는 메소드
		// 배열의 내용을 쉽게 확인하고 디버깅하는데 사용 (for문 대신 사용 가능)
		System.out.println(Arrays.toString(num1));
		
		System.out.print("num2 값 :  ");
		System.out.println(Arrays.toString(num2));
		
		System.out.println("==========================================================");
		
		// 배열명을 이용하여 배열 복사
		// 값이 복사되는 게 아닌 주소가 복사되어 같은 주소를 가리키게 됨
		num2 = num1;
		
		System.out.println("배열 복사 후...");
		
		System.out.print("num1 값 :  ");
		System.out.println(Arrays.toString(num1));
		System.out.print("num2 값 :  ");
		System.out.println(Arrays.toString(num2));
		
		System.out.println("==========================================================");
		
		num2[2] = 200;
		System.out.println("num[2] =200");
		System.out.print("num1에 저장된 값 :  ");
		System.out.println(Arrays.toString(num1));
		System.out.print("num2에 저장된 값 :  ");
		System.out.println(Arrays.toString(num2));
		
		System.out.println("==========================================================");
		
		//새로운 배열 생성 및 초기화
		int num3[] = {100, 200, 300};
		int num4[] = {400, 500, 600};
		
		System.out.print("num3 :  ");
		System.out.println(Arrays.toString(num3));
		System.out.print("num4 :  ");
		System.out.println(Arrays.toString(num4));
		
		// 값을 복사 --> for 반복문 활용
		for (int i=0; i < num2.length; i++) {
			num4[i] = num3[i];	// 배열의 각 요소를 복사하여 넣는다
		}
		
		System.out.println("배열의 요소 복사 후...");
		
		System.out.print("num3 :  ");
		System.out.println(Arrays.toString(num3));
		System.out.print("num4 :  ");
		System.out.println(Arrays.toString(num4));
		
		System.out.println("==========================================================");
		
		num4[2] = 999;
		System.out.println("num4[2] = 999;");
		System.out.print("num3 :  ");
		System.out.println(Arrays.toString(num3));
		System.out.print("num4 :  ");
		System.out.println(Arrays.toString(num4));
	}

}
