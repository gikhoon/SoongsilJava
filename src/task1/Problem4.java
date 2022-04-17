package task1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int [] intList = new int[3];
        for(int i=0;i<3;i++) intList[i]=scanner.nextInt();
        int middle = 0;
        if (intList[0]<intList[1]){
            if(intList[2]<=intList[0]) middle=intList[0];
            else middle=(intList[2]>intList[1]?intList[1]:intList[2]);
        }
        else{
            if(intList[0]==intList[1]){
                middle=intList[0];
            }
            else{
                if(intList[2]>=intList[0]) middle=intList[0];
                else middle=(intList[2]>intList[1]?intList[2]:intList[1]);
            }
        }
        
        System.out.println("중간 값은 "+ middle);
    }
}
