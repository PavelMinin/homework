package home_work_5.additional;

import java.util.concurrent.ThreadLocalRandom;

public class RandomItemFromNickArray {
    private static final String[] nicks = {
            "Дарман", "Цезарь", "Одиссей", "Эмир", "Анда", "Терра", "Эльба", "Герда",
            "Эйс", "Аксель", "Баки", "Бруно", "Харли", "Лола", "Рокси", "Виксен",
            "Чарли", "Бейли", "Купер", "Макс", "Белла", "Луна", "Люси", "Джиджи", "Рози",
            "Зус", "Локи", "Мики", "Оскар", "Отис", "Дакота", "Эби", "Бонни", "Несси",
            "Девид", "Френк", "Чип", "Спарки", "Элвис", "Марли", "Тото", "Дейзи", "Олли",
            "Арчи", "Альто", "Бруно", "Чарли", "Джеймс", "Монро", "Элис", "Мейбел", "Мегги", "Флоренс",
            "Кельвин", "Честер", "Метью", "Воррен", "Эмма", "Сали", "Леона", "Руф", "Эли",
            "Маврик", "Спайк", "Тор", "Один", "Дейзел", "Вега", "Афина", "Рокс", "Герда",
            "Пит", "Альберт", "Арнольд", "Бернард", "Леонард", "Стелла", "Бетси", "Нора", "София",
            "Эрнест", "Раймонд", "Флойд", "Честер", "Джек", "Энджел", "Милли", "Вера", "Нелли",
            "Докси", "Пинки", "Тайни", "Витти", "Скреппи", "Бавария", "Руди", "Фрида", "Марта",
            "Дино", "Купер", "Оливер", "Эрнест", "Арчибальд", "Зельда", "Амелия", "Молли", "Зоуи",
            "Алекс", "Джаспер", "Самуэль", "Касус", "Джинжер", "Сальма", "Кора", "Элизабет",
            "Лиам", "Калеб", "Дилан", "Нейтон", "Анна", "Ариадна", "Натали", "Клэр",
            "Грейс", "Коннор", "Генри", "Дэвид", "Сара", "Элен", "Хлоэ", "Изабелла"
    };

    public static String getRandomNick() {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();
        return nicks[rnd.nextInt(0, nicks.length)];
    }
}