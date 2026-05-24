package revision;

// class teacher {
//     String name = "John Doe";
// }

// public class Student {
//     static String college = "ABC University";
//     public static void main(String[] args) {
//         teacher t1 = new teacher();
//         System.out.println(t1.name);
//     }
// }

public class Student {
    static String college = "ABC University";

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.college);
        System.out.println(s2.college);
    }
}