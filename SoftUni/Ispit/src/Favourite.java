import java.util.Scanner;

public class Favourite {
    public static int calculateScore(String title) {
        int score = 0;
        int titleLength = title.length();

        for (char c : title.toCharArray()) {
            if (Character.isLowerCase(c)) {
                score += (int) c - 2 * titleLength;
            } else if (Character.isUpperCase(c)) {
                score += (int) c - titleLength;
            } else {
                score += (int) c;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] movieTitles = new String[7];
        int[] movieScores = new int[7];
        int movieCount = 0;

        while (movieCount < 7) {
            String movieTitle = scanner.nextLine();

            if (movieTitle.equals("STOP")) {
                break;
            }

            int movieScore = calculateScore(movieTitle);

            movieTitles[movieCount] = movieTitle;
            movieScores[movieCount] = movieScore;
            movieCount++;
        }

        if (movieCount == 7) {
            System.out.println("The limit is reached.");
        }

        int bestScore = Integer.MIN_VALUE;
        int bestIndex = -1;

        for (int i = 0; i < movieCount; i++) {
            if (movieScores[i] > bestScore) {
                bestScore = movieScores[i];
                bestIndex = i;
            }
        }

        if (bestIndex != -1) {
            System.out.println("The best movie for you is " + movieTitles[bestIndex] +
                    " with " + bestScore + " ASCII sum.");
        }
    }
}