import java.io.*;

import jdk.internal.org.jline.utils.InputStreamReader;

abstract class User {
  public User() {
  };

  public static String getInput() {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(userInput))) {
      // grab input
      String inputString = userInput.readLine();
      return inputString;
    } catch (IOException e) {
      ConsoleDisplay.log(e.getMessage())
    }
  };

  abstract takeTurn();
}