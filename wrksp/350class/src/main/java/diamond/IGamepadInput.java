package diamond;

interface IGamepadInput extends IInputDevice {
  @Override
  default String readInput() {
    return "Gamepad: Left Stick";
  }
}
