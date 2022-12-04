/**
 * Написать приложение для ввода ФИО, возраст и пол пользователей.
 * Данные хранить в разных списках.
 * Сортировать пользователей по возрасту. */


package JavaEd.Lesson_4_Homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        List<String> listFirstName = new ArrayList<>();
        List<String> listSecondName = new ArrayList<>();
        List<String> listLastName = new ArrayList<>();
        List<Integer> listAge = new ArrayList<>();
        List<Boolean> listGender = new ArrayList<>();

        Boolean flag = true;
        while (flag) {
            Scanner scannerName = new Scanner(System.in);
            Scanner scannerAge = new Scanner(System.in);
            Scanner scannerGender = new Scanner(System.in);

            System.out.println("Enter your full name");
            String name = scannerName.nextLine();
            String[] arrName = name.split(" ");
            if (arrName.length == 3){
                listFirstName.add(arrName[0]);
                listSecondName.add(arrName[1]);
                listLastName.add(arrName[2]);
            } else if (arrName.length == 2) {
                listFirstName.add(arrName[0]);
                listSecondName.add("");
                listLastName.add(arrName[1]);
            } else if (arrName.length == 1) {
                listFirstName.add(arrName[0]);
            }


        }
    }
}
