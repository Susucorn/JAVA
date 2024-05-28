// Car 클래스
class Car{
	// 멤버 변수
	String name, color;		// 이름, 색깔
    int speed;				// 속도

    // 이름 생성자
    public Car(String name){
    	// 클래스 내의 멤버변수로 초기화
       this.name = name;
    }

    // 이름, 색깔 생성자
    public Car(String name, String color){
    	// 클래스 내의 멤버변수로 초기화
       this.name = name;
       this.color = color;
    }

    // 이름, 색깔, 속도 생성자
    public Car(String name, String color, int speed){
    	// 클래스 내의 멤버변수로 초기화
       this.name = name;
       this.color = color;
       this.speed = speed;
    }
    
    // 출력 메서드
    public void printCar(){
       System.out.println("이름 = "+name+", 색깔 = "+color+", 속도 = "+speed);
    }
}

public class CarTest {
    public static void main(String args[]){
    	// 객체 생성과 동시에 값을 넘겨줌
       Car so = new Car("제네시스","검정",240); 
       
       // 출력 메서드 호출
       so.printCar();
       
       // 객체 생성 동시에 값을 넘겨줌
       Car ti = new Car("BMW","빨강",200);
       
       // 출력 메서드 호출
       ti.printCar();
    }
}