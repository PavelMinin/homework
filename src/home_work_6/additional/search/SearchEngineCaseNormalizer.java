package home_work_6.additional.search;

import home_work_6.additional.search.api.ISearchEngine;

public class SearchEngineCaseNormalizer implements ISearchEngine {

    private final ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Метод ищет в переданном тексте переданное слово и возвращает значение
     * количество раз, которое оно встречается.
     *
     * @param text исходный текст
     * @param word искомое слово
     * @return количество повторений, -1 в случае, если один из аргументов null
     */
    @Override
    public long search(String text, String word) {
        String normalizedWord = normalizeWord(word);
        String normalizedText;
        return searchEngine.search(text, word);
    }

    private String normalizeWord(String word) {
        String wordWithoutEnding;
        if(word.endsWith("м")) {
            wordWithoutEnding = word.substring(0, word.length() - 2);
        } else if(word.endsWith("ми") || word.endsWith("ми")) {
            wordWithoutEnding = word.substring(0, word.length() - 3);
        } else {
            wordWithoutEnding = word.substring(0, word.length() - 1);
        }

        return wordWithoutEnding;
    }

    private String normalizeText(String text, String normalizedWord) {
        String wordWithoutEnding;
        if(text.endsWith("м")) {
            wordWithoutEnding = text.substring(0, text.length() - 2);
        } else if(text.endsWith("ми")) {
            wordWithoutEnding = text.substring(0, text.length() - 3);
        } else {
            wordWithoutEnding = text.substring(0, text.length() - 1);
        }

        return wordWithoutEnding;
    }
}
