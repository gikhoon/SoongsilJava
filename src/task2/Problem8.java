package task2;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int num = scanner.nextInt();
        if(num<1){
            System.out.println("0보다 큰 수를 입력해주세요");
            return;
        }
        int[] array = new int[num];
        for(int i=0;i<array.length;){
            boolean isInArray = false;
            int ran = (int)(Math.random()*99+1);
            for(int j=0;j<i;j++){
                if(ran==array[j]) {
                    isInArray = true;
                    break;
                }
            }
            if(isInArray) continue;
            array[i++]=ran;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i%10==9) System.out.println();
            else System.out.print("  ");
        }
    }
}
