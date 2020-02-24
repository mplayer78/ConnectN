import java.io.*;

abstract class User {

  public static String getInput() {
    String inputString;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      // grab input
      inputString = br.readLine();
      return inputString;
    } catch (IOException e) {
      ConsoleDisplay.log(e.getMessage());
    }
  };

  abstract void takeTurn(Board board, int turnValue);
}