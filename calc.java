import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Advanced Calculator ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Sine");
            System.out.println("8. Cosine");
            System.out.println("9. Tangent");
            System.out.println("10. Log (base 10)");
            System.out.println("11. Natural Log");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            double a, b;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0)
                        System.out.println("Result: " + (a / b));
                    else
                        System.out.println("Error: Division by zero");
                    break;
                case 5:
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(a, b));
                    break;
                case 6:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.sqrt(a));
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(a)));
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(a)));
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.tan(Math.toRadians(a)));
                    break;
                case 10:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.log10(a));
                    break;
                case 11:
                    System.out.print("Enter number: ");
                    a = sc.nextDouble();
                    System.out.println("Result: " + Math.log(a));
                    break;
                case 12:
                    running = false;
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
