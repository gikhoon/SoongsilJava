public class test_Overloading {
    /*public int getSum(int i, int j){
        return i+j;
    }*/
    public double getSum(double i,double j){
        return i-j;
    }
    public double getSum(float i,float j){
        return i*j;
    }
    public double getSum(float i,double j){
        return i+j;
    }
    public double getSum(int i,double j){
        return i/j;
    }
    public static void main(String[] args) {
        test_Overloading a = new test_Overloading();
        double j = a.getSum(1.7,(short)2.7);
        double k = a.getSum(1,2.3);
        double m = a.getSum(1,2.7);
        System.out.println(j+" "+k+" "+m);
    }
}
