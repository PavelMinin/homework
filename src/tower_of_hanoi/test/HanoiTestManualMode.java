package tower_of_hanoi.test;

import org.junit.jupiter.api.Test;
import tower_of_hanoi.core.MainMenu;

public class HanoiTestManualMode {
    @Test
    public void mainMenu() {
        MainMenu mainMenu = new MainMenu();
        mainMenu.selectMode();

    }
}
