package tower_of_hanoi;

import tower_of_hanoi.core.HanoiGame;
import tower_of_hanoi.core.MainMenu;

public class HanoiMainTest {
    public static void main(String[] args) {
        HanoiGame game = new HanoiGame();
        System.out.println(game.getCurrentState());
        System.out.println("1 -> 2  " + game.makeMove(0,1));
        System.out.println(game.getCurrentState());
        System.out.println("1 -> 3  " + game.makeMove(0,2));
        System.out.println(game.getCurrentState());
        System.out.println("2 -> 1  " + game.makeMove(1,0));
        System.out.println(game.getCurrentState());
        System.out.println("3 -> 1  " + game.makeMove(2,0));
        System.out.println(game.getCurrentState());
        System.out.println("3 -> 2  " + game.makeMove(2,1));
        System.out.println(game.getCurrentState());

        System.out.println(game.getCongratulation());

        MainMenu mainMenu = new MainMenu();
        mainMenu.selectMode();
        //System.out.println(mainMenu.getGameMode());

        /*
        for (int i = 4; i <= 8; i++) {
            game = new HanoiGame(i);
            game.showCurrentState();
        }

        for(int i = 4; i <= 20; i++) {
            for (int j = 3; j <= 8; j++) {
                game = new HanoiGame(i, j);
                game.showCurrentState();
            }
        }*/
    }
}
