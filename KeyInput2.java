/*
 * 2024.03.12
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 이름, 나이, 몸무게 순서로 입력받아 출력하는 프로그램
 */
// 라이브러리 포함
import java.util.Scanner;

public class KeyInput2 {

	public static void main(String[] args) {
		// 1. Scanner 객체를 생성하기
		Scanner stdIn = new Scanner(System.in);
		
		// 2. 이름, 나이, 몸무게 를 한 번에 입력 받기 ==> 스페이스바(공백)으로 구분
		System.out.print("이름, 나이, 몸무게를 입력 (스페이스 바로 구분) : ");
		
		// 2-1. 이름을 입력받아 변수에 저장 (문자열)
		String name = stdIn.next();
		
		// 2-2	나이를 입력받아 변수에 저장 (정수)
		int age = stdIn.nextInt();
		
		// 2-3	몸무게를 입력받아 변수에 저장 (실수)
		double wei = stdIn.nextDouble();
		
		// 3. 입력받은 이름, 나이, 몸무게를 한 줄로 출력
		System.out.print(name + "님의 나이는 " + age + "이고, ");
		System.out.println("몸무게는 " + wei + "입니다.");
	}
}
