package home_work_5.additional;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class StringRandomGenerator {
    private final static ThreadLocalRandom rnd = ThreadLocalRandom.current();

    private static char[] chars;

    public static String getRandomString(int from, int to) {
        chars = chars();

        StringBuilder sb = new StringBuilder();

        int length = rnd.nextInt(from, to + 1);
        for(int i = 0; i < length; i++) {
            sb.append(chars[rnd.nextInt(0, chars.length)]);
        }

        return sb.toString();
    }

    private static char[] chars() {
        char[] chars = new char[0];
        for (int i = 65; i < 91; i++) {
            chars = add(chars, (char) i);
        }

        for (int i = 97; i < 123; i++) {
            chars = add(chars, (char) i);
        }

        for(int i = 0; i < 10; i++) {
            chars = add(chars, (char) i);
        }

        chars = add(chars, '!');
        chars = add(chars, '@');
        chars = add(chars, '$');
        chars = add(chars, '&');
        chars = add(chars, '_');
        chars = add(chars, '-');

        return chars;
    }

    private static char[] add(char[] chars, char symbol) {
        if (chars == null) return null;

        char[] tmp = Arrays.copyOf(chars, chars.length + 1);

        tmp[chars.length - 1] = symbol;
        return tmp;
    }
}
