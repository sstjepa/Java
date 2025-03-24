import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();

        int player1Points = 0;
        int player2Points = 0;

        for (int i = 0; i < 9; i++) {

            int card1 = scanner.nextInt();
            int card2 = scanner.nextInt();

            if (card1 > card2) {
                player1Points=player1Points+ (card1 - card2);
            } else if (card2 > card1) {
                player2Points=player2Points+ (card2 - card1);
            } else {
                System.out.println("Number wars!");

                int extraCard1 = scanner.nextInt();
                int extraCard2 = scanner.nextInt();

                if (extraCard1 > extraCard2) {
                    System.out.printf("%s is winner with %d points",player1,player1Points);
                } else {
                    System.out.printf("%s is winner with %d points",player2,player2Points);
                }

                break;
            }
//            String input = scanner.next();
//            if (input.equalsIgnoreCase("End")) {
//                System.out.printf("%s has %d points\n",player1,player1Points);
//                System.out.printf("%s has %d points",player2,player2Points);
//                break;
//            }

        }
    }
}