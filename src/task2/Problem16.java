package task2;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
        while(true){
            System.out.print("가위 바위 보!>>");
            String playerChoiceString = scanner.next();
            if(playerChoiceString.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            }
            int playerChoice=0;
            boolean isPlayerChoiceStringCorrect = false;
            for(int i=0;i<str.length;i++){
                if(str[i].equals(playerChoiceString)){
                    playerChoice=i;
                    isPlayerChoiceStringCorrect=true;
                    break;
                }
            }
            if(!isPlayerChoiceStringCorrect){
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
                continue;
            }
            int computerChoice = (int)(Math.random()*3);
            if((playerChoice==0)&&computerChoice==2){
                System.out.println("사용자 = "+str[playerChoice]+" , 컴퓨터 = "+str[computerChoice]+ ", 사용자가 이겼습니다.");
                continue;
            }
            if((playerChoice==2)&&(computerChoice==0)){
                System.out.println("사용자 = "+str[playerChoice]+" , 컴퓨터 = "+str[computerChoice]+ ", 컴퓨터가 이겼습니다.");
                continue;
            }
            if(playerChoice>computerChoice) System.out.println("사용자 = "+str[playerChoice]+" , 컴퓨터 = "+str[computerChoice]+ ", 사용자가 이겼습니다.");
            else if(playerChoice<computerChoice) System.out.println("사용자 = "+str[playerChoice]+" , 컴퓨터 = "+str[computerChoice]+ ", 컴퓨터가 이겼습니다.");
            else System.out.println("사용자 = "+str[playerChoice]+" , 컴퓨터 = "+str[computerChoice]+ ", 비겼습니다.");
        }
    }
}
