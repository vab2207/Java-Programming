public class CopyArray{
    public static void main(String[] args){
        int[] a = {5, 10, 15};
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
}
