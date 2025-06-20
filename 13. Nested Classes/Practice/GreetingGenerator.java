interface Greet{
    void message();
}

public class GreetingGenerator{
    public static void main(String[] args){
        Greet g = new Greet(){
            public void message(){
                System.out.println("Hello, Welcome!");
            }
        };
        g.message();
    }
}
