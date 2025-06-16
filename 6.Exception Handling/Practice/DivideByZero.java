public class DivideByZero{
    public static void main(String[] args){
        try{
            int result = 100 / 0;
        }catch(Exception e){
            System.out.println("Can't divide by zero");
        }
    }
}
