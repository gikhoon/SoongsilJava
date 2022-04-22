import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        byte a = 0120; //0120은 바이트 범위를 넘어가지 않으니까 자동으로 형변환이 된다. 에러 X
        System.out.println(a);
        char s = 'a';
        System.out.println(s+1); //98
        String f = new String(); // null 저장
        System.out.println(f+"abcd"); //null+"abcd" -> abcd출력

        int b = 0xffffffff;
        System.out.println(b);
        byte d = 0144; //8진수일때 크기가 byte 안에 있고 마지막 비트가 0이므로 자동으로 바뀐다
        //byte e = 0244; 에러 발생 0244는 마지막 비트가 1이므로 형 변환을 해줘야한다 양수인 값이 음수로 바뀌지 때문에 값의 손실이 있다.
        byte e = (byte)0244;
        System.out.println("e : "+e);
        //byte c = 0x8f; 에러 발생 0x8f는 byte가 저장할 수 있는 값 내에 있지만 10진수가 아닐때
        // (8진수,16진수일때)는 제일 밖 값이 1이어야한다. 0x8f = 10001111
        //int g = 24L; 에러 발생 int의 최대 범위를 넘지는 않았지만 Long 타입으로 선언되어서 자동형변환이 안된다
    }
}
class test2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt(); //10(\n)하면 d에 10입력 \n하는 순간 d=10 h=""
        String h = scanner.nextLine(); // nextLine()은 하나의 줄을 다 받는다.
        System.out.println(d+h);
    }
}
class test3{
    public static void main(String[] args) {
        boolean[] a = new boolean[2]; //false 고정값
        long[] b = new long[2]; // 0
        float [] c = new float[2]; // 0.0
        String[] d = new String[2]; //null
        System.out.println(a[0] + " "+b[0]+" "+c[0]+" "+d[0]);
    }
}
class test4{
    public static void main(String[] args) {
        byte a = 20;
        byte b = (20 >>2);
        //byte c = (a << 2) 불가능(에러) a<<2는 기본적으로  int이다 그리고 식이기 때문에 크기가 작더라도 자동 형 변환이 안된다.
        System.out.println(b);
    }
}
class test5{
    public static void main(String[] args) {
        int x = 8^2;
        int y = x*2;
        int z = 8;
        int d = (8+8)^2;
        System.out.println(y+" "+d);
    }
}
class test6 {
    public static void main(String[] args) {
        int size = 0;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class test7{
    int i;
    public static void main(String[] args) {
        int [] a= new int[]{'A','B','C'};
        System.out.println(a[args.length]);
        double [] array=new double[]{'A','B','C','D','E'};
        test7 test7 = new test7();
        System.out.println(test7.i);

    }
}
class test8{
    public static void main(String[] args) {
        int[][] num ={{1,2,3},{4,5,6},{7,8,9}};
        for(int[] k:num){
            System.out.println(k[k[0]]+" ");
        }
    }
}

class test9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0, n=0;
        for(int i=0;i<3;i++){
            System.out.print(i+">>");
            try{
                n=scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("잘못 입력했다");
                scanner.next();
                i--;
                continue;
            }
            sum+=n;
        }
        System.out.println(sum);
    }
}

class test10 {
    public static void main(String[] args) {
        try {
            char[] a = new char[]{'A', 'B', 'C'};
            try {
                for (int i = 0; i <= a.length; i++)
                    System.out.print(a[i]+" ");
                System.out.print("Hello ");
            } catch (NullPointerException e) {
                System.out.print("D ");
            } finally {
                System.out.println("E ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("F "); //안쪽 try에서 발생한 에러는 안쪽 catch에 있는 오류만 잡아낸다
        } finally {
            System.out.println("G ");
        }
    }
}

