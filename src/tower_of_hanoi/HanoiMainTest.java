package tower_of_hanoi;

import tower_of_hanoi.core.HanoiGame;

public class HanoiMainTest {
    public static void main(String[] args) {
        HanoiGame game = new HanoiGame();
        game.showCurrentState();
        System.out.println("1 -> 2  " + game.makeMove(0,1));
        game.showCurrentState();
        System.out.println("1 -> 3  " + game.makeMove(0,2));
        game.showCurrentState();
        System.out.println("2 -> 1  " + game.makeMove(1,0));
        game.showCurrentState();
        System.out.println("3 -> 1  " + game.makeMove(2,0));
        game.showCurrentState();
        System.out.println("3 -> 2  " + game.makeMove(2,1));
        game.showCurrentState();

        game.showCongratulation();

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
