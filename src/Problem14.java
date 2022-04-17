import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        String []course = {"Java","C++","HTML5","컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean isExist = false;
            System.out.print("과목 이름>>");
            String insertCourse = scanner.next();
            if(insertCourse.equals("그만")) break;
            for (int i=0;i<course.length;i++){
                if (insertCourse.equals(course[i])) {
                    System.out.println(course[i]+"의 점수는 "+score[i]);
                    isExist=true;
                    break;
                }

            }
            if(!isExist) System.out.println("없는 과목입니다");
        }
    }
}
