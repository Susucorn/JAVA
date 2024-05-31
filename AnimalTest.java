/*
 *  Animal 클래스 작성하기
 *  
 * 	이 클래스는 다음과 같은 필드(속성)를 가진다
 * 	protected String name
 *  protected int age
 *  
 *  Animal 클래스는 다음과 같은 메서드를 가진다
 *  기본 생성자 : 이름을 "", 나이를 0으로 초기화
 *  매개변수 있는 생성자 : 이름과 나이를 입력받아 초기화
 *  
 *  printInfo() 메서드 : 동물의 이름과 나이를 출력하는 기능
 *  
 *  ------------------------------------------------
 *  
 *  Animal 클래스를 상속하는 Dog 클래스 작성하기
 *  
 *  이 클래스는 다음과 같은 필드를 추가로 가진다
 * 	private String breed
 * 
 * 	Dog 클래스는 다음과 같은 메서드를 가진다
 * 	기본 생성자 : 부모 클래스의 기본 생성자를 호출하고, breed를 ""으로 초기화
 * 	매개변수 있는 생성자 : 이름, 나이, 품종을 입력받아 초기화
 * 
 * 	printInfo() 메서드 : 부모 클래스의 printInfo() 메서드 호출, 품종을 추가로 출력하는 기능
 * 
 * 	-------------------------------------------------
 * 
 * AnimalTest 클래스
 * 
 * main 메서드 : 강아지 이름과 나이, 품종을 입력 받는다
 * Dog 클래스로부터 객체를 생성하여 결과를 출력한다
 * 
 * [출력결과]
 * 강아지 이름 : 모카
 * 강아지 나이 : 2
 * 강아지 품종 : 말티즈
 * Name : 모카, 나이 : 2, 품종 : 말티즈
 * 
 */

// 상위 클래스

import java.util.Scanner;

class Animal{
	// 속성
	protected String name;
	protected int age;
	
	// 생성자
	
	// 1) 매개 변수가 없는 기본 생성자
	public Animal() {
		this.name = "";
		this.age = 0;
		
		// 이름과 나이를 초기화
	}
	
	// 2) 매개 변수가 있는 생성자 (생성자 오버로딩)
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
		// 이름과 나이를 전달 받아 초기화
	}
	
	// 메서드
	public void printInfo() {
		System.out.print("name : " + name + ", age : " + age);
	}
}

class Dog extends Animal{
	// 품종 속성 추가
	private String breed;
	
	// 매개 변수 없는 기본 생성자
	public Dog() {
		super();	// 상위 클래스의 (매개 변수가 없는) 기본 생성자를 호출
		this.breed ="";		// 초기화
	}
	
	// 매개 변수 있는 생성자 (생성자 오버로딩)
	public Dog(String name, int age, String breed) {
		super(name, age);	// 상위 클래스의 매개 변수가 있는 생성자 호출, 이름과 나이를 전달
		this.breed = breed;
	}

	@Override
	public void printInfo() {
		super.printInfo();	// 상위 클래스의 메서드 호출
		System.out.println(", " + "품종 : " + breed);
		// System.out.print("name : " + name + ", age : " + age + ", " + "품종 : " + breed);
		// 위에 코드도 가능, 오버라이딩을 했기 때문(재정의)
	}
	
}
// 상위 클래스를 상속 받은 하위 클래스
public class AnimalTest {

	public static void main(String[] args) {
		// 강아지 정보 입력 받기
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("강아지 이름 : ");
		String name = stdIn.nextLine();
		
		System.out.println("강아지 나이 : ");
		int age = stdIn.nextInt();
		stdIn.nextLine();
		
		System.out.println("강아지 품종 : ");
		String breed = stdIn.nextLine();
		
		// 객체 생성
		Dog dog = new Dog(name, age, breed);	// 매개 변수가 있는 생성자 호출
		dog.printInfo();	// 출력 메서드 호출
	}

}
