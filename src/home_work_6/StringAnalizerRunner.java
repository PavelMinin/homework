package home_work_6;

import home_work_6.additional.StringAnalizer;
import home_work_6.additional.TxtFileReader;
import java.io.IOException;
import java.util.Set;


public class StringAnalizerRunner {
    public static void main(String[] args) {
        String path = "/Users/pavelminin/IdeaProjects/Md-JC1/homework/" +
                "src/home_work_6/resourses/Война и мир_книга.txt";
        String text = null;
        try {
            text = new TxtFileReader(path).getText();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringAnalizer stringAnalizer = new StringAnalizer(text);
        Set<String> setOfWords = stringAnalizer.getSetOfWords();
        System.out.println("\nКоличество использованных слов: " + setOfWords.size());

        System.out.println("\n" + stringAnalizer.getTopOfWords(5));
    }
}
