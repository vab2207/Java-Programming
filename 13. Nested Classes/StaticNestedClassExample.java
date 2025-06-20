public class StaticNestedClassExample{
    static class Nested{
        void display(){
            System.out.println("Static nested class");
        }
    }

    public static void main(String[] args){
        StaticNestedClassExample.Nested obj = new StaticNestedClassExample.Nested();
        obj.display();
    }
}
