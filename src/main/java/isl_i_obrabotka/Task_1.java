// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.



package isl_i_obrabotka;
import java.util.Scanner;
public class Task_1 {


    public static void main(String[] args) {
        float number = 0;
        number = inputNumb();
        printNumber(number);
    }

    public static float inputNumb(){
        float num = 0;
        boolean fl = false;
        while (!fl) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите число: ");
                num = in.nextFloat();
                in.close();
                fl = true;
            } catch (RuntimeException e) {
                System.out.println("Необходимо ввести рациональное число\n");
            }
        }
        return num;
    }

    private static void printNumber(float num) {
        System.out.printf("Ваше число: %s \n", num);
    }

}