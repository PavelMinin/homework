package home_work_6.test;

import home_work_6.additional.TxtFileReader;
import home_work_6.additional.search.EasySearch;
import home_work_6.additional.search.RegExSearch;
import home_work_6.additional.search.SearchEngineCaseInsensitive;
import home_work_6.additional.search.SearchEnginePunctuationNormalizer;
import home_work_6.additional.search.api.ISearchEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ISearchEngineWarAndPeaceTest {

    private final String text;

    public ISearchEngineWarAndPeaceTest() {
        String text1;
        try {
            String path = "/Users/pavelminin/IdeaProjects/Md-JC1/homework/" +
                    "src/home_work_6/resourses/Война и мир_книга.txt";
            text1 = new TxtFileReader(path).getText();
        } catch (IOException e) {
            e.printStackTrace();
            text1 = null;
        }
        this.text = text1;
    }


    @ParameterizedTest
    @MethodSource("cases")
    public void searchEasyCaseInsensitiveTestOnWarAndPeace(String word, long expected) {
        ISearchEngine easySearch = new EasySearch();
        ISearchEngine searchEasyCaseInsensitive = new SearchEngineCaseInsensitive(easySearch);

        Assertions.assertEquals(expected, searchEasyCaseInsensitive.search(this.text, word));

    }

    @ParameterizedTest
    @MethodSource("cases")
    public void searchRegExCaseInsensitivTestOnWarAndPeace(String word, long expected) {
        ISearchEngine regExSearch = new RegExSearch();
        ISearchEngine searchRegExCaseInsensitive = new SearchEngineCaseInsensitive(regExSearch);

        Assertions.assertEquals(expected, searchRegExCaseInsensitive.search(text, word));
    }

    @ParameterizedTest
    @MethodSource("cases")
    public void searchPunctuationNormalizerEasyCaseInsensitiveTestOnWarAndPeace(String word, long expected) {
        ISearchEngine easySearch = new EasySearch();
        ISearchEngine searchEasyPunctuationNormalizer = new SearchEnginePunctuationNormalizer(easySearch);
        ISearchEngine searchPunctuationNormalizerEasyCaseInsensitive =
                new SearchEngineCaseInsensitive(searchEasyPunctuationNormalizer);

        Assertions.assertEquals(expected, searchPunctuationNormalizerEasyCaseInsensitive.search(text, word));
    }

    @ParameterizedTest
    @MethodSource("cases")
    public void searchPunctuationNormalizerRegExCaseInsensitiveTestOnWarAndPeace(String word, long expected) {
        ISearchEngine regExSearch = new RegExSearch();
        ISearchEngine searchRegExPunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
        ISearchEngine searchPunctuationNormalizerRegExCaseInsensitive =
                new SearchEngineCaseInsensitive(searchRegExPunctuationNormalizer);

        Assertions.assertEquals(expected, searchPunctuationNormalizerRegExCaseInsensitive.search(text, word));
    }

    static Stream<Arguments> cases() {
        return Stream.of(
                arguments("война", 52),
                arguments("и", 14600),
                arguments("мир", 32)
                );
    }
}
