package home_work_1.part2;

import home_work_1.part2.additional.ConditionalStatements12;
import home_work_1.part2.additional.ConditionalStatements22;
import home_work_1.part2.additional.ConditionalStatements32;

import java.util.Scanner;

public class ConditionalStatementsMain {
    public static void main(String[] args) {
        Scanner terminalIn = new Scanner(System.in);

        System.out.println("Введите ваше имя");

        String nameIn = terminalIn.next();

        System.out.println(new ConditionalStatements12().welcome(nameIn) + "\n");
        System.out.println(new ConditionalStatements22().welcome(nameIn) + "\n");
        System.out.println(new ConditionalStatements32().welcome(nameIn));
    }
}
