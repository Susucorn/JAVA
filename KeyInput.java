/*
 * 2024.03.12
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 이름 입력 받아 출력하는 프로그램
 */
// 입력을 위한 라이브러리 클래스를 포함시켜야 scanner 사용이 가능함
import java.util.Scanner;

public class KeyInput {

	public static void main(String[] args) {
		// Scanner 객체를 생성하여 키보드로부터 입력받기
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 사용자에게 어떤 동작을 해야하는지 먼저 알려주자
		System.out.print("사용자의 이름을 입력 : ");
		
		// 2. 사용자의 이름은 문자열, 문자열로 받아 저장
		String name = stdIn.next();
		
		// 3. 입력받은 이름을 출력
		System.out.println("안녕하세요." + name + "님 반갑습니다.");
	}
}
