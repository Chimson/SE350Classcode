package command;

// client
// creates concrete command and sets its reciever
public class MainMenu {
  
  public static void main(String[] args) {
    // display menu option, handle selection
    ICommand loadGame1 = new LoadGameCommand(new Game("Game 1"));
    new LoadGameMenuItem(loadGame1);
    
  } 

}
