import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();
        for (int j : unit) {
            int count = money / j;
            if (count != 0) {
                System.out.println(j + "원 짜리 : " + count + "개");
                money -= count * j;
            }
        }
    }
}
