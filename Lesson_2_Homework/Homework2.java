/**
 1. �������� ��������� �� Java, ����� ����� ���������� ���� � ������, ���������� ��� ������� ������ ������.
 2. �������� ��������� �� Java, ����� ���������, �������� �� ��� ������ ������ ��������� ���� �����.
 3. *�������� ��������� �� Java, ����� ����������� ������ � ������� ��������.
 4. ���� ��� �����, �������� 3 � 56, ���������� ��������� ��������� ������: 3 + 56 = 59 3 � 56 = -53 3 * 56 = 168 ���������� ����� StringBuilder.append().
 5. �������� ������ �=� �� ����� ������. ����������� ������ StringBuilder.insert(),StringBuilder.deleteCharAt().
 6. *�������� ������ �=� �� ����� ������. ����������� ������ StringBuilder.replace().
 7. **�������� ����� ���������� ����� 6 �� ������� ���������� 10000 �������� "=" ���������� String � StringBuilder.
*/


package JavaEd.Lesson_2_Homework;

public class Homework2 {

    public static boolean checkForContain(String str1, String str2){
        return str1.contains(str2);
    }
    public static void main(String[] args) {
        String strOne = "Hello world";
        String strTwo = "Hello";
        System.out.println(checkForContain(strOne, strTwo));
    }
}
