package tower_of_hanoi.api;

import tower_of_hanoi.core.HanoiGame;

public interface IMainMenu {
    HanoiGame startNewGame();
    void quitGame();
    void saveGame(String fileName);
    HanoiGame loadGame(String fileName);
    void selectMode();
}
