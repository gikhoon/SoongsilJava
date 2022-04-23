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
        byte e = (byte)0244; //10010010
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
        int a = -20;
        byte k = -20;
        byte b = (20 >>2);
        byte c = 2;
        byte z = (-20 >>2); //불가능 컴파일 에러 -20은
        byte y = -20>>2;
        byte x = 20<<32; //20출력
        //byte x = -20>>>2; 컴파일 에러
        //byte c = (a >> 2); 불가능(에러) a<<2는 기본적으로  int이다 그리고 식이기 때문에 크기가 작더라도 자동 형 변환이 안된다.
        //byte d = (40<<2);
        System.out.println(x);
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
class test8 {
    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {3, 5, 6}, {2, 8, 9}};
        for (int[] k : num) {
            try {
                System.out.println(k[k[0]] + " ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error");
            }
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
            System.out.println(a[args.length]);
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
            System.out.println("F "); //안쪽 try에서 에러를 처리하면 실행 안되고 처리를 못했으면 try finally가 다 끝나고 처리한다
        } finally {
            System.out.println("G ");
        }
    }
}
class test11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int a = scanner.nextInt();
        try{
            System.out.println(d/a);
        }catch (ArithmeticException e){
            System.out.println("0으로 못나눠");
        }
    }
}
class test12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextInt(); //double이 들어가면 a/0이면 Infinity 출력 0/0이면 NaN출력
        int a = scanner.nextInt();
        System.out.println(d/a);
    }
}

class Book {
    String title;
    String author;
    int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, int ISBN) {
        this(title, "I’m like TT", ISBN);
    }

    public Book() {
        this(null, null, 0);
        System.out.println("Just like TT ");
    }

    public static void main(String[] args) {
        Book book[]=new Book[3];
        book[0] = new Book("이런내맘모르고", "너무해너무해", 3333);
        book[1]= new Book("tell me", 1);
        book[2]= new Book();
        for(int i=0;i<book.length;++i)
            System.out.println(book[i].title+" "+book[i].author+" "+book[i].ISBN);
    }
}
class test13{
    public static void main(String[] args) {
        try{
            int a[] = new int[]{'A', 'B', 'C'};
            System.out.println(a[args.length]);
            try {
                for (int i =0; i <= a.length; i++)
                    System.out.println(a[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("D");
            } finally {
                System.out.println("E");
            }
        } catch(NullPointerException e) {
            System.out.println("F");
        } finally {
            System.out.println("G");
        }
    }
}

class test14 {
    public static void main(String[] args) {
        int size = 0;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class test15{
    public static void main(String[] args) {
        int x1 = 8;
        int y1 = 8;
        int radius1 = 8;

        int x2 = 0;
        int y2 = 0;
        int radius2 = 8;

        int distanceX = (x1 - x2) ^ 2;
        int distanceY = (y1 - y2) ^ 2;
        int distance = distanceX + distanceY;

        int d = (radius1 + radius2) ^ 2;

        System.out.println(distance+" "+d);
        if (distance < d)
            System.out.println("두 원은 겹칩니다.");
        else
            System.out.println("두 원은 겹치지 않습니다.");
    }

}
