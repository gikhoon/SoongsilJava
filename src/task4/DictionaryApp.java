package task4;

abstract class PairMap{
    protected String [] keyArray;
    protected String [] valueArray;
    abstract String get(String key);
    abstract void put(String key,String value);
    abstract String delete(String key);
    abstract int length();
}
class Dictionary extends PairMap {
    private int length;
    String get(String key){
        for(int i=0;i<length;i++){
            if(keyArray[i].equals(key)) return valueArray[i];
        }
        return "null";
    }
    void put(String key,String value){
        for(int i=0;i<length;i++){
            if(keyArray[i].equals(key)){
                valueArray[i]=value;
                return;
            }
        }
        keyArray[length] = key;
        valueArray[length++] = value;
    }
    String delete(String key){
        for(int i=0;i<length;i++){
            if(keyArray[i].equals(key)){
                String value = valueArray[i];
                for(int j=i;j<length;j++){
                    keyArray[j] = keyArray[j+1];
                    valueArray[j] = valueArray[j+1];
                }
                length--;
                return value;
            }
        }
        return "없습니다";
    }
    int length(){
        return length;
    }
    Dictionary(){
        length=0;
    }
    Dictionary(int num){
        keyArray = new String[num];
        valueArray = new String[num];
        length=0;
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문","파이썬");
        dic.put("이재문","C++");
        System.out.println("삭제된 값은 "+dic.delete("이재성"));
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("삭제된 값은 "+dic.delete("황기태"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        System.out.println("갯수는 "+dic.length()+"개");
    }
}
