public class ThrowsKeywordExample{
    static void checkAge(int age) throws ArithmeticException{
        if(age < 18){
            throw new ArithmeticException("Underage");
        }else{
            System.out.println("Age verified");
        }
    }

    public static void main(String[] args){
        checkAge(17);
    }
}
