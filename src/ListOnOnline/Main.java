package ListOnOnline;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        List<String> students = new ArrayList<>();


        students.add("Алексей");
        students.add("Иван");
        students.add("Мария");
        students.add("Диана");
        students.add("Максим");
        System.out.println("Добавлены начальные студенты: " + students);


        List<String> additionalStudents = List.of("Вова", "Наталья", "Александр");
        students.addAll(additionalStudents);
        System.out.println("Добавлены новые студенты: " + additionalStudents);


        students.remove("Мария");
        System.out.println("Удалён студент 'Мария': " + students);

        students.remove(3); //
        System.out.println("Удалён студент с индексом 3: " + students);

        // Проверка
        System.out.println("Содержится ли 'Алексей' в списке? " + students.contains("Алексей"));

        List<String> checkList = List.of("Алексей", "Максим");
        System.out.println("Содержатся ли 'Алексей' и 'Максим'? " + students.containsAll(checkList));

        // Размер списка и проверка на пустоту
        System.out.println("Количество студентов: " + students.size());
        System.out.println("Список пуст? " + students.isEmpty());

        // Очистка списка
        students.clear();
        System.out.println("Список очищен.");
        System.out.println("Список пуст? " + students.isEmpty());


    }


}

