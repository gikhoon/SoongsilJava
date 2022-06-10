import java.rmi.StubNotFoundException;

class Person{
    String name;
    String id;
    public Person(String name){
        this.name=name;
        id = "ID";
    }
}
class Student extends Person{
    String grade = "A";
    String department;
    public Student(String name){
        super(name);
    }
}

public class test3 {
    public static void main(String[] args) {
        Person p = new Student("이재문"); //변수 선언 가능:name,id만 선언 가능
        System.out.println(p.name); // 이재문 출력
        Student i = (Student)p; //안에 Person,Student 객체가 있다.
        System.out.println(i.grade); //접근 가능 범위를 Student까지 늘렸다
        System.out.println(i.id);
        Person z = new Person("남기훈");
        Student s = (Student)z; //안에는 Person 객체만 있다
        System.out.println(s.grade); //실행 시 오류 발생(ClassCastException) s에는 가르키는것은 s범위까지 실제 있는 객체는 z범위만 있다.
    }
}