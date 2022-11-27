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

    public static boolean checkForRotation(String str1, String str2){
        StringBuilder strB1 = new StringBuilder(str1);
        StringBuilder strB2 = new StringBuilder(str2);
        String reverseStr1 = strB1.reverse().toString();
        String reverseStr2 = strB2.reverse().toString();
        return (str1.contains(str2) && reverseStr1.contains(reverseStr2)) || (reverseStr1.contains(str2) && str1.contains(reverseStr2));
    }

    public static String recursionReverse(String str){
        if (str.length() == 1){
            return str;
        } else{
            return str.charAt(str.length() - 1) + recursionReverse(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String strOne = "Hello world";
        String strTwo = "Hello";
        System.out.println(checkForContain(strOne, strTwo));
        System.out.println(checkForRotation(strOne, strTwo));
        System.out.println(recursionReverse(strOne));
    }
}
