/**
 *
 * 1. Создать словарь HashMap. Обобщение <Integer, String>.
 * 2. Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
 * 3. Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
 * 4. *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
 * 5. **Сравнить время прямого и случайного перебора тысячи элементов словарей.*/


package JavaEd.Lesson_5_Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Homework5 {
    static void addColors(Map<Integer, String> map){
        map.putIfAbsent(1, "white");
        map.putIfAbsent(2, "black");
        map.putIfAbsent(3, "grey");
    }

    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        addColors(hMap);
        System.out.println(hMap);

        hMap.forEach((k, v) -> hMap.put(k, v + "!"));
        System.out.println(hMap);

        Map<Integer, String> tMap = new TreeMap<>();
        addColors(tMap);
        System.out.println(tMap);

        tMap.forEach((k, v) -> tMap.put(k, v + "!"));
        System.out.println(tMap);
    }
}
