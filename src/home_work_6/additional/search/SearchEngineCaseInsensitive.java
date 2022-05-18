package home_work_6.additional.search;

import home_work_6.additional.search.api.ISearchEngine;

public class SearchEngineCaseInsensitive implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEngineCaseInsensitive(ISearchEngine searchEngine) {
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
        if(text == null || word == null) return -1;
        if(this.searchEngine instanceof RegExSearch) {
            RegExSearch regExSearch = (RegExSearch) this.searchEngine;
            regExSearch.setCaseInsensitive(true);

            return regExSearch.search(text, word);
        } else {
            return searchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }

    @Override
    public String toString() {
        return "SearchEngineCaseInsensitive{\n" +
                "searchEngine = " + searchEngine;
    }
}
