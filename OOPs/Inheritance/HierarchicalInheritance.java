class Laptop {
    void os() {
        System.out.println("Runs on Windows 11");
    }
}

class BusinessLaptop extends Laptop {
    void secureBoot() {
        System.out.println("Includes BitLocker encryption");
    }
}

class StudentLaptop extends Laptop {
    void affordable() {
        System.out.println("Budget-friendly with long battery life");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        BusinessLaptop bl = new BusinessLaptop();
        StudentLaptop sl = new StudentLaptop();

        bl.os();
        bl.secureBoot();

        sl.os();
        sl.affordable();
    }
}
