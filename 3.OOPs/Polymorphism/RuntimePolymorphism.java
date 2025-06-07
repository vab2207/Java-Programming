class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
