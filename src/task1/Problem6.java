package task1;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-99사이의 정수를 입력하시오>>");
        int num=scanner.nextInt();
        int ten=num/10;
        int one=num%10;
        boolean isTen369 = ten==3||ten==6||ten==9;
        boolean isOne369 = one==3||one==6||one==9;
        if(isTen369&&isOne369) System.out.println("박수짝짝");
        else if(isTen369||isOne369) System.out.println("박수짝");
    }
}
