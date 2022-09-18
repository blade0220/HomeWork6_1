import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task_1();
        // Task_2();
        // Task_3();
        //Task_4();
        // Task_5();
    }

    public static void Task_1() {
        System.out.println("Задание 1");
        int[] myArray = new int[3];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;

        double[] array = new double[]{1.57, 7.654, 9.986};

        String[] month = {"Март", "Апрель", "Май"};

        // System.out.println(myArray[0] + "," + myArray[1] + "," + myArray[2]);

        // }

        // public static void Task_2() {
        System.out.println("Задание 2");

        for (int i = 0; i < myArray.length; i++) {
            if (i != myArray.length - 1) {
                System.out.print(myArray[i] + ", ");

            } else
                System.out.println(myArray[i]);
        }

        //  double[] array = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");

                //System.out.println();
            } else
                System.out.println(array[i]);
        }

        //String[] month = {"Март", "Апрель", "Май"};
        for (int i = 0; i < 3; i++) {
            if (i != month.length - 1) {
                System.out.print(month[i] + ", ");

                //System.out.println();
            } else
                //System.out.println(array[i]);
                System.out.println(month[i]);
        }

        System.out.println("Задание 3");

        for (int i = myArray.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(myArray[i] + ", ");
            } else
                System.out.println(myArray[i]);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + ", ");
            } else
                System.out.println(array[i]);
        }

        for (int i = month.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(month[i] + ", ");
            } else
                System.out.println(month[i]);
        }

        System.out.println("Задание 4");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                myArray[i] = myArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}