import java.util.ArrayList;
import java.util.List;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 8, 5};
        int[] array2 = {2, 5, 3, 6, 0};
        System.out.println(division(array1, array2));
    }
    public static List<Integer> division (int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не должен быть равен null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны");
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0){
                throw new RuntimeException("На ноль делить нельзя!");
            }
            arr.add(arr1[i] / arr2[i]);
        }
        return arr;
    }
}
