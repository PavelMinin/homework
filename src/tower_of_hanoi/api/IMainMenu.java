package tower_of_hanoi.api;

import tower_of_hanoi.core.HanoiGame;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public interface IMainMenu {
    void startGame();
    Scanner console = new Scanner(System.in);



    HanoiGame loadGame(String fileName);
    void selectMode();

    static boolean saveToFile(String fileName) {
        File file = new File("/Users/pavelminin/IdeaProjects/Md-JC1/homework/src/tower_of_hanoi/saved_games/"
                + fileName + ".txt");
        try{
            return file.createNewFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

    static boolean loadFile(String fileName) {
        /*File file = new File("/Users/pavelminin/IdeaProjects/Md-JC1/homework/src/tower_of_hanoi/saved_games/"
                + fileName + ".txt");
        try{
            return file.createNewFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }*/
        return false;
    }

    static int getDigitAnswerFromConsole(int start, int end) {
        int tmp = 0;
        boolean isCorrect = false;
        do {
            if (!console.hasNextInt()) {
                if (console.hasNext("в")) {
                    console.nextLine();
                    return -1;
                }
                System.out.println("Введено не число. Пожалуйста, повторите ввод.");
            } else {
                tmp = console.nextInt();
                if (start <= tmp && tmp <= end) isCorrect = true;
                else System.out.println("Введено некорректное число. Пожалуйста, повторите ввод.");
            }
            console.nextLine();
        } while (!isCorrect);
        return tmp;
    }

    static boolean getYesNoAnswerFromConsole() {
        do {
            String answer = console.nextLine();
            answer = answer.toLowerCase();
            if(answer.equals("да")) return true;
            else if(answer.equals("нет")) return false;
            else System.out.println("Некорректный ввод. Пожалуйста, повторите ввод.");
        } while(true);
    }

    static String getFileNameFromConsole() {
        do {
            String answer = console.nextLine();
            if(answer.matches("([A-Za-z0-9]){3,16}")) return answer;
            else System.out.println("Некорректный ввод. Пожалуйста, повторите ввод.");
        } while(true);
    }
}
