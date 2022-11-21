/** Задана натуральная степень k. 
 * Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена 
 * и записать в файл многочлен степени k. */

package JavaEd.task1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class task1 {
    public static void writePoly(String str) {
        try (FileWriter writer = new FileWriter("poly.txt", false)) {
            writer.write(str);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "";

        System.out.println("Введите степень многочлена: ");
        Integer k = in.nextInt();

        if (k == 0) {
            int c = (int) (Math.random() * 101);
            result = String.format("c = %d", c);
            writePoly(result);
        } else if (k == 1) {
            int c1 = (int) (Math.random() * 101);
            int c2 = (int) (Math.random() * 101);
            result = String.format("%d*x + %d = 0", c1, c2);
            writePoly(result);
        } else if (k > 1) {
            String[] coefs = new String[k];
            for (int i = 0; i < coefs.length; i++) {
                int c = (int) (Math.random() * 101);
                if (c != 0 && k - i != 1) {
                    coefs[i] = String.format("%d*x^%d", c, k - i);
                } else if (c != 0 && k - i == 1) {
                    coefs[i] = String.format("%d*x", c);
                } else {
                    coefs[i] = "";
                }
                result = String.join("+", result, coefs[i]);
            }
            int lCoef = (int) (Math.random() * 101);
            String lastCoef = Integer.toString(lCoef);
            result = result.substring(1) + "+" + lastCoef + " = 0";
            writePoly(result);
        }

    }

}
