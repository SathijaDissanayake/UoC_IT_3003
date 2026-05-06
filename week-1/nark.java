import java.util.Scanner;

public class nark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int mark = sc.nextInt();
        if (mark >= 75) {
            System.out.println("Grade: A");
        } else if (mark >= 55) {
            System.out.println("Grade: B");
        } else if (mark >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
