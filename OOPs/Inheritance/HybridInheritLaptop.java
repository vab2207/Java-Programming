interface Device {
    void powerOn();
}

interface Features extends Device {
    void batteryInfo();
}

interface AdditionalFeatures {
    void touchScreen();
}

class Laptop implements Features, AdditionalFeatures {
    public void powerOn() {
        System.out.println("Laptop powered on.");
    }

    public void batteryInfo() {
        System.out.println("Battery: 6 hours backup.");
    }

    public void touchScreen() {
        System.out.println("Touch screen supported.");
    }
}

public class HybridInheritLaptop {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.powerOn();
        l.batteryInfo();
        l.touchScreen();
    }
}
