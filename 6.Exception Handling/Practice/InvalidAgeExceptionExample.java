class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class InvalidAgeExceptionExample{
    public static void main(String[] args){
        try{
            int age = 16;
            if(age < 18){
                throw new InvalidAgeException("Age must be 18 or more");
            }
            System.out.println("Age is valid");
        }catch(InvalidAgeException e){
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
