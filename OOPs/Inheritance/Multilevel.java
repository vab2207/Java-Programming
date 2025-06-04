class Laptop {
    void baseSpecs() {
        System.out.println("Basic laptop functionality");
    }
}

class GamingLaptop extends Laptop {
    void gamingSpecs() {
        System.out.println("Dedicated GPU and Cooling System");
    }
}

class UltraGamingLaptop extends GamingLaptop {
    void ultraSpecs() {
        System.out.println("High refresh rate display and RGB keyboard");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        UltraGamingLaptop ugl = new UltraGamingLaptop();
        ugl.baseSpecs();
        ugl.gamingSpecs();
        ugl.ultraSpecs();
    }
}
