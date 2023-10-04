import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.println("---------------");

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + getBMICategory(bmi));

        scanner.close();
    }

    // Calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Determine BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
