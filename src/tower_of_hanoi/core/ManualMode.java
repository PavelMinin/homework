package tower_of_hanoi.core;

import tower_of_hanoi.api.IMainMenu;

import java.util.Scanner;

public class ManualMode {
    private final HanoiGame manualGame;
    private boolean isWon = false;

    public boolean isWon() {
        return isWon;
    }

    public ManualMode(HanoiGame newField) {
        this.manualGame = newField;
        System.out.println("Вы начали новую игру!");
        System.out.println(this.manualGame.getCurrentState());
        System.out.println("Количество шагов: " + this.manualGame.getStepCounter());
    }

    public boolean makeMove() {
        System.out.println("Введите ход (первая цифра - откуда, вторая - куда).\nв - выход:");
        int min = 12;
        int max = (manualGame.getFieldColumnSize() + 1) * 10 + manualGame.getFieldColumnSize();
        int number = IMainMenu.getDigitAnswerFromConsole(min,max);
        int fromColumn = number / 10 - 1;
        int toColumn = number % 10 - 1;

        if(number == -1) {
            System.out.println("Уверены, что хотите выйти? (да / нет)");
            if(IMainMenu.getYesNoAnswerFromConsole()) {
                return true;
            }
        }

        if(!manualGame.makeMove(fromColumn, toColumn)) {
            System.out.println("Такой ход сделать нельзя.");
        } else {
            System.out.println(this.manualGame.getCurrentState());
            System.out.println("Количество шагов: " + this.manualGame.getStepCounter());
        }
        if(manualGame.checkState()) {
            System.out.println(manualGame.getCongratulation());
            this.isWon = true;
            return true;
        } else {
            return false;
        }
    }
}
