public class StringStartsEndsWith{
    public static void main(String[] args){
        String file = "report.pdf";
        System.out.println("Starts with 'rep': " + file.startsWith("rep"));
        System.out.println("Ends with '.pdf': " + file.endsWith(".pdf"));
    }
}
