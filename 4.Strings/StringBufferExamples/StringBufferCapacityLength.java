public class StringBufferCapacityLength{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();

        System.out.println("Capacity: " + sb.capacity()); 
        sb.append("HelloWorldJava");
        System.out.println("Length: " + sb.length());     
        System.out.println("Capacity: " + sb.capacity());
        sb.append("12345");
        System.out.println("New Capacity: " + sb.capacity()); 
    }
}
