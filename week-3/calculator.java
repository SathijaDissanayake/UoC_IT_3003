public class calculator {
    int a ;
    int b ;
    int c ;
    double d ;
    double e ;

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double d, double e) {
        return d + e;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();

        System.out.println("Addition of two numbers: " + calc.add(20, 10));
        System.out.println("Addition of three numbers: " + calc.add(20, 10, 30));
        System.out.println("Addition of four numbers: " + calc.add(40.5, 50.4));
    }
}
