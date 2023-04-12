/*
При необходимости исправить код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */
public class Task2_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            // Если не создать массив и обратиться к нему, то не пройдет компиляция.
            // Размер массива должен быть больше индекса обращения к нему в следующей строке,
            // иначе вылетит с ошибкой IndexOutOfBoundsException.
            int[] intArray = new int[10];
            double catchedRes1 = intArray[8] / d;
            // Следующую строку можно убрать, т.к. до нее при таком коде дело не дойдет,
            // но при других сценариях она нужна, поэтому я ее не убрл.
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
