public class ClubFairDemo {
    public static void main(String[] args) {
        int mood = 2; // Change this to 1, 2, or 3, then run again.
        System.out.println(activityFor(mood));
    }

    private static String activityFor(int mood) {
        if (mood == 1) {
            return "Let's build a calm drawing tool.";
        } else if (mood == 2) {
            return "Let's make a fast guessing game!";
        } else {
            return "Let's invent a surprise Java project.";
        }
    }
}
