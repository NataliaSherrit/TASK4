import java.util.Arrays;
import java.util.Random;

public class NumArray {
    public static int maxNeg;
    public static int minPos;
    public static int tmp;
    public static int tmp1;
    public static int tmp2;

    public static void main(String[] args) {
        int[] array = new int[20];
            Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - random.nextInt(21);
        }
        for (int j = 10; j > 0; j--) {
            for (int i = 0; i < array.length; i++)
                if (array[i] == j) {
                    minPos = array[i];
                    tmp1 = i;
                    break;
                }
            }
        for (int f = -10; f < 0; f++) {
            for (int i = 0; i < array.length; i++)
                if (array[i] == f) {
                    maxNeg = array[i];
                    tmp2 = i;
                    break;
                }
            }
        //Проверяю, что массив создан согласно условию
        System.out.println(Arrays.toString(array));
        //Проверяю, что элементы по условия найдены корректно
        System.out.println(minPos);
        System.out.println(maxNeg);
        //Меняю местами элементы - максимальный отрицательный и минимальный положительный
        tmp = array[tmp1];
        array[tmp1] = array[tmp2];
        array[tmp2] = tmp;
        //Проверяю, что элементы в итоговом массиве переставлены
        System.out.println(Arrays.toString(array));

    }
}

