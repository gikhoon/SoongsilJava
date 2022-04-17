import java.util.Scanner;

public class try_catch_finally_Test {
    int run(){
        Scanner scanner = new Scanner(System.in);
        try{
            int i = scanner.nextInt();
            double a = 10/i;
            System.out.println("여기는 try 뒷부분입니다");
            return 1;
        }catch(ArithmeticException e) {
            System.out.println("0으로 나누기");
        }finally {
            System.out.println("여기는 finally입니다");
        }
        return 2;


    }
    public static void main(String[] args) {
        try_catch_finally_Test test = new try_catch_finally_Test();
        System.out.println(test.run());
    }
}

