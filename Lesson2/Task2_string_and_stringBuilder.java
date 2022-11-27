/**
 * 1. Объявить строку с текстом
 * 2. Создать stringBuilder содержащий перевернутую строку
 * */

package JavaEd.Lesson2;

public class Task2_string_and_stringBuilder {
    public static void main(String[] args) {
        String str = "Hello world!";
        StringBuilder sB = new StringBuilder(str).reverse();
//        StringBuilder sB = new StringBuilder();
//        char[] chStr = str.toCharArray();
//        for (int i = 0; i < chStr.length; i++) {
//            sB.append(chStr[chStr.length - 1 - i]);
//        }
        System.out.println(sB);
    }
}
