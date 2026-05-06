import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int choice;
        int sum = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do {
            sum += i;
            i++;
            System.out.println("Enter choice (0 to stop, any other number to continue): ");
            choice = sc.nextInt();
            sc.nextLine();
        } while (choice != 0);
        System.out.println("The sum is: " + sum);
    }
}
