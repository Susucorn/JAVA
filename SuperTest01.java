/*
 * 설명 : super 예약어
 */

class ST1a{
	// 멤버 변수
	public int x = 500;
	public int y = 1000;
}

class ST1b extends ST1a {
	public String x = "처음 시작하는 자바";
	public String xx = x + " " + super.x;	// 처음 시작하는 자바 + 500 (상위 클래스의 멤버변수 x에 접근)
	public String yy = y + " " + super.y;	// 1000 + 1000 (상위 클래스의 멤버변수 y에 접근)
	
	// x, xx, yy, y(상속받은 변수), 상위 클래스 x는 없음
	// 상위 클래스의 멤버변수를 사용하고 싶으면? --> super.변수명
}
public class SuperTest01 {

	public static void main(String[] args) {
		// 객체 생성
		ST1b st2 = new ST1b();
		
		System.out.println("객체 sb2에 들어 있는 x, y : " + st2.x + st2.y);
		System.out.println("객체 sb2에 들어 있는 xx : " + st2.xx);
		System.out.println("객체 sb2에 들어 있는 yy : " + st2.yy);
	}

}
