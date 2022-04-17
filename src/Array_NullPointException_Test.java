import java.util.SortedMap;

public class Array_NullPointException_Test {
    public static void main(String[] args){
        String a = new String("GOOD");
        String b= new String("Bad");
        String c = new String("Normal");
        String d,e;
        a = null;
        int [] array = new int[3];
        System.out.println(array[2]); //0출력
        array=null; //heap에 있는 객체 반환.
//        System.out.println(array[2]); //오류[NullPointException]
    }
}
