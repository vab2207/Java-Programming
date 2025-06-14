public class StringCompareWithNull{
    public static void main(String[] args){
        String name = null;
	String req_name = "Java";

        if (req_name.equals(name)) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched"); 
        }
    }
}
