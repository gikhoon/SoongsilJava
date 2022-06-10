abstract class Class0{
    void print(){
        System.out.println("A");
    }
    //private abstract void f(){}; 컴파일 오류. private와 abstract은 같이 있을 수 없다.
}

class Class1 extends Class0{
    Class1(){
        System.out.println("class 1 생성됨");
    }
    void print(){
        System.out.println("B");
    }
}
class Class2 extends Class1{
    void print(){
        //super.super.print(); //오류
        System.out.println("C");
    }
    Class2(){
        System.out.println("class 2 생성됨");
    }
}
public class 접근지정자 {
    public static void main(String[] args) {
        Class1 c = new Class2();
        Class0 c0 = new Class2();
        c0.print();

    }
}

class Test{
    int aa;
    static int bb;
    class Innner{
        int a;
        //static int a;
    }
    static class Inner2{
        int a;
        //aa=5
        static int b;
    }
}