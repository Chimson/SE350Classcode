package command;

// invoker
// asks command to carry out the request 
public class LoadGameMenuItem {
  
  public LoadGameMenuItem(ICommand load) {
    load.execute();
  }
  
}
