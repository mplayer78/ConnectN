class ConsoleDisplay implements Display {

  // todo : Singleton pattern.
  public void ConsoleDisplay() {
  };

  public void log(String s) {
    System.out.println(s);
  }

  public void log(Integer i) {
    System.out.println(i);
  }

  public void print(int[] boardState) {
    // print out the board state
  }
}