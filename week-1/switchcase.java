import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter another number: ");
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println("select 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result: " + (number1 / number2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}