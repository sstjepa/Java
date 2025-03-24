import java.util.Scanner;

public class Puppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int purchasedFood = Integer.parseInt(scanner.nextLine());
        int totalEaten = 0;

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Adopted")) {
                break;
            }

            int foodPerFeeding = Integer.parseInt(line);
            totalEaten += foodPerFeeding;
        }

        int remainingFood = purchasedFood * 1000 - totalEaten;

        if (remainingFood >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", remainingFood);
        } else {
            int neededFood = Math.abs(remainingFood);
            System.out.printf("Food is not enough. You need %d grams more.%n", neededFood);
        }
    }
}
