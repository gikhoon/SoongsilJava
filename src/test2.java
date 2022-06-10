class Test2Class1{
    int x =0;
    int y =0;
    int z = 0;
    void f1(){
        System.out.println("1");
    }
}
class Test2Class2 extends Test2Class1{
    int x =1;
    private int y =2;
    @Override
    void f1(){
        System.out.println("2");
    }
    void f2(){
        f1();
    } //f1()은 첫째로 자기 클래서에서 f1을 먼저 찾고 없으면 부모클래스에서 찾는다
}
public class test2 {
    public static void main(String[] args) {
        Test2Class1 test1 = new Test2Class2(); //본체는 Test2Class1이다.
        Test2Class2 test2 = new Test2Class2();
        test2.f2();
        System.out.println("test2.x: " +test2.x+ "\ntest1.x: "+test1.x); // test2.x = 1, test1.x=0
        System.out.println("test1.y: "+test1.y); //data type이 Class1이므로 Class1에 있는 y를 가지고 온다.
        System.out.println("test2.z: "+test2.z); //test2에는 z변수가 없으므로 부모 객체에서 시작해 제일 먼저 나오는 z 선택=>0출력
        //test2.f2(); 컴파일 에러 컴파일러에는 Class1에는
        //Test2Class2 test2 = new Test2Class1(); 컴파일 에러 슈퍼클래스 객체를 서브클래스를 데이터타입으로 하려면 강제 캐스팅을 해줘야한다
    }
}
