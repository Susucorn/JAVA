//메뉴 선택 클래스, ProgramManager 클래스를 상속 받음

import java.util.Scanner;

class Menu extends ProgramManager { 
    @Override
    public void menu_option() { // 부모의 메소드 오버라이딩
        System.out.println("\n<< 메뉴를 선택하여 주십시오 >>");
        System.out.println("1. 회원 로그인");
        System.out.println("2. 비회원 로그인");
        System.out.println("3. 회원가입");
        System.out.println("0. 처음화면으로");
        System.out.print("(입력 후 Enter) : ");
    }

    public void displayMenu() {
        Scanner stdIn = new Scanner(System.in);
        Member m = new Member();
        Join j = new Join();
        Guest g = new Guest();
        int choice = 9;

        while (choice != 0) {
            menu_option(); // 오버라이딩된 메소드 호출

            choice = stdIn.nextInt();

            switch (choice) {
                case 1: 
                    m.Member_login();
                    break;
                case 2:
                	g.Non_menber_login();
                    break;
                case 3:
                	j.Sign_in();
                    break;
                case 0:
                    System.out.println("\n처음 화면으로 돌아갑니다.\n");
                    break;
                default:
                    System.out.println("\n잘못된 선택입니다. 다시 선택해주세요.\n");
            }
        }
    }
}