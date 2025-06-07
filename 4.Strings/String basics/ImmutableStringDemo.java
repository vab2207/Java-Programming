public class ImmutableStringDemo{
    public static void main(String[] args){
        String message = "Hello";
        message.concat(" World");

        System.out.println(message); // Output: Hello

        message = message.concat(" World");
        System.out.println(message); // Output: Hello World
    }
}
