public class JaggedArraySumExample{
    public static void main(String[] args){
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        int sum = 0;
        for(int i = 0; i < jagged.length; i++){
            for(int j = 0; j < jagged[i].length; j++){
                sum += jagged[i][j];
            }
        }

        System.out.println("Sum of elements: " + sum);
    }
}
