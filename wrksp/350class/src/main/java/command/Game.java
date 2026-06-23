package command;

// reciever, that knows how to perform operations for the command
public class Game {
  private final String name;
  
  public Game(String name) {
    this.name = name;
  }

  public void createGame() {
    System.out.println("loading " + name + " ...");
  }
}
