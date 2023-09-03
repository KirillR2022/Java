//Если необходимо, исправьте данный код


package isl_i_obrabotka;

public class Task_2 {

    public static void main(String[] args) {
        double catchedRes1 = 0;
        try {
            int d = 0;
            int[] intArray;
            intArray = new int[]{1, 23, 4, 5, 6, 12, 7, 8, 8, 7};
            catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        System.out.println("Продолжаем код.");
        System.out.print(catchedRes1);
    }

}