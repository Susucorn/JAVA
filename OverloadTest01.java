/* 
 * 2024.05.17
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 사용자로부터 값을 입력받아 그 입력 값의 개수에 따라 도형의 넓이, 부피를 구하는 프로그램
 * 
 * 입력 값이 한 개이면 원의 넓이, 두 개이면 사각형 넓이, 세 개이면 육면체 부피를 계산함
 * 넓이, 부피를 계산하는 부분은 메소드 오버로딩으로 작성한다.
 * 사용자가 엔터키를 누르면 입력을 종료
 * 종료 전에 입력한 숫자의 개수에 따라 도형의 결과 값을 출력한다.
 */
import java.util.Scanner;

// Overload 클래스
class Overload {
	// 첫 번째 메소드 - 매개변수 X
	public void shape() {
		System.out.println("매개 변수가 없습니다.");
	}
	
	// 두 번째 메소드 - 매개변수 1개, 원의 넓이 계산
	public void shape(int r) {
		System.out.println("반지름이 " + r + "인 원의 넓이 = " + r * r * 3.14);
	}
	
	// 세 번째 메소드 - 매개변수 2개, 사각형 넓이 계산
	public void shape(int width, int height) {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("사각형 넓이 : " + width * height);
	}
	
	// 네 번째 메소드 - 매개변수 3개, 육면체 부피 계산
	public void shape(int width, int height, int depth) {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("깊이 : " + depth);
		System.out.println("육면제 부피 : " + width * height * depth);
	}
}

public class OverloadTest01 {

	public static void main(String[] args) {
		   // 객체 생성
		Overload ol = new Overload();
		
		// 사용자에게 입력받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("도형의 종류에 따라 값을 입력해주세요:");
        System.out.println("1. 원의 경우: 반지름의 길이");
        System.out.println("2. 직사각형의 경우: 가로와 세로의 길이");
        System.out.println("3. 직육면체의 경우: 가로, 세로, 높이의 길이");
        System.out.println("입력을 종료하려면 엔터키를 누르세요.");
			
        while (true) {
        	// 사용자로부터 한 줄을 입력받기 --> (trim() 메서드를 사용하여 양쪽 공백을 제거한 후) 
        	// input 변수에 저장하기
        	// trim() 메서드를 사용하는 이유? -->  사용자가 입력할 때 공백을 추가로 입력하는 경우를 방지하기 위함
        	// 사용자가 엔터키를 눌러 입력을 종료하면 이 입력은 빈 문자열("")이 됨
        	String input = scanner.nextLine().trim();
        	
        	// 종료 조건 --> 엔터키가 눌렸을 때 입력 종료
            if (input.isEmpty()) {
            	System.out.println("프로그램 종료");
                break; 
            }
            
	         // 입력된 문자열을 공백을 기준으로 분할하여 문자열 배열에 저장합니다.
	         // "\\s+"는 정규 표현식으로, 하나 이상의 공백을 나타냅니다.
	         // 따라서 입력된 문자열이 여러 개의 공백으로 구분되어 있어도 정확히 분할됩니다.
            String[] shape_len = input.split("\\s+");
            
            switch (shape_len.length) {
	            case 1:
	            	// 배열의 길이가 1개 --> 0번지 값을 가지고 메소드 호출
	            	// 입력받은 값은 문자열 --> 정수로 변환하여 값을 전달해야 함
	                ol.shape(Integer.parseInt(shape_len[0]));
	                break;
	            case 2:
	            	// 배열의 길이가 2개 --> 0번지와 1번지 값을 가지고 메소드 호출
	                ol.shape(Integer.parseInt(shape_len[0]), Integer.parseInt(shape_len[1]));
	                break;
	            case 3:
	            	// 배열의 길이가 3개 --> 0번지와 1번지 2번지 값을 가지고 메소드 호출
	                ol.shape(Integer.parseInt(shape_len[0]), Integer.parseInt(shape_len[1]), Integer.parseInt(shape_len[2]));
	                break;
	            default:
	                System.out.println("숫자의 개수가 맞지 않습니다.");
            }
		}
	}

}
