import java.lang.Math;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        double randomNum;
        int yourGuess = 0;
        boolean valid = false;
        Scanner scan = new Scanner(System.in);
        randomNum = (int) (Math.random() * 10) + 1;
        System.out.println(randomNum);
        System.out.println("Want to guess my number? \nEnter a number between 1 and 10!");
        do {
            if (scan.hasNextInt()) {
                yourGuess = scan.nextInt();
                if (yourGuess > 10 || yourGuess < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number between 1 and 10");
                } else {
                    valid = true;
                }
            } else {
                scan.nextLine();
                System.out.println("Please enter a valid number");
            }
        } while (!valid);
        if (yourGuess > randomNum) {
            System.out.println("Too high!");
        } else if (yourGuess < randomNum) {
            System.out.println("Too Low!");
        } else {
            System.out.println("You Win!!!");
        }
    }
}
