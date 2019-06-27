import java.util.Scanner;

public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double fahrenheit , celsius;
        while (true) {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("You choice? :");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius:");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Not Found!");
                    break;
            }
        }
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius =  (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit =  (celsius / (5.0 / 9)) + 32;
        return fahrenheit;
    }

}
