package data;

public class Output {
    public void start() {
        System.out.println("""
                Для записи в файл информации о человеке введите:
                  1. Имя человека в формате ФИО: Иванов Иван Иванович
                  2. Дату рождение в формате день.месяц.год: 14.09.1990
                  3. Номер телефона в формате 11-значного числа: 89067567878
                  4. Пол в формате латинской буквы 'f' (жен.) или 'm' (муж.): m
                Чтобы запись произошла успешно необходимо заполнить все поля!
                Для выхода в любой момент можно ввести слово 'ВЫХОД'.
                """);
    }

    public void exit() {
        System.out.println("Запись была прервана пользователем.");
    }

    public void queryName() {
        System.out.print("Введите ФИО: ");
    }

    public void queryBirthdate() {
        System.out.print("Введите дату рождения: ");
    }

    public void queryPhoneNumber() {
        System.out.print("Введите номер телефона: ");
    }

    public void queryGender() {
        System.out.print("Введите пол: ");
    }

    public void failedName() {
        System.out.println("Неверный формат имени! Попробуйте еще раз.");
    }

    public void failedBirthdate() {
        System.out.println("Неверный формат даты! Попробуйте еще раз.");
    }

    public void failedPhoneNumber() {
        System.out.println("Неверный формат номера телефона! Попробуйте еще раз.");
    }

    public void failedGender() {
        System.out.println("Неверный формат пола! Попробуйте еще раз.");
    }

    public void failedRecording() {
        System.out.println("Запись в файл не удалась!");
    }

    public void successfulRecording() {
        System.out.println("Запись в файл произошла успешно!");
    }
}
