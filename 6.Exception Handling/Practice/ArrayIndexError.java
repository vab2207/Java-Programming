public class ArrayIndexError{
    public static void main(String[] args){
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }
	catch(Exception e){
            System.out.println("Array index out of range");
        }
    }
}
