import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class test6 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.add(9));
        vector.add(10);
        vector.add(10);
        System.out.println(vector.indexOf(10));
        System.out.println(vector.remove(Integer.valueOf(10))); //10객체 첫번째 요소 삭제
        System.out.println(vector.remove("10")); //10객체가 아닌 string 10이므로 false출력
        //System.out.println(vector.remove(10)); //10번쨰 index가 없으므로 exception 발생
        HashMap<String, String> h = new HashMap<>();
        h.put("1", "2");
        h.put("2", "3");
        h.put("3", "4");
        h.put("4", "5");
        h.put("4", "6");
        Set<String> key = h.keySet();
        Iterator<String> it = key.iterator();
        while(it.hasNext()){
            String keys = it.next();
            System.out.println(it); //iterator는 값을 가지고 오는게 아니다. java.util.HashMap$KeyIterator@3ac3fd8b출력
            System.out.println(keys);
        }
    }
}
