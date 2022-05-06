package tower_of_hanoi.core;

import tower_of_hanoi.api.IMainMenu;

import java.util.Scanner;

public class MainMenu implements IMainMenu {
    private boolean automaticMode;
    private boolean manualMode;
    private final Scanner console = new Scanner(System.in);


    @Override
    public void startGame() {
        System.out.println("Приветствую в игре Ханойские Башни!");
        selectMode();
        if(manualMode) {
            System.out.println("1 - новая игра, 2 - загрузить сохранённую игру, 3 - запустить пройденную игру");
            int manualMode = IMainMenu.getDigitAnswerFromConsole(1,3);
            if(manualMode == 1) {
                ManualMode manualGame = new ManualMode(createNewField());
                while(!manualGame.makeMove());
                if(manualGame.isWon()) {
                    System.out.println("Хотите заново запустить игру? (да / нет)");
                    if(IMainMenu.getYesNoAnswerFromConsole()) {
                        startGame();
                    } else {
                        quitGame();
                    }
                } else {
                    quitGame();
                }


                //TODO сохранение в файл
            } else if(manualMode == 2) {
                System.out.println("In progress"); //TODO Загрузка из файла
            } else if(manualMode == 3) {
                System.out.println("In progress"); //TODO Запустить пройденную игру
            } else {
                System.out.println("Что-то пошло не так в mainMenu -> startGame");
            }
        } else if(automaticMode) {
            System.out.println("In progress"); //TODO Автоматический режим
        }
    }

    private HanoiGame createNewField() {
        System.out.println("1 - стандартное поле (4 диска, 3 штыря),\n" +
                "2 - задать количество дисков (от 3 до 8),\n" +
                "3 - создать свое поле (от 3 до 20 дисков, от 3 до 8 штырей)");
        int fieldType = IMainMenu.getDigitAnswerFromConsole(1,3);
        if(fieldType == 1) {
            return new HanoiGame();
        } else if(fieldType == 2) {
            System.out.println("Задайте количество дисков (от 3 до 8):");
            int ringsQuantity = IMainMenu.getDigitAnswerFromConsole(3,8);
            return new HanoiGame(ringsQuantity);
        } else if(fieldType == 3) {
            System.out.println("Задайте количество дисков (от 3 до 20):");
            int ringsQuantity = IMainMenu.getDigitAnswerFromConsole(3,20);
            System.out.println("Задайте количество штырей (от 3 до 8):");
            int rodsQuantity = IMainMenu.getDigitAnswerFromConsole(3,8);
            return new HanoiGame(ringsQuantity, rodsQuantity);
        }
        return null;
    }

    @Override
    public HanoiGame loadGame(String fileName) {
        return null;
    }

    @Override
    public void selectMode() {
        System.out.println("Введите режим игры: 1 - ручной, 2 - автоматический");
        int digitalAnswer = IMainMenu.getDigitAnswerFromConsole(1, 2);
        if(digitalAnswer == 1) {
            this.manualMode = true;
            this.automaticMode = false;
        } else if(digitalAnswer == 2) {
            this.automaticMode = true;
            this.manualMode = false;
        } else {
            this.automaticMode = false;
            this.manualMode = false;
        }
    }

    void quitGame() {
        System.out.println("Сохранить текущую игру? (да / нет)");
        if(IMainMenu.getYesNoAnswerFromConsole()) {
            System.out.println("Введите имя файла (латинские буквы и цифры, от 3 до 16 символов):");
            if(IMainMenu.saveToFile(IMainMenu.getFileNameFromConsole())) {
                System.out.println("Игра успешно сохранена.");
            } else {
                System.out.println("Что-то пошло не так...");
            }
        }
        System.exit(16000);
    }
}
