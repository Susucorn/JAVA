import java.util.Scanner;

// Calculator 클래스
class Calculator  {
	// 멤버 변수
	private int num1, num2;		// 피연산자
	private String op;			// 연산자 종류
	private int result;			// 연산 결과
	
	// 연산 결과를 리턴하는 메서드
	public int getResult() {
		return result;
	}

	// 매개변수를 가지는 생성자, 피연산자와 연산자를 매개변수로 가져옴
	public Calculator(int num1, int num2, String op) {
		// 클래스 내의 멤버 변수로 초기화, this
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	// 매개변수가 없는 생성자
	public void calc() {
		
		switch(op) {
		// 덧셈
		case "+": result = num1+num2;break;
		//뺄셈
		case "-": result = num1-num2;break;
		// 곱셈
		case "*": result = num1*num2;break;
		// 나눗셈
		case "/": result = num1/num2;
		}
	}
}

public class CalcMain {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner stdIn = new Scanner(System.in); 
		
		// 피연산자 입력받기
		System.out.print("정수 2개 입력 (스페이스 바 구분) : ");
		int num1 = stdIn.nextInt();		
		int num2 = stdIn.nextInt();
		
		//연산자 입력받기
		System.out.print("연산자를 입력하시오. : ");
		String op = stdIn.next();

		// Calculator 클래스로부터 객체 생성
		Calculator calc = new Calculator(num1, num2, op);
		calc.calc();
		System.out.println("연산결과 : " + calc.getResult());
	}
}

