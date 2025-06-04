class CompileTimePolymorphism {
    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(int age) {
        System.out.println("Age: " + age);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display("Aditya");
        obj.display(20);
        obj.display("Aditya", 20);
    }
}
