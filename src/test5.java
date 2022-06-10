public class test5 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = new String("Hello");
        a = a.replace("l", "b");
        System.out.println(a); //Hebbo 다 replace한다.
        String c = new String("Bye");
        System.out.println(a.hashCode()); //a와 b의 해쉬코드 값은 일치한다.
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a.hashCode() == b.hashCode()); //true
        System.out.println(a == b); //false
        b = b.intern();
        System.out.println(b.hashCode()); //이전과 일정
        System.out.println(a == b); // true   b.intern()해서 a와 같은 Hello를 가르킨다
        System.out.println(b.contains("Ho")); //false   붙어있는것만 포함하는지 확인
        System.out.println(b.contains("He")); //true

        StringBuffer s = new StringBuffer("Hello");
        System.out.println(s.hashCode()); //string이랑 hashCode가 다르다
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}
