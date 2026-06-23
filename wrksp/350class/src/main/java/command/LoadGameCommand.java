package command;


// defines a binding between a reciever and an action
// implements execute by invoking from reciever
public class LoadGameCommand implements ICommand {
  
  // this is the reciever
  private Game game;

  public LoadGameCommand(Game game) {
    this.game = game;
  }

  public void execute() {
    game.createGame();
  }    
}
