public class ConstructorChainingThis{
    ConstructorChainingThis(){
        this(10);
        System.out.println("Default constructor");
    }

    ConstructorChainingThis(int a){
        System.out.println("Parameterized constructor: " + a);
    }

    public static void main(String[] args){
        new ConstructorChainingThis();
    }
}
