class TestAccess {

    private int a = 10;
    protected int b = 20;
    public int c = 30;
    int d = 40;

    void display() {
        System.out.println("Private variable a: " + a);
        System.out.println("Protected variable b: " + b);
        System.out.println("Public variable c: " + c);
        System.out.println("Default variable d: " + d);
    }

    public static void main(String[] args) {

        TestAccess obj = new TestAccess();

        obj.display();
    }
}