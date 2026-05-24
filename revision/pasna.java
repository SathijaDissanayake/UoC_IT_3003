package revision;

public class pasna {
    int a = 10;
    int b = 20;

    int add(int q, int s) {
        int sum = q + s;
        return sum;
    }

    void sum(int x, int y) {
        int sum = x + y;
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        pasna p1 = new pasna();
        int result1 = p1.add(5, 10);
        System.out.println(result1);
        p1.sum(15, 25);

        System.out.println("Result of add: " + result1);

    }
}
