import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameAgain = true;

        while (gameAgain) {
            System.out.print("Player A, enter your move (R/P/S): ");
            String playerA = scanner.nextLine();

            System.out.print("Player B, enter your move (R/P/S): ");
            String playerB = scanner.nextLine();

            while (!validMove(playerA)) {
                System.out.print("Invalid move Player A! Please enter either R, P, or S: ");
                playerA = scanner.nextLine();
            }

            while (!validMove(playerB)) {
                System.out.print("Invalid move Player B! Please enter either R, P, or S: ");
                playerB = scanner.nextLine();
            }

            String result = resultFinal(playerA, playerB);
            System.out.println(result);

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgainChoice = scanner.nextLine();

            gameAgain = playAgainChoice.equals("Y");
            System.out.println();
        }
    }

    static boolean validMove(String move) {
        return move.equals("R") || move.equals("P") || move.equals("S");
    }

    static String resultFinal (String moveA, String moveB) {
        if (moveA.equals(moveB)) {
            return "It's a tie!";
        } else if (moveA.equals("R")) {
            if (moveB.equals("S")) {
                return "Rock breaks Scissors. Player A wins!";
            } else {
                return "Paper covers Rock. Player B wins!";
            }
        } else if (moveA.equals("P")) {
            if (moveB.equals("R")) {
                return "Paper covers Rock. Player A wins!";
            } else {
                return "Scissors cuts Paper. Player B wins!";
            }
        } else {
            if (moveB.equals("P")) {
                return "Scissors cuts Paper. Player A wins!";
            } else {
                return "Rock breaks Scissors. Player B wins!";
            }
        }
    }
}