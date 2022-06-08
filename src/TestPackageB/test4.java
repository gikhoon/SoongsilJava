package TestPackageB;

interface Interface{
    int i =10;
    public abstract void funct();
    void f();
    default void defaultF(){
        System.out.println("defaultF");
    }
}
class class5 implements Interface{
    @Override
    public void funct(){
        System.out.println("funct");
    }
    public void f(){
        System.out.println(i);
        System.out.println("f");
    }
    @Override
    public void defaultF(){
        System.out.println("class5DefaultF");
    }
}
abstract class class1{
    abstract void hello();
    static void staticF(){
        System.out.println("staticF");
    }
    public void draw(){
        System.out.println("TestPackageB.class1");
    }
}
class class2 extends class1{
    void hello(){
        System.out.println("class2Hello");
    }
    public void draw(){
        System.out.println("TestPackageB.class2");
    }
}
class class3 extends class2{
    void hello(){

    }
}
public class test4 {
    static void goOn(Interface i){
        i.f();
        i.funct();
        System.out.println(i.i);
        i.defaultF();
    }
    static void paint(class1 c){
        c.draw();
        c.hello();
    }
    public static void main(String[] args) {
        paint(new class2());
        class1.staticF(); //추상클래스라서 객체는 못만들지만 static 함수는 출력할 수 있다
        goOn(new class5());
    }
}
