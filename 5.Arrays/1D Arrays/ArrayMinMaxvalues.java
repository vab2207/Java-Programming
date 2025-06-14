public class ArrayMinMaxvalues{
    public static void main(String[] args){
        int[] values = {34, 67, 23, 89, 12};
	int min = values[0];
        int max = values[0];
        for(int i = 1; i < values.length; i++){
            if(values[i] > max){
                max = values[i];
            }
	    else if(values[i] < min){
		min = values[i];	
	    }
        }
        System.out.println("Maximum value: " + max);
	System.out.println("Minimum value: " + min);
    }
}
