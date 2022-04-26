package home_work_4.runners;

import home_work_4.container.DataContainer;
import students.Student;
import students.addition.comparators.MarkComparator;
import students.addition.comparators.NameComparator;

import java.io.IOException;
import java.util.Iterator;

public class ContainerMain1 {
    public static void main(String[] args) throws IOException {

        DataContainer<Student> students = new DataContainer<>(new Student[0]);

        for (int i = 0; i < 20; i++) {
            students.add(new Student(i + 1));
        }

        System.out.println("Все студенты:");
        System.out.println(students);

        System.out.println("Элемент с индексом 19:");
        System.out.println(students.get(19) + "\n");

        System.out.println("Результат удаления элемента с индексом 19:");
        System.out.println(students.delete(19) + "\n");

        System.out.println("Текущий элемент с индексом 19:");
        System.out.println(students.get(19) + "\n");

        System.out.println("Текущий элемент с индексом -1:");
        System.out.println(students.get(-1) + "\n");

        System.out.println("Список студентов:");
        System.out.println(students + "\n");

        System.out.println("Результат удаления элемента с индексом 0:");
        System.out.println(students.delete(students.get(0)) + "\n");

        System.out.println("Список студентов:");
        System.out.println(students + "\n");

        System.out.println("Элемент с индексом 5:");
        System.out.println(students.get(5) + "\n");
        System.out.println("Результат удаления элемента с индексом 5:");
        System.out.println(students.delete(students.get(5)) + "\n");

        System.out.println("Результат удаления элемента с индексом 100 двумя способами:");
        System.out.println(students.delete(students.get(100)) + "\n" + students.delete(100) + "\n");

        System.out.println("Список студентов:");
        System.out.println(students + "\n");

        System.out.println("Отсортированный по имени список студентов:");
        students.sort(new NameComparator());
        System.out.println(students + "\n");

        System.out.println("Отсортированный по номеру список (используется переопределенный метод compareTo()):");
        DataContainer.sort(students);
        System.out.println(students + "\n");

        System.out.println("Отсортированный по оценке список (используется переопределенный метод compareTo()):");
        DataContainer.sort(students, new MarkComparator());
        System.out.println(students + "\n");

        System.out.println("Взять массив студентов:");
        Student[] students1 = students.getItems();
        for (Student student : students1) {
            String str = "№ п.п.: " + student.getNumber() +
                    "; имя: '" + student.getName() +
                    "; возраст: " + student.getAge() +
                    "; оценка: " + student.getMark() +
                    "; участник олимпиад: ";
            str += (student.isOlimpiadaMember() ? "да" : "нет");
            System.out.println(str);
        }

        System.out.println("\nИспользование итератора:");
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
    }
}
