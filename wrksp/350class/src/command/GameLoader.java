package command;

// invoker
// asks command to carry out the request 
public class GameLoader {
  
  public GameLoader(ICommand load) {
    load.execute();
  }
  
}
