package home_work_6.additional.search;

import home_work_6.additional.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    private int flags;

    /**
     * Метод устанавливает нечувствительность к регистру при поиске.
     * @param caseInsensitive если true - поиск без учета регистра, если false - с учетом регистра.
     */
    public void setCaseInsensitive(boolean caseInsensitive) {
        if(caseInsensitive) {
            this.flags = Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE;
        } else {
            this.flags = 0;
        }
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
        if (text == null || word == null) {
            return -1;
        }

        if (text.equals(word)) return 1;

        long counter = 0;


        Pattern pattern = Pattern.compile("([(':,!.;?*=><\"^&@#/) _])(" + word + ")([(':,!.;?*=><\"^&@#/) _])", flags);

        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) counter++;

        pattern = Pattern.compile("^" + word, flags);
        matcher = pattern.matcher(text);

        if(matcher.find()) counter++;

        pattern = Pattern.compile(word + "$", flags);
        matcher = pattern.matcher(text);

        if(matcher.find()) counter++;

        return counter;
    }

    @Override
    public String toString() {
        String info = "RegExSearch{}";
        if(flags != 0) {
            info.concat(" - case insensitive");
        }
        return info;
    }
}
