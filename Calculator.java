/*
 * 2024.04.30
 * 신라대학교 202395016 컴퓨터공학부 박수연
 * 설명 : 메인 메소드가 있는 클래스
 * 		 클래스로부터 객체 생성하여 계산 결과를 출력한다
 */
public class Calculator {
	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성 (main 메소드에서 클래스를 접근할 수 있는 객체를 만들어서 접근한다)
		PlusMinus pm = new PlusMinus();		// 합과 차를 구하는 메소드를 가진 클래스를 객체로 만듦
		MultiDiv md = new MultiDiv();	 	// multiDiv 클래스로부터 객체 생성
		
		String sum, cha;
		String multi, div;
		
		// pm 객체를 통해 PlusMinus 클래스에 있는 기능(메소드) 호출
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// 객체를 통해서 minus 메소드 호출하여 결과 출력
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		
		// md 객체를 통해 MultiDiv 클래스에 있는 기능(메소드) 호출
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		// md 객체를 통해 더하기 결과 출력하기 
		// MultiDiv 클래스는 PlusMinus 클래스를 상속받았기 때문에(= extends PlusMinus) 더하기와 빼기 메소드(기능)을 활용할 수 있음
		// 메세지가 요구하는 메소드가 자신의 클래스 내에 없다면, 상위 클래스로 가서 메소드를 찾는다
		sum = md.plus(10, 20);
		System.out.println(sum);
		
		// md 객체를 통해 MultiDiv 클래스에 있는 기능(메소드) 호출
		// div 메소드는 private로 선언되어 외부 접근 불가 --> 오류 발생
		div = md.div(10, 20);
		System.out.println(div);
		
		
		
		// 클래스에 있는 메소드(기능)를 사용하기 위해서는 클래스의 객체를 만들어서 사용한다
		// 클래스 객체.메소드명  --> 클래스의 기능을 사용한다
	}

}
