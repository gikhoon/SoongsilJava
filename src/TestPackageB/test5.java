package TestPackageB;

import java.util.LinkedList;
import java.util.List;
class A{}
class B extends A{
}
class C extends B{
}
class D extends C{}
public class test5 {
    public static void main(String[] args) {
        List<? super B> l = new LinkedList<>();
    }
}
