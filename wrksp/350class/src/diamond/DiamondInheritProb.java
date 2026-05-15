package diamond;


class A {
  void method() {}
}

class B extends A {
  @Override
  void method() {}
}

class C extends A{
 
  @Override
  void method() {}
}

// can't multiple extend (inheritance) in Java
// // but can use interface to multiple implement
// class D extends B, C {
//
// }

public class DiamondInheritProb {


}
