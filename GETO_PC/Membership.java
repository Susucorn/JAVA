// 회원가입 클래스, ProgramManager 클래스를 상속 받음

import java.util.Scanner;

class Join extends ProgramManager {
	
	public void Sign_in() {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("\n<< 회원가입 >>");
		System.out.print("이름 : ");
		String name = stdIn.nextLine();
		System.out.print("아이디 : ");
		String id = stdIn.nextLine();
		System.out.print("비밀번호 : ");
		String password = stdIn.nextLine();
		System.out.print("이메일 : ");
		String mail = stdIn.nextLine();
		
		System.out.print("계정을 생성하시겠습니까? (y/n): ");
    	char res = stdIn.next().charAt(0);
    	if (res == 'y' || res == 'Y' ) {
    		System.out.println("\n회원가입이 완료되었습니다.");
    		user = new String[] { name, id, password, mail }; // 새로운 배열에 사용자 이름, 아이디, 비밀번호, 이메일 저장
    		users.add(user); // 생성한 배열을 리스트에 추가
    	}
    	else { System.out.println("\n회원가입이 취소되었습니다."); }
	}
}
