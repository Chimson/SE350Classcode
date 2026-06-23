package diamond;

interface IInputDevice {
  default String readInput() {
    return "No input";
  }
}

