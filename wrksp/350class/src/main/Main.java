package main;

import level.*;

public class Main {

  public static void main(String[] args) {
    Level def = Level.constructWith(new DefaultLevelBuilder());
    System.out.println(def);   
  }

}
