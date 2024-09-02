// main 메소드가 있는 클래스

import java.util.Scanner;

public class Main_Activity {
    public static void main(String[] args) {
    	new User("사장님", "사장님", "a123456789", "12345@gmail.com");
    	Menu menu = new Menu();
    	int num = 9;
    	Scanner stdIn = new Scanner(System.in);
    	while(num != 0) {
    		System.out.println("안녕하세요. PC방 GETO 키오스크입니다.");
	    	System.out.println("1. 사용자");
	    	System.out.println("2. 관리자");
	    	System.out.println("0. 종료");
	    	System.out.print("(입력 후 Enter) : ");
	    	num = stdIn.nextInt();
	    	
	    	switch(num) {
	    		case 0 :
	    			System.out.println("\nGETO 키오스크를 이용해주셔서 감사합니다.");
	    			break;
	    		case 1 :
	    			menu.displayMenu();
	    			break;
	    		case 2 :
	    			menu.pmlogin();
	    			break;
	    		default :
	    			System.out.println("\n다시 입력하여 주십시오!\n");
	    	}
    	}
    }
}
