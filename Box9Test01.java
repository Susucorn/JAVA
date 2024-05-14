class Box09 {
	// 외부 접근 불가능한 객체 변수 (외부에서 수정 불가)
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	// 생성자
	public Box09(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		
		// 메소드 호출, 클래스 내부에서 호출했으므로 가능
		volume();
	}
	
	private void volume() {
		// vol 변수는 private로 선언된 객체 변수지만, 같은 클래스 내부에서는 접근 가능
		vol = width * height * depth;
	}
	
	public int getvolume() {
		return vol;
	}
}
public class Box9Test01 {

	public static void main(String[] args) {
		// 객체 생성
		Box09 mybox1 = new Box09(10, 20, 30);
		
		// mybox1.width = 20;  			오류 발생, private로 선언된 객체 변수이기 때문에 변경 불가능	
		// int vol1 = mybox1.volume();	오류 발생, private로 선언된 메소드이기 때문에 객체로 접근 불가능
		
		System.out.println("정수 박스의 부피 : " + mybox1.getvolume());

	}

}
