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

public class Homework5 {

    public static void main(String[] args) {
        Map<Integer, String> hMap = new HashMap<>();
        hMap.putIfAbsent(1, "white");
        hMap.putIfAbsent(2, "black");
        hMap.putIfAbsent(3, "grey");
        System.out.println(hMap);
    }
}
