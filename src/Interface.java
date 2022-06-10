interface Interface1{
    void method();
    default void newDefaultMethod(){
        System.out.println("newDefaultMethod in Interface");
    }
}
class SuperCls{
    public void newDefaultMethod(){
        System.out.println("newDefault in SuperCls");
    }
}
interface AnotherInterface{
    public void newDefaultMethod();
}
class Cls extends SuperCls implements Interface1, AnotherInterface{
    @Override
    public void method(){
        System.out.println("method() in Cls");
    }
    public void newDefaultMethod(){
        System.out.println("newDefault in SuperCls");
        Interface1.super.newDefaultMethod();
    }
}
public class Interface {
    public static void main(String[] args) {
        Cls c1 = new Cls();
        c1.method();
        c1.newDefaultMethod();
        SuperCls c2 = new SuperCls();
        c2.newDefaultMethod();
    }
}
