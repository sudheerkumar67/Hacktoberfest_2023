import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("BMI Calculator\n---------------");

            double weight = getDoubleInput(scanner, "Enter your weight in kilograms: ");
            double height = getDoubleInput(scanner, "Enter your height in meters: ");

            double bmi = weight / (height * height);

            System.out.println("Your BMI is: " + bmi);
            System.out.println("BMI Category: " + getBMICategory(bmi));
        }
    }

    private static double getDoubleInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal Weight";
        if (bmi < 29.9) return "Overweight";
        return "Obese";
    }
}
