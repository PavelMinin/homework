package home_work_6.additional.search;

import home_work_6.additional.search.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
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

        if(text.equals(word)) return 1;

        int pos = 0;
        long counter = 0;

        int textLength = text.length();
        int wordLength = word.length();

        if(textLength == wordLength) return 0;

        while((pos = text.indexOf(word, pos)) > -1) {
            String substring;
            if(pos >= 2 && pos < textLength - wordLength) {
                substring = text.substring(pos - 2 , pos + wordLength + 1);
                char[] chars = substring.toCharArray();
                if(!Character.isLetter(chars[1]) && !Character.isLetter(chars[chars.length - 1])
                && !(chars[1] == '-' || chars[chars.length - 1] == '-')) {
                    counter++;
                } else if(chars[1] == '-') {
                    if(Character.isWhitespace(chars[0])) {
                        counter++;
                    }
                }
            } else if(pos < 2) {
                substring = text.substring(0, pos + wordLength + 1);
                char[] chars = substring.toCharArray();
                boolean flag = Character.isLetter(chars[chars.length - 1]);
                if(pos >= 1) {
                    if(!Character.isLetter(chars[0]) && !flag) {
                        counter++;
                    }
                } else {
                    if (!flag) {
                        counter++;
                    }
                }
            } else {
                substring = text.substring(pos, textLength);
                if(word.equals(substring)) {
                    counter++;
                }
            }

            pos += wordLength;
        }

        return counter;
    }

    @Override
    public String toString() {
        return "EasySearch{}";
    }
}
