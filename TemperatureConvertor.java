import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display instructions
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Enter the temperature value and specify the unit (C or F).");
        
        // Input temperature value
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();
        
        // Input unit (Celsius or Fahrenheit)
        System.out.print("Specify the unit (C for Celsius / F for Fahrenheit): ");
        char unit = scanner.next().charAt(0);
        
        // Perform conversion based on user input
        double convertedTemperature;
        if (unit == 'C' || unit == 'c') {
            convertedTemperature = (temperature * 9/5) + 32;
            System.out.println("Converted temperature in Fahrenheit: " + convertedTemperature + " °F");
        } else if (unit == 'F' || unit == 'f') {
            convertedTemperature = (temperature - 32) * 5/9;
            System.out.println("Converted temperature in Celsius: " + convertedTemperature + " °C");
        } else {
            System.out.println("Invalid unit. Please specify 'C' for Celsius or 'F' for Fahrenheit.");
        }
        
        scanner.close();
    }
}