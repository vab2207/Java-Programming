public class StringBuilderCapacityLength{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        System.out.println("Initial Capacity: " + sb.capacity()); 
        sb.append("StringBuilderCapacityTest");
        System.out.println("Length: " + sb.length());
        System.out.println("Current Capacity: " + sb.capacity());
    }
}
