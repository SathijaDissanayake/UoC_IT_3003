// This code demonstrates inheritance in Java. The 'vehicle' class is the parent class, and the 'Car' class is the child class that inherits from 'vehicle'. The 'Car' class can access the 'show()' method of the 'vehicle' class, as well as its own 'display()' method.
class vehicle {
    void show() {
        System.out.println("This is a vehicle");
    }
}

class Car extends vehicle {
    void display() {
        System.out.println("This is a car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.show();     
        car.display();  
    }
}

