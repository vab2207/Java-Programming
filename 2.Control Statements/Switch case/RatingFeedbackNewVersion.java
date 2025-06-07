public class RatingFeedbackNewVersion {
    public static void main(String[] args) {
        int rating = 5;

        String feedback = switch (rating) {
            case 1 -> "Very Poor";
            case 2 -> "Poor";
            case 3 -> "Average";
            case 4 -> "Good";
            case 5 -> "Excellent";
            default -> "Invalid Rating";
        };

        System.out.println(feedback);
    }
}
