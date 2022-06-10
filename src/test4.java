class Box<T>{
    T t;
    public <T> T method1(T t){
        return t;
    }
    public T method2(T t){
        return t;
    }
    Box(T t){
        this.t=t;
    }
}
public class test4 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(3);
        Box<String> box2 = new Box<>("String");
        System.out.println(box.method1(box2).t); //method1안에 <T>가 있으므로 다른 타입의 값을 넣을 수 있다.
        //System.out.println(box.method2(box2).t); 컴파일 에러 method2는 <T>가 없으므로  T는 Box타입이다.
    }
}
