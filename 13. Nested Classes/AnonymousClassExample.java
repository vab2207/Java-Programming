abstract class Animal{
    abstract void sound();
}

public class AnonymousClassExample{
    public static void main(String[] args){
        Animal a = new Animal(){
            void sound(){
                System.out.println("Animal sound");
            }
        };
        a.sound();
    }
}
