public class child extends parent {

    String name = "Child Name";

    @Override

    void display() {

        // Calling parent class method using super

        super.display();

        // Displaying child class variable

        System.out.println("Child Class Name: " + name);

    }

    public static void main(String[] args) {

        child c = new child();

        c.display();

    }

}