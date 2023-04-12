import java.util.InputMismatchException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task2_1 {
    public static void main(String[] args) {
        System.out.println(getFloatNumberFromUser());
    }
    public static float getFloatNumberFromUser(){
        float input;
        while (true) {
            System.out.print("Введите действительное число: ");
            try {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextFloat();
                scanner.close();
                break;
            } catch (InputMismatchException ex){
                System.out.println("Неверный ввод!");
            }
        }
        return input;
    }

}
