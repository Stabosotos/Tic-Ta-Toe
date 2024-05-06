import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // set up the positions
        char [] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        // check turn
        char turn = 'X';
        int symbol;

        while (true) {
            // print layout
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            // check not to put a symbol on a same position
            do {
                System.out.println("Put your " + turn + " here: ");
                symbol = input.nextInt();
            } while (pos[symbol - 1] == 'O' || pos[symbol - 1] == 'X');

            // set up the turn
            pos[symbol - 1] = turn;

            // check winning conditions
            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                || pos[3] == turn && pos[4] == turn && pos[5] == turn
                || pos[6] == turn && pos[7] == turn && pos[8] == turn
                || pos[6] == turn && pos[3] == turn && pos[0] == turn
                || pos[7] == turn && pos[4] == turn && pos[1] == turn
                || pos[8] == turn && pos[5] == turn && pos[2] == turn
                || pos[6] == turn && pos[4] == turn && pos[2] == turn
                || pos[8] == turn && pos[4] == turn && pos[0] == turn) {
                System.out.println(turn + " is the WINNER!");
                break;
            }

            // check whose turn is up
            if (turn == 'X') {
                turn = 'O';
            }
            else if (turn == 'O') {
                turn = 'X';
            }

        }
    }
}
