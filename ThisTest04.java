/*
 * 2024.05.10
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : this 키워드
 * 		** this 키워드가 어디에 위치 하냐에 따라 결과가 달라진다는 점 알기
 */
class Box04 {
	int width, height, depth;	// 멤버 변수
	
	// 생성자
	public Box04 () {
		this(1, 1, 1);	// 다른 생성자 호출할 때도 사용됨, 여기서 다른 생성자? --> 매개 변수 3개인 생성자 호출
		System.out.println("매개 변수 없는 생성자 수행");	// this 가 다른 생성자를 호출하여 수행한 후, 돌아와서 이 코드를 실행
	}
	
	// 정수형 매개 변수 3개 생성자
	public Box04 (int width, int height, int depth) {
		System.out.println("매개 변수 3개 생성자 수행");
		
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		// 여기 실행 후에 다시 this (호출한 곳으로) 돌아감
	}
}
public class ThisTest04 {

	public static void main(String[] args) {
		Box04 box = new Box04();
		int vol = box.width * box.height * box.depth;
		System.out.println("박스의 부피 ( 매개변수 X ) : " + vol);
		
		box = new Box04(10, 20, 30);
		vol = box.width * box.height * box.depth;
		System.out.println("박스의 부피 ( 매개변수 3개 ) : " + vol);
	}

}
