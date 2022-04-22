package task2;

public class Problem10 {
    public static void main(String[] args) {
        int[][] array=new int[4][4];
        for(int i=0;i<10;){
            int ran= (int)(Math.random()*16);
            if(array[ran/4][ran%4]==0) {
                array[ran / 4][ran % 4] = (int)(Math.random()*10+1);
                i++;
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++) System.out.print(array[i][j]+"   ");
            System.out.println();
        }
    }
}
