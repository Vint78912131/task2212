/*
Проверка номера телефона
*/

public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        String regex0 = "^\\+(\\d[()]?){12}$";
        String regex1 = "^([()]?\\d){10}$";
        String regex2 = "^(\\+)?(\\d+)?(\\(\\d{3}\\))?\\d+$";

        return (telNumber != null && (telNumber.matches(regex0) || telNumber.matches(regex1)))
                || (telNumber != null && telNumber.matches(regex2));
    }
public static void main(String[] args) {
//        System.out.println(checkTelNumber("+79299542136"));
//        System.out.println(checkTelNumber("89299542136"));
//        System.out.println(checkTelNumber("8929936"));
//        System.out.println(checkTelNumber("89299542as"));

        System.out.println("+380501234567 is " + checkTelNumber("+380501234567"));
        System.out.println("+38(050)1234567 is " + checkTelNumber("+38(050)1234567"));
        System.out.println("(050)1234567 is " + checkTelNumber("(050)1234567"));
        System.out.println("0(501)234567 is " + checkTelNumber("0(501)234567"));
        System.out.println("+38)050(1234567 is " + checkTelNumber("+38)050(1234567"));
        System.out.println("+38(050)1234567) is " + checkTelNumber("+38(050)1234567)"));
        System.out.println("050ххх4567 is " + checkTelNumber("050ххх4567"));
        System.out.println("050123456 is " + checkTelNumber("050123456"));
        System.out.println("(0)501234567 is " + checkTelNumber("(0)501234567"));
        System.out.println("(05)01234567 is " + checkTelNumber("(05)01234567"));
        System.out.println("+7(499)80501234 is " + checkTelNumber("+7(499)80501234"));

    }
}
