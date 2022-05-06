import java.util.Scanner;
class Phone{
    private String name;
    private String tel;
    Phone(String name,String tel){
        this.name=name;
        this.tel=tel;
    }
    String getName(){ return name; }
    String getTel(){ return tel; }
}
class PhoneBook{
    static private Phone [] phones;
    static void savePhones(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = scanner.nextInt();
        phones = new Phone[num];
        for(int i=0;i<num;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();
            phones[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");
    }
    static void findPhones(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("검색할 이름>>");
            String name =scanner.next();
            if(name.equals("그만")) break;
            boolean isHaveName = false;
            for(int i=0;i<phones.length;i++){
                if(phones[i].getName().equals(name)){
                    System.out.println(phones[i].getName()+"의 번호는 "+phones[i].getTel()+" 입니다");
                    isHaveName=true;
                    break;
                }
            }
            if(!isHaveName) System.out.println(name+" 이 없습니다");
        }
    }
}
public class Problem8 {
    public static void main(String[] args) {
        PhoneBook.savePhones();
        PhoneBook.findPhones();
    }
}
