public class classandobjexample {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Aditya";
        s.age = 20;
        s.display();
    }
}
class Student {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

