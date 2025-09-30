import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC;
        double tempF;
        boolean valid = false;
        do {
            System.out.println("Please enter a temperature in Celsius to be converted to the Fahrenheit:");
            if (scan.hasNextDouble()){
                tempC = scan.nextDouble();
                tempF = (tempC*9/5) + 32;
                System.out.printf("Temperature (Celsius): %10.2f", tempC);
                System.out.printf("\nTemperature (Fahrenheit): %10.2f", tempF);
                valid = true;
            }else{
                System.out.println("You must enter a valid temperature in Celsius");
                scan.nextLine();
            }
        } while (!valid);

    }
}