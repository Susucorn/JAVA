// 회원 클래스, User 클래스를 상속 받는다

import java.util.Scanner;

class Member extends User {
	Payment pay = new Payment();
	
	public void Member_login() {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\n<< 회원 로그인 >>");
        System.out.print("ID : ");
        String id = stdIn.nextLine();
        System.out.print("PW : ");
        String pw = stdIn.nextLine();

        boolean login_success = false;
        char res = 'y';
        for (String[] userInfo : users) {
            if (userInfo[1].equals(id) && userInfo[2].equals(pw)) {
            	while(res == 'y' || res == 'Y') {
            		System.out.println("환영합니다, " + userInfo[0] + "님!");
            		System.out.println("원하는 자리의 PC 전원을 키시면 바로 사용 가능합니다.");
            		System.out.print("쿠폰을 구매하시겠습니까? (y/n): ");
                	res = stdIn.next().charAt(0);
                	if (res == 'y' || res == 'Y' ) { pay.makePayment(); }
                	else { System.out.println("\n이전 화면으로 돌아갑니다."); }
            	}
                break;
            }
        }
        if (login_success == false) {System.out.println("\n아이디 또는 비밀번호가 올바르지 않습니다.");}
    }
}