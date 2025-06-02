class SingleInheritance {
    String brand = "HP";

    void display() {
        System.out.println("Brand: " + brand);
    }
}

class GamingLaptop extends Laptop {
    int ram = 16;

    void specs() {
        System.out.println("RAM: " + ram + "GB");
    }
}

public class SingleInheritance
 {
    public static void main(String[] args) {
        GamingLaptop gl = new GamingLaptop();
        gl.display();
        gl.specs();
    }
}
