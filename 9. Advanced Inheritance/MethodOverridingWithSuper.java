class Parent{
    void display(){
        System.out.println("Parent method");
    }
}

public class MethodOverridingWithSuper extends Parent{
    void display(){
        super.display();
        System.out.println("Child method");
    }

    public static void main(String[] args){
        MethodOverridingWithSuper obj = new MethodOverridingWithSuper();
        obj.display();
    }
}
