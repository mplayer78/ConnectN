import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyConnectFour {

  public static void main(String[] args) {
    new MyConnectFour();
  }

  private BufferedReader input;
  private char[][] board;

  public MyConnectFour() {
    board = new char[6][7];
    input = new BufferedReader(new InputStreamReader(System.in));
    playGame();
  }

  private void playGame() {
    System.out.println("Welcome to Connect 4");
    System.out.println("There are 2 players red and yellow");
    System.out.println("Player 1 is Red, Player 2 is Yellow");
    System.out.println("To play the game type in the number of the column you want to drop you counter in");
    System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
    System.out.println("");
    printBoard();
    boolean win = false;
    while (!win) {
      System.out.println("Player 1?");// player 1
      String userInput = getUserInput();
      int move = Integer.parseInt(userInput);
      placeCounter('r', move);
      boolean hasWon = false;
      int count = 0;
      // check horizontal
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
          if (board[i][j] == 'r') {
            count = count + 1;
            if (count > 4) {
              hasWon = true;
            }
          } else {
            count = 0;
          }
        }
        count = 0;
      }
      // check vertical
      count = 0;
      for (int i = 0; i < board[0].length; i++) {
        for (int j = 0; j < board.length; j++) {
          if (board[j][i] == 'r') {
            count = count + 1;
            if (count >= 4) {
              hasWon = true;
            }
          } else {
            count = 0;
          }
        }

      }
      printBoard();
      if (hasWon) {
        win = true;
      } else {
        System.out.println("Player 2?"); // player 2
        userInput = getUserInput();
        move = Integer.parseInt(userInput);
        placeCounter('y', move);
        hasWon = false;
        count = 0;
        // check horizontal
        for (int i = 0; i < board.length; i++) {
          for (int j = 0; j < board[i].length; j++) {
            if (board[i][j] == 'y') {
              count = count + 1;
              if (count >= 4) {
                hasWon = true;
              }
            } else {
              count = 0;
            }
          }
          count = 0;
        }
        // check vertical
        count = 0;
        for (int i = 0; i < board[0].length; i++) {
          for (int j = 0; j < board.length; j++) {
            if (board[j][i] == 'y') {
              count = count + 1;
              if (count >= 4) {
                hasWon = true;
              }
            } else {

            }
          }
          count = 0;
        }
        printBoard();
        if (hasWon) {
          win = true;
        }
      }
    }
    System.out.println("You Have Won!!!");

  }

  private String getUserInput() {
    String userInput = null;
    try {
      userInput = input.readLine();
    } catch (Exception e) {

    }
    return userInput;
  }

  private void printBoard() {
    for (int i = board.length - 1; i >= 0; i--) {
      for (int j = 0; j < board[i].length - 1; j++) {
        if (board[i][j] == 'r') {
          System.out.print("| r ");
        } else if (board[i][j] == 'y') {
          System.out.print("| y ");
        } else {
          System.out.print("|   ");
        }
      }
      System.out.println("|");
    }
    System.out.println("  1   2   3   4   5   6   7");
  }

  private void placeCounter(char player, int position) { // takes either r or y and a single column number
    boolean placed = false;
    if (player == 'r') { // handle case of 'r' input first
      for (int i = 0; i < board.length; i++) { // starting at 0 index (bottom of board)
        System.out.println("i = " + i);
        while (!placed) { // check if the counter has been placed
          if (board[i][position - 1] == 'y' || board[i][position - 1] == 'r') {
            System.out.println("from if loop");
            break; // if the position contains a 'y' or 'r' continue in loop
          } else if (board[i][position - 1] != 'r') {
            board[i][position - 1] = 'r';
            placed = true;
          }
        }
      }
    } else {
      for (int i = 0; i < board.length; i++) {
        while (!placed) {
          if (board[i][position - 1] == 'y' || board[i][position - 1] == 'r') {
            break;
          } else if (board[i][position - 1] != 'y') {
            board[i][position - 1] = 'y';
            placed = true;
          }
        }
      }
    }
  }
}