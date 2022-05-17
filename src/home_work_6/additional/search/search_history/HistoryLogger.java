package home_work_6.additional.search.search_history;

import home_work_6.additional.TxtFileReader;
import home_work_6.additional.search.RegExSearch;
import home_work_6.additional.search.SearchEngineCaseInsensitive;
import home_work_6.additional.search.SearchEnginePunctuationNormalizer;
import home_work_6.additional.search.api.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HistoryLogger {
    /**
     * Адрес логгера
     */
    private final String pathToResult = "/Users/pavelminin/IdeaProjects/Md-JC1/homework/src" +
            "/home_work_6/additional/search/search_history/log/result.txt";


    /**
     * Ищет все подпапки и файлы в указанной директории.
     * @param path путь
     * @return лист строк.
     */
    public List<String> getListOfFiles(String path) {
        File file = new File(path);
        List<String> data = new ArrayList<>();
        if(file.isFile()) {
            data.add(file.getName());
        } else {
            data.add("Folder: " + file.getAbsolutePath());
            File[] files = file.listFiles();
            if(files != null) {
                for (File content : files) {
                    List<String> includedContent = getListOfFiles(content.getPath());
                    data.addAll(includedContent);
                }
            }
        }

        return data;
    }

    /**
     * Метод считывает файл по указанному имени и адресу в строку.
     * @param pathToFolder путь к папке.
     * @param fileName имя файла.
     * @return строка с содержимым.
     * @throws IOException
     */
    public String getText(String pathToFolder, String fileName) throws IOException {
        return new TxtFileReader(pathToFolder + "/" + fileName).getText();
    }

    /**
     * Композиция поисковика.
     * @param text текст в котором ищется.
     * @param word искомое слово.
     * @return количество совпадений.
     */
    public long searchWord(String text, String word) {
        ISearchEngine regExSearch = new RegExSearch();
        ISearchEngine searchRegExPunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
        ISearchEngine searchPunctuationNormalizerRegExCaseInsensitive =
                new SearchEngineCaseInsensitive(searchRegExPunctuationNormalizer);

        return searchPunctuationNormalizerRegExCaseInsensitive.search(text, word);
    }

    /**
     * Попытка создать файл result.txt. Адрес захардкожен.
     * Если файл уже сузествует, выбрасывается RuntimeException.
     * @return true - если файл был создан.
     */
    public boolean makeResultFile() {
        File result = new File(pathToResult);
        if (!result.exists()) {
            try {
                return result.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException("Не удалось создать файл", e);
            }
        } else {
            throw new RuntimeException("Файл уже существует");
        }
    }

    /**
     * Метод записывает в файл result.txt лог поиска.
     * @param pathToFolder путь к папке.
     * @param fileName имя файла.
     * @param word искомое слово.
     * @param counter количество совпадений.
     */
    public void writeToFile(String pathToFolder, String fileName, String word, long counter) {
        try {
            Path path = Path.of(pathToResult);
            String log = Files.readString(path, StandardCharsets.UTF_8);

            if (!word.equals("выход()")) {
                FileWriter writer = new FileWriter(pathToResult);
                writer.append(log).append(fileName).append(" - ")
                        .append(word).append(" - ").append(String.valueOf(counter)).append("\n");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
