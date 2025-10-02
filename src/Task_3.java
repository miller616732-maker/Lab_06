import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideUno = 0;
        double sideDos = 0;
        double yourArea;
        double yourPerimeter;
        double yourDiagonal;
        boolean validUno = false;
        boolean validDos = false;
        System.out.println("Please enter your first number");
        do {
            if (scan.hasNextDouble()) {
                sideUno = scan.nextInt();
                if (sideUno < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number");
                } else {
                    validUno = true;
                }
            } else {
                scan.nextLine();
                System.out.println("Please enter a valid number");
            }
        } while (!validUno);
        System.out.println("Please enter your second number");
        do {
            if (scan.hasNextDouble()) {
                sideDos = scan.nextInt();
                if (sideDos < 0) {
                    scan.nextLine();
                    System.out.println("Please enter a valid number");
                } else {
                    validDos = true;
                }
            } else {
                scan.nextLine();
                System.out.println("Please enter a valid number");
            }
        } while (!validDos);
        yourArea = sideUno * sideDos;
        yourPerimeter = (2*sideUno) + (2*sideDos);
        //Found a square root thing
        yourDiagonal = Math.sqrt((sideUno * sideUno) + (sideDos * sideDos));
        System.out.printf("%-10s%7.2f","Your first side is:",sideUno);
        System.out.printf("\n%-10s%7.2f","Your second side is:",sideDos);
        System.out.printf("\n%-10s%7.2f","Your area is:",yourArea);
        System.out.printf("\n%-10s%7.2f","Your perimeter length is:",yourPerimeter);
        System.out.printf("\n%-10s%7.2f","Your diagonal length is:",yourDiagonal);


    }
}
