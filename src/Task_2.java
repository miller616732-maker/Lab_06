import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yourGallons;
        double yourMPG;
        double yourGalPrice;
        double yourTotal;
        double distanceLeft;
        boolean valid = false;
        do {
            System.out.println("Enter your current gallons of gasoline");
            if (scan.hasNextDouble()){
                if () {
                }
                yourGallons = scan.nextDouble();
            } else {
                System.out.println("Please enter a valid number");
            }
            System.out.println("Enter your miles per gallon");
            if (scan.hasNextDouble()) {
                yourMPG = scan.nextDouble();
                if (yourMPG < 0) {
                    System.out.println("Please enter a valid number");
                }
            } else {
                System.out.println("Enter a valid number");
            }
            if (scan.hasNextDouble()) {
                yourGalPrice = scan.nextDouble();
            }
        } while (valid != false);
    }
}