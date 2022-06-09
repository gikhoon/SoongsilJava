package TestPackageB;

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
        h.f();
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")"); }
    void f(int marker) {
        System.out.println("f(" + marker + ")"); }
}
class Cups {
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

class StaticTest {
    public static void main(String args[ ]) {
        System.out.println("main( )");
        Cups.cup1.f(99);
    }
    static Cups cups1 = new Cups( );
    static Cups cups2 = new Cups( );
}
