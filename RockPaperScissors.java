import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String usersChoice;

        System.out.print("What do you choose: ");
        usersChoice = scanner.next();

        int computersChoice = random.nextInt(3);

        if(usersChoice.equals("rock") && computersChoice == 0) {
            System.out.print("It's a draw");
        }
        else if(usersChoice.equals("paper") && computersChoice == 1){
            System.out.print("It's a draw");
        }
        else if(usersChoice.equals("scissors") && computersChoice == 2){
            System.out.print("It's a draw");
        }
        else if(usersChoice.equals("rock") && computersChoice == 2) {
            System.out.print("User Wins");
        }
        else if(usersChoice.equals("paper") && computersChoice == 0){
            System.out.print("User Wins");
        }
        else if(usersChoice.equals("scissors") && computersChoice == 1){
            System.out.print("User Wins");
        }
        else if(usersChoice.equals("rock") && computersChoice == 1){
            System.out.print("Computer Wins");
        }
        else if(usersChoice.equals("paper") && computersChoice == 2 ){
            System.out.print("Computer Wins");
        }
        else if(usersChoice.equals("scissors") && computersChoice == 0){
            System.out.print("Computer Wins");
        }


        scanner.close();
    }

    }