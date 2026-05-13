package diamond;

interface IKeyboardInput extends IInputDevice {
  @Override
  default String readInput() {
    return "Keyboard: WASD";
  }
}
