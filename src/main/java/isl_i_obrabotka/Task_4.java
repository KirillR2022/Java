// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package isl_i_obrabotka;
        import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) throws Exception {
        String str1 = "";
        str1 = inputStr();
        printString(str1);
    }

    public static String inputStr() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String st = in.nextLine();
        if (st.equals("")) {
            throw new Exception("Строка не должна быть пустой!");
        }
        return st;
    }

    private static void printString(String st) {
        System.out.printf("Ваша строка: %s \n", st);
    }
}