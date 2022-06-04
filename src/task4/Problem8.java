package task4;

class Point{
    private int x;
    private int y;
    @Override
    public String toString(){
        return "("+x+","+y+")의 점";
    }
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point(){
        this.x=0;
        this.y=0;
    }
}
class PositivePoint extends Point{
    @Override
    protected void move(int x,int y){
        if(x>0&&y>0) super.move(x,y);
    }
    public String toString(){
        return super.toString();
    }
    PositivePoint(){
        super();
    }
    PositivePoint(int x,int y){
        super();
        if(x>0&&y>0) super.move(x,y);
    }
}
public class Problem8 {
    public static void main(String[] args){
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");
        p.move(-5,5);
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString()+"입니다.");
    }
}
