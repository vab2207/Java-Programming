public class RatingFeedbackOldVersion {
    public static void main(String[] args) {
        int rating = 4;

        switch (rating) {
            case 1:
                System.out.println("Very Poor");
                break;
            case 2:
                System.out.println("Poor");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Invalid Rating");
        }
    }
}
