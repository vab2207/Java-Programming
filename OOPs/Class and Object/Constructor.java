class Constructor {
    String name;
    int age;
    Costructor(String n, int a) {
        name = n;
        age = a;
        return name;
        return age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student("Aditya", 20);
        s.display();
    }
}
