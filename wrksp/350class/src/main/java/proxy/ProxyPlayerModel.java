package proxy;

public class ProxyPlayerModel implements IPlayerModel {
  
  private RealPlayerModel realPlayer;
 
  @Override
  // lazy loads the real model just before rendering
  // full RealPlayerModel may not need to be loaded earlier like at startup
    // could defer to just when you need it because it is space and time consuming
    // also do not need to reload after loaded once
  public void render() {
    if (realPlayer == null) {
      realPlayer = new RealPlayerModel();
    }
    realPlayer.render();
  }

}
