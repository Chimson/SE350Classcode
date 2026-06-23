package proxy;

public class Demo {
  
  public static void main(String[] args) {
    
    // player model is not created yet
    IPlayerModel player = new ProxyPlayerModel();

    player.render();  // now the model is created and rendered
    System.out.println("computation occurs before the next frame ...");
    player.render();   // does not need to loadHeavyAssets again, just re-render

  }

}
