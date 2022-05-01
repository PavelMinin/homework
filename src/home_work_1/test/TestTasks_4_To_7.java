package home_work_1.test;

import home_work_1.ByteToBinaryString;
import home_work_1.CreatePhoneNumber;
import home_work_1.SmartAlarm;
import home_work_1.part2.additional.ConditionalStatements12;
import home_work_1.part2.additional.ConditionalStatements22;
import home_work_1.part2.additional.ConditionalStatements32;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTasks_4_To_7 {
    private final String[] anotherNames = {
            "Август", "Августин", "Авраам", "Аврора", "Агата", "Агафон", "Агнесса", "Агния", "Ада", "Аделаида",
            "Аделина", "Адонис", "Акайо", "Акулина", "Алан", "Алевтина", "Александр", "Александра", "Алексей",
            "Алена", "Алина", "Алиса", "Алла", "Алсу", "Альберт", "Альбина", "Альфия", "Альфред", "Амалия", "Амелия",
            "Анастасий", "Анатолий", "Ангелина", "Андрей", "Анжела", "Анжелика", "Анисий", "Анна", "Антон",
            "Антонина", "Анфиса", "Аполлинарий", "Аполлон"};
    @Test
    @DisplayName("Тест метода SleepIn. Задача 4*")
    public void smartAlarmSleepIn() {
        Assertions.assertTrue(SmartAlarm.sleepIn(true,true));
        Assertions.assertFalse(SmartAlarm.sleepIn(true,false));
        Assertions.assertTrue(SmartAlarm.sleepIn(false,true));
        Assertions.assertTrue(SmartAlarm.sleepIn(false,false));
    }

    @Test
    @DisplayName("Тест метода welcome (3 реализации). Задача 5")
    public void conditionStatementsWelcome() {
        String name1 = "Вася";
        String name2 = "Анастасия";

        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал",
                new ConditionalStatements12().welcome(name1));
        Assertions.assertEquals("Я тебя так долго ждал",
                new ConditionalStatements12().welcome(name2));
        for (String anotherName : anotherNames) {
            Assertions.assertEquals("Добрый день. А вы кто?",
                    new ConditionalStatements12().welcome(anotherName));
        }

        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал",
                new ConditionalStatements22().welcome(name1));
        Assertions.assertEquals("Я тебя так долго ждал",
                new ConditionalStatements22().welcome(name2));
        for (String anotherName : anotherNames) {
            Assertions.assertEquals("Добрый день. А вы кто?",
                    new ConditionalStatements22().welcome(anotherName));
        }

        Assertions.assertEquals("Привет! \nЯ тебя так долго ждал",
                new ConditionalStatements32().welcome(name1));
        Assertions.assertEquals("Я тебя так долго ждал",
                new ConditionalStatements32().welcome(name2));
        for (String anotherName : anotherNames) {
            Assertions.assertEquals("Добрый день. А вы кто?",
                    new ConditionalStatements32().welcome(anotherName));
        }
    }

    @Test
    @DisplayName("Тест метода createPhoneNumber. Задача 6*")
    public void createPhoneNumber() {
        long[] digits1 = {1,2,3,4,5,6,7,8,9,0};
        String expected1 = "(123) 456-7890";

        long[] digits2 = {0,9,8,7,6,5,4,3,2,1};
        String expected2 = "(098) 765-4321";

        long[] digits3 = {0,6,8,5,0,0,1,9,1,4};
        String expected3 = "(068) 500-1914";

        Assertions.assertEquals(expected1, CreatePhoneNumber.createPhoneNumber(digits1));
        Assertions.assertEquals(expected2, CreatePhoneNumber.createPhoneNumber(digits2));
        Assertions.assertEquals(expected3, CreatePhoneNumber.createPhoneNumber(digits3));
    }

    @Test
    @DisplayName("Тест метода toBinaryString. Задача 7**")
    public void toBinariString() {
        int num1 = 127;
        String expected1 = "01111111";
        int num2 = -128;
        String expected2 = "10000000";
        int num3 = 0;
        String expected3 = "00000000";
        int num4 = 1;
        String expected4 = "00000001";
        int num5 = -1;
        String expected5 = "11111111";
        int num6 = 42;
        String expected6 = "00101010";
        int num7 = 15;
        String expected7 = "00001111";
        int num8 = -42;
        String expected8 = "11010110";
        int num9 = -15;
        String expected9 = "11110001";

        Assertions.assertEquals(expected1, ByteToBinaryString.toBinaryString(num1));
        Assertions.assertEquals(expected2, ByteToBinaryString.toBinaryString(num2));
        Assertions.assertEquals(expected3, ByteToBinaryString.toBinaryString(num3));
        Assertions.assertEquals(expected4, ByteToBinaryString.toBinaryString(num4));
        Assertions.assertEquals(expected5, ByteToBinaryString.toBinaryString(num5));
        Assertions.assertEquals(expected6, ByteToBinaryString.toBinaryString(num6));
        Assertions.assertEquals(expected7, ByteToBinaryString.toBinaryString(num7));
        Assertions.assertEquals(expected8, ByteToBinaryString.toBinaryString(num8));
        Assertions.assertEquals(expected9, ByteToBinaryString.toBinaryString(num9));
    }
}
