package home_work_6;

import home_work_6.additional.search.search_history.HistoryLogger;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchInFilesRunner {
    public static void main(String[] args) throws IOException {

        HistoryLogger logger = new HistoryLogger();
        try {
            logger.makeResultFile();
        } catch (RuntimeException e) {}

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к библиотеке");
        String pathToFolder = sc.nextLine();

        List<String> info = logger.getListOfFiles(pathToFolder);

        for (String s : info) {
            System.out.println(s);
        }

        String input;

        do {
            System.out.println("\nВведите имя файла в котором будете искать слова.\n" +
                    "Для выхода введите \"выход()\"");
            input = sc.nextLine();

            if (input.equals("выход()")) {
                break;
            }

            String text = logger.getText(pathToFolder, input);
            String word;

            do {
                System.out.println("\nВведите слово, которое хотите найти.\n" +
                "Для выхода введите \"выход()\"");
                word = sc.nextLine();

                long counter = logger.searchWord(text, word);
                logger.writeToFile(pathToFolder, input, word, counter);

                System.out.println("Слово \"" + word + "\" найдено " + counter + " раз");
            } while (!word.equals("выход()"));
        } while (true);
    }
}
