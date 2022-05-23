package task3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
class SeatLine{
    private String grade;
    private String[] seat = new String[10];
    SeatLine(int i){
        switch (i){
            case 0:
                grade = "S";
                break;
            case 1:
                grade = "A";
                break;
            case 2:
                grade = "B";
                break;
        }
        Arrays.fill(seat, "---");
    }
    void showLine(){
        System.out.print(grade+">>");
        for (String s : seat) System.out.print(" " + s);
        System.out.println();
    }
    String getSeat(int i){
        return seat[i];
    }
    void bookingSeat(int num, String name){
        seat[num]=name;
    }
    void cancelingSeat(String name){
        boolean isExist = false;
        for(int i=0;i<seat.length;i++){
            if(seat[i].equals(name)){
                seat[i] = "---";
                isExist = true;
                break;
            }
        }
        if(!isExist) System.out.println("해당 이름이 없습니다");
    }
}
class SeatTable {
    static private SeatLine[] seatTable = new SeatLine[3];
    static void setSeatTable() {
        for (int i = 0; i < seatTable.length; i++) seatTable[i] = new SeatLine(i);
    }
    static void booking() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                int seatGrade = scanner.nextInt();
                int seatLineIndex=seatGrade-1;
                seatTable[seatLineIndex].showLine();
                System.out.print("이름>>");
                String name = scanner.next();
                System.out.print("번호>>");
                int num = scanner.nextInt();
                if(!seatTable[seatLineIndex].getSeat(num-1).equals("---")) {
                    System.out.println("이미 좌석이 차있습니다");
                    continue;
                }
                seatTable[seatLineIndex].bookingSeat(num-1, name);
                break;
            }catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
                System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
                scanner.nextLine();

            }
        }
    }
    static void showTable(){
        for (SeatLine seatLine : seatTable) seatLine.showLine();
    }
    static void canceling() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("좌석 S:1, A:2, B:3>>");
                int seatGrade = scanner.nextInt();
                int seatLineIndex = seatGrade - 1;
                seatTable[seatLineIndex].showLine();
                System.out.print("이름>>");
                String name = scanner.next();
                seatTable[seatLineIndex].cancelingSeat(name);
                break;
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
                scanner.nextLine();
            }
        }
    }
}
public class Problem12 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SeatTable.setSeatTable();
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            String selectNum = scanner.next();
            if (selectNum.equals("4")) break;
            switch (selectNum) {
                case "1":
                    SeatTable.booking();
                    break;
                case "2":
                    SeatTable.showTable();
                    break;
                case "3":
                    SeatTable.canceling();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다 다시 입력하세요");
                    scanner.nextLine();
            }
        }
    }
}



