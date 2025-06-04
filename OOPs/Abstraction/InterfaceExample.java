interface Camera {
    void takePhoto();
}

interface GPS {
    void navigate();
}

class Smartphone implements Camera, GPS {
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void navigate() {
        System.out.println("Navigating...");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Smartphone obj = new Smartphone();
        obj.takePhoto();
        obj.navigate();
    }
}
