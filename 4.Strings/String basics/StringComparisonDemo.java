public class StringComparisonDemo {
    public static void main(String[] args) {
        String city1 = "Delhi";
        String city2 = "delhi";

        System.out.println(city1.equals(city2));            //false
        System.out.println(city1.equalsIgnoreCase(city2));  //true
        System.out.println(city1.compareTo(city2));         //ASCII diff
        System.out.println(city1.compareToIgnoreCase(city2)); //0
    }
}
