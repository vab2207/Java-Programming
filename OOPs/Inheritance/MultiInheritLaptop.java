interface Keyboard {
    void type();
}

interface Screen {
    void display();
}

class Laptop implements Keyboard, Screen {
    public void type() {
        System.out.println("Mechanical keyboard typing...");
    }

    public void display() {
        System.out.println("IPS LCD with Full HD resolution...");
    }
}

public class MultiInheritLaptop {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.type();
        l.display();
    }
}
