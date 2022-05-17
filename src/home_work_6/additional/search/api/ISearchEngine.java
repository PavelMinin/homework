package home_work_6.additional.search.api;

public interface ISearchEngine {

    /**
     * Метод ищет в переданном тексте переданное слово и возвращает значение
     * количество раз, которое оно встречается.
     * @param text исходный текст
     * @param word искомое слово
     * @return количество повторений, -1 в случае, если один из аргументов null
     */
    long search(String text, String word);
}
