import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsByUsername {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    public static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");


        for (int i = 1; i <= 10; i++) {

            String playerMove = scanner.nextLine();

            if ("r".equals(playerMove) || "rock".equals(playerMove)) {
                playerMove = ROCK;
            } else if ("p".equals(playerMove) || "paper".equals(playerMove)) {
                playerMove = PAPER;
            } else if ("s".equals(playerMove) || "scissors".equals(playerMove)) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid Input. Try again...");
                i = i - 1;
                continue;
            }
            System.out.printf("My chose is: %s%n", playerMove);

            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);

            String computerMove = "";

            switch (computerRandomNumber) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = SCISSORS;
                    break;
                case 2:
                    computerMove = PAPER;
                    break;
                default:
                    System.out.println("The computer is not responding, Try again...");
                    i = i - 1;
                    continue;
            }
            System.out.printf("The computer chose %s%n", computerMove);

            if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
                    (playerMove.equals(PAPER) && computerMove.equals(ROCK) ||
                            playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {

                System.out.println("You win!!!");

            } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER) ||
                    (playerMove.equals(PAPER) && computerMove.equals(SCISSORS) ||
                            playerMove.equals(SCISSORS) && computerMove.equals(ROCK))) {


                System.out.println("You lose!!!");
            } else {

                System.out.println("The game is draw");
            }
        }
        System.out.println();
        System.out.println("The game is over!!!");
        System.out.println();
    }
}