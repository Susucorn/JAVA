/*
 * 2024.05.14
 * 신라대학교 202395016 컴퓨터공학부 박수연	
 * 설명 : main 메소드에 대하여...
 * 			main 메소드는 사실 클래스 메소드 였다!
 */

// main 메소드가 있는 클래스
public class C_Main2 {
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
		// 객체 생성
		C_Main2 cm = new C_Main2();
		
		// main 메소드에서 선언한 지역 변수
		int same;
		
		// 클래스 변수가 아닌 변수를 접근하려면? --> 객체를 통해 접근이 가능함
		same = cm.count;
		System.out.println("count = " + same);
		
		// num은 클래스 변수
		same = cm.num;		// 가능한 방법이나, 클래스명으로 접근하는 것이 관례.
		same = C_Main2.num;		
		System.out.println("num = " + same);
		
		// 객체를 통해 메소드 호출
		same = cm.sum(5, 5);
		System.out.println("sum = " + same);
		
		same = mul(5, 5);
		System.out.println("mul = " + same);
	}

}
