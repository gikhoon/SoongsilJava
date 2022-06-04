package TestPackageA.A2;


import TestPackageA.test1;

class A2{
    static class B{
        private int staticClassPrivateB1;
        int staticClassDefaultB2;
        protected int staticClassProtectedB3;
        static public int staticClassStaticPublicB4=4;
    }
    private int privateA1;
    int defaultA2;
    protected int protectedA3;
    public int publicA4;
    public static void main(String[] args) {
        A2 a2 = new A2();
        test1.print(); //public static 함수 print는 실행 가능
        test1 t1 = new test1(); //test1이 public이므로 객체 만들기 가능
        int b = B.staticClassStaticPublicB4; //스태틱 함수 안에 스태틱 변수가 있어야지 선언할 수 있다.
    }
}
public class test1_2 {
}
