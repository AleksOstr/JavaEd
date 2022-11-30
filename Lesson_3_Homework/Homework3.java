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
import java.util.Iterator;
import java.util.List;

public class Homework3 {
    static List<StringBuilder> createColorsList() {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("white"));
        list.add(new StringBuilder("black"));
        list.add(new StringBuilder("green"));
        list.add(new StringBuilder("red"));
        list.add(new StringBuilder("brown"));
        return list;
    }
    static StringBuilder addExclamationPoint(StringBuilder str) {
        str.append("!");
        return str;
    }

    static List<StringBuilder> addToFirstPlace(List<StringBuilder> list, StringBuilder str) {
        list.add(0, str);
        return list;
    }

    static StringBuilder getElementByIndex(List<StringBuilder> list, int index) {
        return list.get(index);
    }

    static List<StringBuilder> updateElementByIndex(List<StringBuilder> list, int index, String str) {
        list.set(index, new StringBuilder(str));
        return list;
    }
    public static void main(String[] args) {
        List<StringBuilder> colorsList = createColorsList();
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        colorsList.forEach(color -> color = addExclamationPoint(color));
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        colorsList = addToFirstPlace(colorsList, new StringBuilder("purple"));
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");

        StringBuilder color2 = getElementByIndex(colorsList, 2);
        System.out.println(color2);
        System.out.println("------------");

        colorsList = updateElementByIndex(colorsList, 4, "yellow");
        colorsList.forEach(color -> System.out.println(color));
        System.out.println("------------");
    }
}
