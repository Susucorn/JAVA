/*
 * 2024.06.04
 * 신라대학교 컴퓨터공학부 202395016 박수연
 * 
 * [Rectangle 클래스]
 * 속성 - double width와 double height
 * 생성자 - 속성을 변수로 설정
 * 
 * [Square 클래스] - Rectangle 클래스를 상속받음
 * 속성 - 변의 길이
 * 생성자 - 속성을 변수로 설정
 * 메소드 - 면적과 둘레를 계산하는 기능
 * 
 * [main 메소드]
 * 사용자로부터 정사각형의 변의 길이를 입력받아, 해당 정사각형의 정보를 출력하는 프로그램 작성하기
 * 
 * [출력결과]
 * 도형의 길이 입력 (입력 종료는 enter) : 
 * 2
 * 3
 * 
 * 직사각형의 넓이 : 6.0
 * 직사각형의 둘레 : 10.0
 */

import java.util.Scanner;
import java.util.ArrayList;

//Rectangle 클래스는 직사각형의 속성을 정의합니다.
class Rectangle {
	// 속성 (가로길이, 높이)
	private double width;
	private double height;

	// width와 height를 설정하는 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 면적 계산 메소드
	public double getArea() {
		return width * height;
	}

	// 둘레 계산 메소드
	public double getPerimeter() {
		return 2 * (width + height);
	}
}


//Square 클래스 - Rectangle 클래스를 상속받음
class Square extends Rectangle {

	// 변의 길이를 설정하는 생성자
	public Square(double side) {
		super(side, side);
	}

	// 메소드 오버라이딩 --> 상위 클래스의 메소드를 재정의 하여 기능을 확장한다
	// 이 코드는 오버라이딩 후, 상위 클래스의 메소드 기능을 사용한다
	// 면적을 계산하는 메소드 (Rectangle 클래스의 메소드 사용)
	@Override
	public double getArea() {
		return super.getArea();
	}

	// 둘레를 계산하는 메소드 (Rectangle 클래스의 메소드 사용)
	@Override
	public double getPerimeter() {
		return super.getPerimeter();
	}
}
	
public class SquareTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 배열 사용
        ArrayList<Double> inputs = new ArrayList<>();

        // 입력 받기
        System.out.println("도형의 길이를 입력하세요.(입력 종료는 enter입니다.) :");

        // 무한 반복 실행
        while (true) {
        	// 사용자 입력을 처리하여 배열에 저장
            String input = stdIn.nextLine();
            
            // 종료 조건 : 입력이 비어있다면
            if (input.isEmpty()) {
                break;
            }
            
            // 비어있지 않다면
            else {
            	// 입력받은 배열을 실수형으로 형 변환 시킴
                double value = Double.parseDouble(input);
                // 입력된 숫자를 배열에 저장
                inputs.add(value); 
            }
        }

        // 입력 개수에 따라 정사각형 또는 직사각형을 처리
        if (inputs.size() == 1) {
            double side = inputs.get(0);

            Square square = new Square(side);
            System.out.println("정사각형의 넓이 : " + square.getArea());
            System.out.println("정사각형의 둘레 : " + square.getPerimeter());
        } else if (inputs.size() == 2) {
            double width = inputs.get(0);
            double height = inputs.get(1);

            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("직사각형의 넓이 : " + rectangle.getArea());
            System.out.println("직사각형의 둘레 : " + rectangle.getPerimeter());
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}