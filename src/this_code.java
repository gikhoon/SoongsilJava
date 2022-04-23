public class this_code {
    String title;
    String author;
    void show(){
        System.out.println(title+" "+author);
    }
    public this_code(){
        this("this",""); //this_code(String,String) 생성자 실행 "test 생성자가 호출되었습니다.
        new this_code("test", "test"); //객체를 또 만든다. 이 값은 객체에는 없고 어떤 래퍼런스도 가르키지 않는다. 가비지로 감.
    }
    public this_code(String title){
        this_code(title,"");
    }//this_code 메소드가 호출됨. "test 함수가 호출되었습니다
    public this_code(String title, String author){
        this.title=title; this.author=author;
        System.out.println("test 생성자가 호출되었습니다");
    }
    public void this_code(String a,String b) {
        System.out.println("test 함수가 호출되었습니다");
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        this_code a = new this_code("hello"); //
        this_code b=new this_code();
        b.show();
        a.show();
    }
}
