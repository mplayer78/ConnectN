import java.util.Arrays;

class Board {
  // define these as constants for extensibility
  final static int BOARD_WIDTH = 7;
  final static int BOARD_HEIGHT = 6;

  int[] boardState;

  public void Board() {
    this.boardState = new int[BOARD_WIDTH * BOARD_HEIGHT];
    Arrays.fill(this.boardState, 0);
  }

  public int[] getBoardState() {
    // return the board's state including all empty spaces
    return boardState;
  }

  public int[] getFreeSpaces() {
    // todo return a list of positions which can be taken.
    return boardState;
  }

}