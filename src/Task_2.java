import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yourGallons = 0;
        double yourMPG = 0;
        double yourGalPrice = 0;
        double yourTotal;
        double distanceLeft;
        boolean validGal = false;
        boolean validMPG = false;
        boolean validPrice = false;
        do {
            System.out.println("Enter your current gallons of gasoline");
            if (scan.hasNextDouble()) {
                yourGallons = scan.nextDouble();
                if (yourGallons < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number");
                } else {
                    validGal = true;
                }
            }else{
                scan.nextLine();
                System.out.println("Enter a valid number");
        }
        } while (!validGal) ;
        do {
            System.out.println("Enter your miles per gallon");
            if (scan.hasNextDouble()) {
                yourMPG = scan.nextDouble();
                if (yourMPG < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number");
                } else {
                    validMPG = true;
                }
            } else {
                scan.nextLine();
                System.out.println("Enter a valid number");
            }
        } while (!validMPG);
        do {
            System.out.println("Enter your cost per gallon");
            if (scan.hasNextDouble()) {
                yourGalPrice = scan.nextDouble();
                if (yourGalPrice < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number");
                } else {
                    validPrice = true;
                }
            } else {
                scan.nextLine();
                System.out.println("Enter a valid number");
            }
        } while (!validPrice);
        yourTotal = 100/yourMPG * yourGalPrice;
        distanceLeft = yourMPG * yourGallons;
        System.out.printf("%-10s%10.2f","Your price per gallon is:",yourTotal);
        System.out.printf("\n%-10s%10.2f","Your remaining miles are",distanceLeft);

    }
}