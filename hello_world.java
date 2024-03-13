public class hello_world {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println();
        
        // 줄바꿈 X
        System.out.print("줄 바꿈을 하지 않은");
        System.out.print("문장 (print)");

        System.out.println();
        System.out.println();

        // 줄바꿈 O
        System.out.println("줄 바꿈을 한");
        System.out.println("문장 (println)");

        System.out.println();
        System.out.println();

        System.out.println("앞으로 java를 " + "열심히 공부해보겠습니다.");
    }
}