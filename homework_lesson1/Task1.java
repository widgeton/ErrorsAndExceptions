/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            sum(null, 7);
        } catch (NullPointerException ex) {
            System.out.println("Значения не должны быть null");
        }

        try {
            int[] arr = {4, 7, 6, 8, 9};
            getIndex(arr, 5, 10);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс вышел за пределы массива. Неверный размер массива.");
        }

        try {
            sumStringNumbers("четыре", "6");
        } catch (NumberFormatException ex) {
            System.out.println("Не получилось преобразовать String в Integer.");
        }
    }

    public static void sum(Integer num1, Integer num2) {
        System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
    }
    public static void getIndex(int[] array, int value, int sizeArray){
        Integer index = null;
        for (int i = 0; i < sizeArray; i++) {
            if(array[i] == value){
                index = i;
                break;
            }
        }
        if(index != null){
            System.out.printf("Индекс элемента со значением %d равен %d", value, index);
        } else {
            System.out.println("Элемент не найден");
        }
    }
    public static void sumStringNumbers(String number1, String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
    }

}