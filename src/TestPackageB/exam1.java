package TestPackageB;
class A1 {
    public A1() {
        System.out.println("A");
    }

    public A1(int a) {
        System.out.println("A a");
    }
}

class B1 extends A1 {
    public B1() {
        this(10); //B1(10)실행
        System.out.println("B");
    }

    public B1(int a) {
        super(a); //A1(10)실행
        System.out.println("B a");
    }
}
public class exam1 {
    public static void main(String[] args) {
        new B1(); //A a     B a     B실행
    }
}
