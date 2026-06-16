import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String userschoice;

        System.out.print("What do you choose: ");
        userschoice = scanner.next();

        int computerschoice = random.nextInt(3);

        if(userschoice.equals("rock") && computerschoice == 0) {
            System.out.print("It's a draw");
        }
        else if(userschoice.equals("paper") && computerschoice == 1){
            System.out.print("It's a draw");
        }
        else if(userschoice.equals("scissors") && computerschoice == 2){
            System.out.print("It's a draw");
        }
        else if(userschoice.equals("rock") && computerschoice == 2) {
            System.out.print("User Wins");
        }
        else if(userschoice.equals("paper") && computerschoice == 0){
            System.out.print("User Wins");
        }
        else if(userschoice.equals("scissors") && computerschoice == 1){
            System.out.print("User Wins");
        }
        else if(userschoice.equals("rock") && computerschoice == 1){
            System.out.print("Computer Wins");
        }
        else if(userschoice.equals("paper") && computerschoice == 2 ){
            System.out.print("Computer Wins");
        }
        else if(userschoice.equals("scissors") && computerschoice == 0){
            System.out.print("Computer Wins");
        }


        scanner.close();
    }

    }