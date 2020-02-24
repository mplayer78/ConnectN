import java.util.*;

class Game {
  private boolean gameRunning = false;
  private Map<String, Integer> noOfPlayers = Map.of("human", 0, "computer", 0);
  private int currentPlayer;

  public Game() {
    this.setup();
  }

  private void setup() {
    ConsoleDisplay.log("Welcome to Connect N");
    ConsoleDisplay.log("There are both human & computer players");
    ConsoleDisplay.log("To play the game type in the number of the column you want to drop you counter in");
    ConsoleDisplay.log("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally");
    ConsoleDisplay.log("");
  }

  private void setNoOfPlayers(String playerType, int i) {
    this.noOfPlayers.put(playerType, i);
  }
}