package diamond;

interface IPlayerController extends IKeyboardInput, IGamepadInput {


  @Override
  // takes KeyBoardInput's inherited method, but calls its override
  default String readInput()  {
    return IKeyboardInput.super.readInput();   
  }
}

