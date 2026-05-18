class Employee {

    String name;
    int age;

    // Default constructor
    Employee() {
        name = "Unknown";
        age = 0;

        System.out.println("Default constructor called");
    }

    // Constructor with one parameter
    Employee(String name) {
        this(); // calls default constructor

        this.name = name;

        System.out.println("One parameter constructor called");
    }

    // Constructor with two parameters
    Employee(String name, int age) {
        this(name); // calls Employee(String name)

        this.age = age;

        System.out.println("Two parameter constructor called");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 25);

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
    }
}