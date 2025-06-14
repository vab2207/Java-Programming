public class SubstringValidation{
    public static void main(String[] args){
        String email = "user@example.com";
        System.out.println("Domain: " + email.substring(email.indexOf('@') + 1));
    }
}
