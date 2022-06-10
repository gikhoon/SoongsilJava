package TestPackageB;


import java.util.List;

//Q2
class Q2Parent{
    int i = 10;
    public int get(){
        return i;
    }
}
class Q2Child extends Q2Parent{
    int i = 8;
    public int get(){
        return i;
    }
}
public class Q2 {
    public static void print(Q2Parent p){
        System.out.println(p.i);
        System.out.println(p.get());
    }
    public static void main(String[] args) {
        Q2Parent p = new Q2Parent();
        System.out.println(p.i);
        System.out.println(p.get());

        Q2Child c = new Q2Child( );
        System.out.println(c.i);
        System.out.println(c.get());

        Q2Parent p2 = new Q2Child( );
        System.out.println(p2.i);
        System.out.println(p2.get());
        print(c); // 10,8
        print(p2); //10,8
    }
}



//Q3
class ChildException extends Exception { }
class GrandChildException extends ChildException{}
class ExceptionHandlingTest {
    static int count = 0;
    public static void main(String[ ] args) {
        while(true) {
            try {
                if(count++ == 0)
                    throw new ChildException( );
                System.out.println("CatchMe");
            } catch(ChildException e) {
                System.out.println("TestPackageB.ChildException");
            } finally {
                System.out.println("Finally");
                if(count == 2) break;
            }
        }
    }
}

//Q5
class ExceptionHandlingTest2 {
    public static void main(String args[ ]) {
        try {
            throw new GrandChildException( );
        } catch(GrandChildException g) {
            System.out.println("GrandChildException");
        } catch(ChildException c) {
            System.out.println("ChildException");
        }
        try {
            throw new GrandChildException( );
        } catch(ChildException c) {
            System.out.println("ChildException");
        }
    }
}


//Q7
interface RemoteControl{
    void turnOn();

    void turnOff();
}
class Problem7{
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turned On");
            }

            @Override
            public void turnOff() {
                System.out.println("Turned Off");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }
}


//Q9
class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}
class House {
    Window w1 = new Window(1);
    House() {
        System.out.println("House( )");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f( )");
    }
    Window w3 = new Window(3);
}

class InitializationTest {
    public static void main(String[ ] args) {
        House h = new House( );
        System.out.println();
        House h2 = new House();
        h.f();
    }
}


//Q11

class Cups {
    static{
        System.out.println("Cups start");
    }
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups( )");
    }
}
class Cup {
    static{
        System.out.println("Cup");
    }
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")"); }
    void f(int marker) {
        System.out.println("f(" + marker + ")"); }

}
class StaticTest {
    public static void main(String args[ ]) {
        System.out.println("main( )"); //main 시작하기 전에 static은 미리 초기화시킴 Cups->Cup->StaticTest순 위에서 부터 시작하는데 Class를 소환하면 거기에 있는 static 초기화
        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups( );
    static Cups cups2 = new Cups( );
}


//Q12
abstract class A2 {
    public A2 a;
    public A2() { System.out.println("A()"); } //Public 생략 가능...ㅜ return 타입만 없으면 됨
    abstract public void f();
}
class B2 extends A2 {
    B2() {
        super();
        System.out.println("B()");
    }

    public void f() {
        System.out.println("f()");
    }
}
class AbstractTest {
    public static void main(String[] args) {
        new B2().f();
    }
}



//Q13
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")"); }
    void f(int marker) {
        System.out.println("f(" + marker + ")"); }
}
class Mugs {
    Mug mug1 = new Mug(99); //static이면 처음 만들어질 때 생성되고 static이 아니면 객체가 만들어질때마자 실행된다.
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized"); }
    Mugs( ) {
        System.out.println("Mugs( )");
    }
    Mugs(int i) {
        System.out.println("Mugs(int)");
    }
    public static void main(String args[ ]) {
        System.out.println("Inside main( )");
        System.out.println();
        new Mugs( );
        System.out.println();
        System.out.println("new Mugs( ) completed");
        System.out.println();
        new Mugs(1);
        System.out.println();
        System.out.println("new Mugs(1) completed");
    }
}



//Q14
interface I1 extends I2 { void f(); }
interface I2 { default void f() { System.out.println("F() in I2");} }
interface I3 {void f(); }
interface I4 { static void f() { System.out.println("f() in I4");} }
abstract class AC1 { void f() { System.out.println("f() in AC");} }
abstract class AC2 {
    abstract void f();
}
class C1 extends AC1 implements I1, I3, I4 {
    public void f() {
        super.f(); //메소드
        System.out.println("f() in C"); }
}
class C2 extends AC2 implements I2, I3, I4 {
    public void f() {
        I2.super.f(); //interface 속 default 메소드는 I2.super.f()로 선언
        I4.f(); //Interface 속 static 메소드는 I4.으로 선언
        System.out.println("f() in C"); }
}
class InterfaceTest {
    public static void main(String[] args) {
        I2 object1 = new C1();
        object1.f();
        I3 object2 = new C2();
        object2.f();
    }
}

//Q15
class Egg {
    protected class Yolk {
        public Yolk() { System.out.println("Egg.Yolk()"); }
        public void f() { System.out.println("Egg.Yolk.f()"); }
    }
    private Yolk y = new Yolk();
    public Egg() { System.out.println("New Egg()"); }
    public void insertYolk(Yolk yy) { y = yy; }
    public void g() { y.f(); }
}
class BigEgg extends Egg {
    public class Yolk extends Egg.Yolk {
        public Yolk() { System.out.println("BigEgg.Yolk()"); }
        public void f() { System.out.println("BigEgg.Yolk.f()"); }
    }
    public BigEgg() { insertYolk(new Yolk()); }
    public static void main(String[] args) {
        Egg e = new BigEgg();
        System.out.println();
        e.g();
    }
}

//Q8

class Q8A{

}
class Q8<L,E>{
    Q8A a = new Q8A();

}
