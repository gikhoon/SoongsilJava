import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        char character = scanner.next().charAt(0);
        for (byte i=(byte)character;i>=(byte)'a';i--){
            for(byte j=(byte)'a';j<=i;j++)
                System.out.print((char)j);
            System.out.println();
        }
    }
}
