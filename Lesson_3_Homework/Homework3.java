/**
 *
 *     1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 *     2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 *     3. Вставить элемент в список в первой позиции.
 *     4. Извлечь элемент (по указанному индексу) из заданного списка.
 *     5. Обновить определенный элемент списка по заданному индексу.
 *     6. Удалить третий элемент из списка.
 *     7. Поиска элемента в списке по строке.
 *     8. Создать новый список и добавить в него несколько елементов первого списка.
 *     9. Удалить из первого списка все элементы отсутствующие во втором списке.
 *     10. *Сортировка списка.
 *     11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList. */


package JavaEd.Lesson_3_Homework;

import java.util.ArrayList;
import java.util.List;

public class Homework3 {
    static List<String> createColorsList() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("green");
        colors.add("red");
        colors.add("brown");
        return colors;
    }
    static List<String> addExclamationPoint(List<String> list) {
        list.forEach(i -> i += "!");
        return list;
    }
    public static void main(String[] args) {
        List<String> colorsList = createColorsList();
        colorsList = addExclamationPoint(colorsList);
    }
}
