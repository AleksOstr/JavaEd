/**
 * Домашнее задание к семинару №1
 * 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 * */


package JavaEd.Lesson_1_Homework_1;

import java.util.Random;

public class Homework1 {
    public static int getRandomInt() {
        int min = -1000;
        int max = 1000;
        int diff = max - min;
        int randInt = new Random().nextInt(diff + 1) + min;
        return randInt;
    }

    public static void main(String[] args) {
        int i = getRandomInt();
    }
}
