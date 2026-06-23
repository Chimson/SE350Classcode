package proxy;

public class RealPlayerModel implements IPlayerModel {

  public RealPlayerModel() {
    loadHeavyAssets(); 
    System.out.println("... model loaded with heavy assets");
  }

  public void loadHeavyAssets() {
    //  Actually calls some complex heavy memory and graphics process that displays the player on screen")

  }


  @Override
  public void render() {
    System.out.println("takes the loaded model and displays image on screen ...");
  }


   


} 


