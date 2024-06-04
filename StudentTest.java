/*
 * 2024.06.04
 * 신라대학교 컴퓨터공학부 202395016 박수연
 * 
 * [Person 클래스]
 * 속성 - String name
 * 기본 생성자 - 이름을 '홍길동'으로 초기화
 * 매개변수 생성자 - 이름을 입력받아 입력받은 이름으로 초기화
 * printoInfo() 메소드 : 입력받은 사람의 이름을 출력
 *
 * [Student 클래스] - Person 클래스를 상속받음
 * 속성 - String major 
 * 기본 생성자 - 부모 클래스의 기본 생성자를 호출하고, major를 "기계공학과"로 초기화
 * 매개변수 생성자 - 이름과 전공을 입력받아 초기화 한다
 * printinfo() 메소드 - 부모 클래스의 printinfo() 메소드를 호출하고, 전공을 추가로 출력한다
 */

import java.util.Scanner;

// Person 클래스
class Person {
    // 속성 (이름)
    String name;

    // 기본 생성자: 이름을 '홍길동'으로 초기화
    public Person() {
        this.name = "홍길동";
    }

    // 매개변수 생성자: 입력받은 이름으로 초기화
    public Person(String name) {
        this.name = name;
    }

    // printInfo() 메소드: 사람의 이름을 출력
    public void printInfo() {
        System.out.println("이름: " + name);
    }
}

// Student 클래스 - Person 클래스를 상속받음
class Student extends Person {
    // 속성 (전공)
    String major;

    // 기본 생성자: 부모 클래스의 기본 생성자를 호출하고, major를 "기계공학과"로 초기화
    public Student() {
        super();	// 부모 클래스의 기본 생성자 호출 (이름을 홍길동으로 초기화한 생성자)
        this.major = "기계공학과";
    }

    // 매개변수 생성자: 이름과 전공을 입력받아 초기화
    public Student(String name, String major) {
    	// 입력받은 이름을 매개변수 생성자에게 보내어 입력받은 이름으로 초기화한 후
        super(name);	
        
        // 입력받은 전공으로 초기화
        this.major = major;
    }

    // printInfo() 메소드: 부모 클래스의 printInfo() 메소드를 호출하고, 전공을 추가로 출력
    // 메소드 오버라이딩으로 상위 클래스의 메소드를 재정의 하여 기능을 확장한다 (+ 전공 출력)
    @Override
    public void printInfo() {
        super.printInfo();	// 상위 클래스의 메소드를 호출
        System.out.println("전공: " + major);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 사용자로부터 이름 입력받기
        System.out.print("이름을 입력하세요: ");
        String name = stdIn.next();

        // 사용자로부터 전공 입력받기
        System.out.print("전공을 입력하세요: ");
        String major = stdIn.next();

        // Student 객체 생성
        // 입력받은 이름과 전공을 Student 클래스의 매개변수 생성자에게 넘겨줌
        Student s = new Student(name, major);
        
        // 입력받은 값으로 초기화 한 뒤 출력 (Student 클래스의 메소드 호출)
        s.printInfo();
    }
}

