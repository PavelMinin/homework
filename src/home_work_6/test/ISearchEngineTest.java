package home_work_6.test;

import home_work_6.additional.search.EasySearch;
import home_work_6.additional.search.RegExSearch;
import home_work_6.additional.search.SearchEnginePunctuationNormalizer;
import home_work_6.additional.search.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ISearchEngineTest {
    private static String fragment = "-- Ну что, князь, Генуя и Лукка стали не больше как поместья, поместья фамилии " +
            "Буонапарте. Нет, я вам вперед говорю, если вы мне не скажете, что у нас война, если вы позволите себе " +
            "защищать все гадости, все ужасы этого антихриста (право, я верю, что он антихрист), -- я вас больше не " +
            "знаю, вы уже не друг мой, вы уже не мой верный раб, как вы говорите. Ну, здравствуйте, здравствуйте. Я " +
            "вижу, что я вас пугаю, садитесь и рассказывайте.\n" +
            "   Так говорила в июле 1805 года известная Анна Павловна Шерер, фрейлина и приближенная императрицы " +
            "Марии Федоровны, встречая важного и чиновного князя Василия, первым приехавшего на ее вечер. Анна " +
            "Павловна кашляла несколько дней, у нее был грипп, как она говорила (грипп был тогда новое слово, " +
            "употреблявшееся только редкими), а потому она не дежурила и не выходила из дому. В записочках, " +
            "разосланных утром с красным лакеем, было написано без различия во всех:\n" +
            "   \"Если у вас, граф (или князь), нет в виду ничего лучшего и если перспектива вечера у бедной больной " +
            "не слишком вас пугает, то я буду очень рада видеть вас нынче у себя между 7 и 10 часами.\n" +
            "   Анна Шерер\". Добавил где-то что-то.";

    private static String normalized = " Ну что князь Генуя и Лукка стали не больше как поместья поместья фамилии " +
            "Буонапарте Нет я вам вперед говорю если вы мне не скажете что у нас война если вы позволите себе " +
            "защищать все гадости все ужасы этого антихриста право я верю что он антихрист я вас больше не " +
            "знаю вы уже не друг мой вы уже не мой верный раб как вы говорите Ну здравствуйте здравствуйте Я " +
            "вижу что я вас пугаю садитесь и рассказывайте" +
            " Так говорила в июле 1805 года известная Анна Павловна Шерер фрейлина и приближенная императрицы " +
            "Марии Федоровны встречая важного и чиновного князя Василия первым приехавшего на ее вечер Анна " +
            "Павловна кашляла несколько дней у нее был грипп как она говорила грипп был тогда новое слово " +
            "употреблявшееся только редкими а потому она не дежурила и не выходила из дому В записочках " +
            "разосланных утром с красным лакеем было написано без различия во всех" +
            " Если у вас граф или князь нет в виду ничего лучшего и если перспектива вечера у бедной больной " +
            "не слишком вас пугает то я буду очень рада видеть вас нынче у себя между 7 и 10 часами" +
            " Анна Шерер Добавил где-то что-то ";

    @ParameterizedTest
    @MethodSource("words")
    public void testEasySearch(String word, long expected) {
        ISearchEngine easySearch = new EasySearch();

        long quantity = easySearch.search(fragment, word);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @MethodSource("words")
    public void testRegExSearch(String word, long expected) {
        ISearchEngine regExSearch = new RegExSearch();

        long quantity = regExSearch.search(fragment, word);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @MethodSource("words")
    public void testEasySearchEnginePunctuationNormalizer(String word, long expected) {
        ISearchEngine easySearch = new EasySearch();

        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(easySearch);

        long quantity = searchEnginePunctuationNormalizer.search(fragment, word);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @MethodSource("words")
    public void testRegExSearchEnginePunctuationNormalizer(String word, long expected) {
        ISearchEngine regExSearch = new RegExSearch();

        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);

        long quantity = searchEnginePunctuationNormalizer.search(fragment, word);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @DisplayName("EasySearch тестирование набором кейсов")
    @MethodSource("testWords")
    public void basisTestEasySearch(String testString, String testWord, long expected) {
        ISearchEngine easySearch = new EasySearch();

        long quantity = easySearch.search(testString, testWord);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @DisplayName("RegExSearch тестирование набором кейсов")
    @MethodSource("testWords")
    public void basisTestRegExSearch(String testString, String testWord, long expected) {
        ISearchEngine regExSearch = new RegExSearch();

        long quantity = regExSearch.search(testString, testWord);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @DisplayName("SearchEnginePunctuationNormalizer + EasySearch тестирование набором кейсов")
    @MethodSource("testWords")
    public void basisTestEasySearchPunctuationNormalizer(String testString, String testWord, long expected) {
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(new EasySearch());

        long quantity = searchEnginePunctuationNormalizer.search(testString, testWord);

        Assertions.assertEquals(expected, quantity);
    }

    @ParameterizedTest
    @DisplayName("SearchEnginePunctuationNormalizer + RegExSearch тестирование набором кейсов")
    @MethodSource("testWords")
    public void basisTestRegExSearchPunctuationNormalizer(String testString, String testWord, long expected) {
        ISearchEngine searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(new RegExSearch());

        long quantity = searchEnginePunctuationNormalizer.search(testString, testWord);

        Assertions.assertEquals(expected, quantity);
    }

    @Test
    public void normalizeTextTest () {
        SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer =
                new SearchEnginePunctuationNormalizer(new EasySearch());

        Assertions.assertEquals(normalized,
                searchEnginePunctuationNormalizer.getNormalizedText(fragment));
    }

    static Stream<Arguments> words() {
        return Stream.of(
                arguments("и", 7),
                arguments("в",  2),
                arguments("В",  1),
                arguments("не",  8),
                arguments("что",  4),
                arguments("он",  1),
                arguments("Анна",  3),
                arguments("что-то",  1),
                arguments(null,  -1)

        );
    }

    static Stream<Arguments> testWords() {
        return Stream.of(
                arguments("привет, как дела!", "привет", 1),
                arguments(".привет, как дела!", "привет", 1),
                arguments("привет, как дела.", "привет", 1),
                arguments("привет, как дела!", "как", 1),
                arguments(".привет.как.дела.", "дела", 1),
                arguments(".привет.как.дела.", "привет", 1),
                arguments(".привет.как.дела.", "как", 1),
                arguments("привет, как дела!", "дела", 1),
                arguments("привет,какдела!", "привет", 1),
                arguments("привет,какдела!", "какдела", 1),
                arguments("привет;какдела!", "привет", 1),
                arguments("привет;какдела!", "какдела", 1),
                arguments("как дела!.Что делаешь?", "как", 1),
                arguments("как дела!.Что делаешь?", "дела", 1),
                arguments("как дела!.Что делаешь?", "Что", 1),
                arguments("как дела!.Что делаешь?", "делаешь", 1),
                arguments("Привет-привет", "Привет-привет", 1),
                arguments("Привет -привет", "Привет", 1),
                arguments("Привет -привет", "привет", 1),
                arguments("4-х", "4-х", 1),
                arguments("один и 1", "один", 1),
                arguments("один и 1", "и", 1),
                arguments("один и 1", "1", 1),
                arguments("бабушка бабушке бабушку", "бабушка", 1),
                arguments("бабушка бабушке бабушку", "бабушке", 1),
                arguments("бабушка бабушке бабушку", "бабушку", 1),
                arguments("\"какашкИ\" букашки", "И", 0),
                arguments("\"какашкИ\" букашки", "какашкИ", 1),
                arguments("\"мама\" мыла раму", "мыл", 0),
                arguments("И в от как_бывает,однaко", "однако", 0), // latin a in text
                arguments("И в от как_бывает,однaко", "однaко", 1), // latin a in text and word
                arguments("И в от как_бывает,однaко", "и", 0),
                arguments("И в от как_бывает,однaко", "И", 1),
                arguments("И в от как_бывает,однaко", "как", 1),
                arguments("И в от как_бывает,однaко", "бывает", 1),
                arguments("И в от как_бывает,однaко", "в", 1),
                arguments("И в от как_бывает,однaко", "в от", 1),
                arguments("И в от как_бывает,однaко", "вот", 0),
                arguments("И в от как_бывает,однaко", "от", 1),
                arguments("И в от как_бывает,однaко", "как бывает", 0),
                arguments("И в от как_бывает,однaко", "как_бывает", 1),
                arguments("И в от как_бывает,однaко", null, -1),
                arguments(null, "как_бывает", -1),
                arguments(null, null, -1)
        );
    }
}
