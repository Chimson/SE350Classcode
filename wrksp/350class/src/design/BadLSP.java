package design;

// Liskov Substitution Principle
// Should always be able to substitute a superclass obj with a subclass obj
// This example DOES NOT follow LSP

public class BadLSP {
  
  static class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int w) { 
      width = w; 
    }
    public void setHeight(int h) { 
      height = h; 
    }

    public int area() { 
      return width * height; 
    }
  }
  
  static class Square extends Rectangle {
   
    @Override
    public void setWidth(int w) {
      width = w;
      height = w; 
    }

    @Override
    public void setHeight(int h) {
      width = h;
      height = h; 
    }
  }
  
  public static void main(String[] args) {

    // base class object is not compatible with Subclass
    Rectangle r = (Rectangle) new Square();
    r.setWidth(2);
    r.setHeight(3);
    System.out.println("area returns " + r.area() + " but should be 6");
  }
  

}