import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the temperature in Fahrenheit: ");
        int tempFahrenheit = sc.nextInt();
        int tempCelsius = ((tempFahrenheit - 32) * 5) / 9;
        System.out.println("The temperature " + tempFahrenheit + "°F in Celsius is: " + tempCelsius +"°C");

        sc.close();
    }
}