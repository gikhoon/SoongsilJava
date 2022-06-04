package TestPackageA;

class A{
    static class B{
        private int staticClassPrivateB1;
        int staticClasDefaultB2;
        protected int staticClassProtectedB3;
        static public int staticClassStaticPublicB4=4;
        static public int StaticClassStaticPublicB5;
    }
    private int privateA1;
    static int staticDefaultA2; //nonstatic 안에 static 변수 선언 가능
    static int staticDefaultA3;
    protected int protectedA3;
    public int publicA4;

    public static void f(int protectedA3,int b){
        int fA1; //지역변수는 선언할 수 있다.
        //privateA1 = 1; privateA1은 non-static->this.privateA1이므로 선언 불가.
        staticDefaultA3 = 3; //static 변수는 선언 가능
    } //static 메소드의 인자는 다 가능하다.(값을 받아오는 기능만 하니까). 하지만 메소드 내용에는 static멤버변수만 가능->객체가 없을 때 함수를 호출 할 수있어야 하므로
    static void f2(int delta,A target){
        target.privateA1+=delta; //this를 사용하지 않았으므로 사용 가능하다. target 객체의 privateA1이 delta만큼 늘어났다.
    }
    static void f3(int delta){
        A.staticDefaultA2+=delta;
    }


    public static void main(String[] args) {
        A aClass = new A();
        //int value = aClass.b2; //클래스(TestPackageA.A) 안에 클래스(B)가 있는데 선언할 수 없다.(b1,b2,b3,b4 다)
        int b = B.staticClassStaticPublicB4; //스태틱 함수 안에 스태틱 변수가 있어야지 선언할 수 있다.
        A.f2(10,new A()); //이것도 가능 하지만 어디에 저장되는지 모른다.
    }
}
public class test1 {
    public static void print(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        test1.print();
    }
}
