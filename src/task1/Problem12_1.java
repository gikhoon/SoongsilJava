package task1;

import java.util.Scanner;

public class Problem12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();
        if(operator.equals("+")){
            System.out.println(a+operator+b+"의 값은 "+(a+b));
        }
        else if(operator.equals("-")){
            System.out.println(a+operator+b+"의 값은 "+(a-b));
        }
        else if(operator.equals("*")){
            System.out.println(a+operator+b+"의 값은 "+(a*b));
        }
        else if(operator.equals("/")){
            if(b==0){
                System.out.println("0으로 나눌 수 없습니다");
                return;
            }
            System.out.println(a+operator+b+"의 값은 "+(a/b));
        }
    }
}
