import java.util.Scanner;

public class userInputs {
    public static void main(String[] args) {
        System.out.println("enter a value");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Number:" + num);


        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("Name: " + name);
    }
}
