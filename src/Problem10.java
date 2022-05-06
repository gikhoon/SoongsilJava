import java.util.Scanner;
class Dictionary{
    private static String[] kor = {"사람", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        for(int i=0;i<kor.length;i++){
            if(kor[i].equals(word)) return eng[i];
        }
        return null;
    }
}
public class Problem10 {
    public static void main(String[] args) {
        System.out.println("한영 단어 검색 프로그램입니다.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("한글 단어?");
            String str = scanner.nextLine();
            if (str.equals("그만")) break;
            if (Dictionary.kor2Eng(str) == null) {
                System.out.println(str + "은 저의 사전에 없습니다");
                continue;
            }
            System.out.println(str + "은 " + Dictionary.kor2Eng(str));
        }
    }
}
