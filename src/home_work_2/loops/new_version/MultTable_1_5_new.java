package home_work_2.loops.new_version;

public class MultTable_1_5_new {
    public static String getMultiplyTable() {
        StringBuilder sb = new StringBuilder("                           ТАБЛИЦА УМНОЖЕНИЯ\n\n");


        // Вывод построчно первых 4 столбцов
        for (int i = 1; i <= 10; i ++){
            for (int j = 2; j <= 5; j++){
                if (i < 10 && j * i < 10){ // Выравниваем до пробелами если множитель и значение умножения меньше 10
                    sb.append(j).append(" x ").append(" ").append(i)
                            .append(" = ").append(" ").append(j * i).append("\t\t");
                } else if (i < 10 && j * i >= 10){ // Выравниваем пробелом если только множитель меньше 10
                    sb.append(j).append(" x ").append(" ").append(i)
                            .append(" = ").append(j * i).append("\t\t");
                } else { // Не добавляем пробелов
                    sb.append(j).append(" x ").append(i)
                            .append(" = ").append(j * i).append("\t\t");
                }
            }
            sb.append("\n"); // Переход на новую строку
        }

        // Дополнительные пустые строки
        sb.append("\n\n");

        // Вывод построчно оставшихся 4 столбцов
        for (int i = 1; i <= 10; i ++){
            for (int j = 6; j <= 9; j++){
                if (i < 10 && j * i < 10){ // Выравниваем до пробелами если множитель и значение умножения меньше 10
                    sb.append(j).append(" x ").append(" ").append(i)
                            .append(" = ").append(" ").append(j * i).append("\t\t");
                } else if (i < 10 && j * i >= 10){ // Выравниваем пробелом если только множитель меньше 10
                    sb.append(j).append(" x ").append(" ").append(i)
                            .append(" = ").append(j * i).append("\t\t");
                } else { // Не добавляем пробелов
                    sb.append(j).append(" x ").append(i)
                            .append(" = ").append(j * i).append("\t\t");
                }
            }
            sb.append("\n"); // Переход на новую строку
        }

        sb.append("\nЭТО\nНУЖНО\t\t\t\t\t\t\t\t\t\t\t\t\t*Dinosaur.img*\nЗНАТЬ!");

        return sb.toString();
    }
}
