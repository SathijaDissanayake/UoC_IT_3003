import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        while (i<=number) {
            sum += i;
            i++;
        }
        System.out.println("The sum is: " + sum);
    }
}
