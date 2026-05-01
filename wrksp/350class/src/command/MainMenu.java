package command;

// client
// creates concrete command and sets its reciever
public class MainMenu {
  
  public static void main(String[] args) {
    ICommand loadGame1 = new LoadGameCommand(new Game("Game 1"));
    new GameLoader(loadGame1);
    

  } 

}
