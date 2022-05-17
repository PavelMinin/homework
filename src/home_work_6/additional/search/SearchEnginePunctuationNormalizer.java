package home_work_6.additional.search;

import home_work_6.additional.search.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    private String normalizeText(String text) {
        return text.replaceAll("[^\\w\\dА-Яа-яËё-]", " ")
                .replaceAll("-+", "-")
                .replaceAll("-\\s+", " ")
                .replaceAll("\\s+-", " ")
                .replaceAll("\\s+", " ");
    }

    /**
     * Метод ищет в переданном тексте переданное слово и возвращает значение
     * количество раз, которое оно встречается.
     *
     * @param text исходный текст
     * @param word искомое слово
     * @return количество повторений
     */
    @Override
    public long search(String text, String word) {
        if(text != null) {
            text = normalizeText(text);
        }

        return this.searchEngine.search(text, word);
    }

    /**
     * Метод для тестирования приватного метода, который нормализует входной
     * текст, убирая знаки препинания и лишние пробелы.
     * @param text Входной текст
     * @return текст без знаков припенания и дублированных пробелов, null если был передан null
     */
    public String getNormalizedText(String text) {
        if(text != null) {
            return normalizeText(text);
        }

        return null;
    }

    @Override
    public String toString() {
        return "SearchEnginePunctuationNormalizer{\n" +
                "searchEngine = " + searchEngine;
    }
}
