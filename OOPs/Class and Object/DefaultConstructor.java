class DefaultConstructor {
    String name;
    int age;

    Student() {
        name = "Aditya";
        age = 20;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
