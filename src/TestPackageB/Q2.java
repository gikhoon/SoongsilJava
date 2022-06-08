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
