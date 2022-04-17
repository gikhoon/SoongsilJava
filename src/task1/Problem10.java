package task1;

import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int c1x = scanner.nextInt();
        int c1y = scanner.nextInt();
        int c1r = scanner.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int c2x = scanner.nextInt();
        int c2y = scanner.nextInt();
        int c2r = scanner.nextInt();
        double distance = Math.sqrt(Math.pow((c1x-c2x),2)+Math.pow((c1y-c2y),2));
        if((c1r+c2r>distance)&&(Math.abs(c1r-c2r)<distance)) 
            System.out.println("두 원이 겹친다.");
        else System.out.println("두 원이 겹치지 않는다");
    }
}
