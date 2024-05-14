/*
 * 2024.05.14
 * 신라대학교 202395016 컴퓨터공학부 박수연	
 * 설명 : main 메소드에 대하여...
 * 			main 메소드는 사실 클래스 메소드 였다!
 */

// main 메소드가 있는 클래스
public class C_Main {
	// 객체 변수
	int count = 10;
	
	// 클래스 변수
	static int num = 20;
	
	// 메소드
	public int sum(int x, int y) {
		return x+y;
	}
	
	// 클래스 메소드
	static int mul(int x, int y) {
		return x*y;
	}
	
	// 클래스 메소드 (메인 메소드)
	public static void main(String[] args) {
		// main 메소드에서 선언한 지역 변수
		int same;
		
		// same = count;		오류발생, count는 일반 객체 변수, main 메소드는 클래스 메소드이기 때문에 
								//클래스 변수 or 지역변수만 사용 가능
		
		same = num;		// num은 클래스 변수
		System.out.println("num = " + same);
		
		// same = sum(5, 5);	오류 발생, 클래스 메소드 아니기 때문
		
		same = mul(5, 5);
		System.out.println("mul = " + same);
	}

}
