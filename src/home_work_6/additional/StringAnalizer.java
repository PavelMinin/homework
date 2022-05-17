package home_work_6.additional;

import home_work_6.additional.comparators.MapEntryKeyComparator;
import home_work_6.additional.comparators.MapEntryValueComparator;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalizer {
    // Поле сделано по принципу вдруг пригодится.
    private final String inputStr;

    /**
     * Конструктор анализатора принимает в себя строку и записывает в приватном
     * финальном поле. Данное поле неизменно весь период жизни объекта.
     * @param inputStr строка для анализа.
     */
    public StringAnalizer(String inputStr) {
        assert inputStr != null;
        this.inputStr = inputStr;
    }

    /**
     * Создает сет уникальных слов из переданной строки.
     * @return HashSet заполненный уникальными словами из переданной строки.
     */
    public Set<String> getSetOfWords() {
        String formattedStr = format(this.inputStr);
        Pattern pattern = Pattern.compile("(\\s*)(\\S+)(\\s*)");
        Matcher matcher = pattern.matcher(formattedStr);

        Set<String> setOfWords = new HashSet<>();

        while(matcher.find()) {
            setOfWords.add(matcher.group(2));
        }

        return setOfWords;
    }

    /**
     * Метод возвращает ТОП повторений слов в переданной строке.
     * @param topSize размер ТОПа
     * @return информация о размере топа, слова (в количестве равном размеру)
     * и количество их посторений в порядке убывания.
     */
    public String getTopOfWords(int topSize) {
        List<Map.Entry<String, Integer>> listOfMapEntry = getSortedListOfMapEntry();
        StringBuilder sb = new StringBuilder("ТОП-" + topSize + " слов в тексте:");

        int count = 0;
        for (Map.Entry<String, Integer> item : listOfMapEntry) {
            sb.append("\n").append(item.getKey()).append(" - ").append(item.getValue());
            count++;
            if(count >= topSize) break;
        }

        return sb.toString();
    }

    private List<Map.Entry<String, Integer>> getSortedListOfMapEntry() {
        List<Map.Entry<String, Integer>> listOfMapEntry = new ArrayList<>(getMapOfWords().entrySet());
        listOfMapEntry.sort(new MapEntryValueComparator().reversed().thenComparing(new MapEntryKeyComparator()));
        return listOfMapEntry;
    }

    private Map<String, Integer> getMapOfWords () {
        List<String> listOfWords = getListOfWords();
        Map<String, Integer> mapOfWords = new HashMap<>();

        listOfWords.forEach(s -> mapOfWords.merge(s, 1, Integer :: sum));

        return mapOfWords;
    }

    private List<String> getListOfWords() {
        String formattedStr = format(this.inputStr);
        Pattern pattern = Pattern.compile("(\\s*)(\\S+)(\\s*)");
        Matcher matcher = pattern.matcher(formattedStr);

        List<String> listOfWords = new ArrayList<>();

        while(matcher.find()) {
            listOfWords.add(matcher.group(2));
        }

        return listOfWords;
    }

    private String format(String originalText) {
        return originalText.replaceAll("[(':,!.;?*=><\"^&@#/)]", " ")
                .replaceAll(" +-+", " ")
                .replaceAll("\\s+", " ");
    }

    @Override
    public String toString() {
        return "StringAnalizer{\n" +
                "inputStr='" + inputStr.substring(0,50).concat("...") + '\'' +
                "\n}";
    }
}
