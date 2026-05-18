public class ExSuper {

    String name = "Parent Name";

    void display() {
        System.out.println(name);
    }
}

class Teacher extends ExSuper {

    String name = "Child Name";

    @Override
    void display() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.display();

    }
}