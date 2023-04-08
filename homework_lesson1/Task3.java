import java.util.ArrayList;
import java.util.List;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен разности элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 5, 6};
        int[] array2 = {6, 2, 3, 1, 7};
        System.out.println(deduct(array1, array2));
    }

    public static List<Integer> deduct(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не должен быть равен null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i] - arr2[i]);
        }
        return arr;
    }
}
