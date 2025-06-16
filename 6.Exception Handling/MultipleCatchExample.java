public class MultipleCatchExample{
    public static void main(String[] args){
        try{
            int[] arr = new int[3];
            arr[5] = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("Divide by zero.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds.");
        }
    }
}
