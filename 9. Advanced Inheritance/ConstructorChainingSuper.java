class Base{
    Base(){
        System.out.println("Base constructor");
    }
}

public class ConstructorChainingSuper extends Base{
    ConstructorChainingSuper(){
        super();
        System.out.println("Derived constructor");
    }

    public static void main(String[] args){
        new ConstructorChainingSuper();
    }
}
