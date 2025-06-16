public class FinallyBlockExample{
    public static void main(String[] args){
        try{
            int data = 10 / 0;
        }
	catch(Exception e){
            System.out.println("Exception caught.");
        }
	finally{
            System.out.println("Finally block always runs.");
        }
    }
}
