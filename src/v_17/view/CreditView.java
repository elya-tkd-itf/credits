package v_17.view;

import v_17.base.Credit;

import java.util.List;

//Класс, отвечающий за вывод на экра сообщений
public class CreditView implements CreditViewInterface {
    //Метод, выводящий на экран приветствие в начале работы программы
    @Override
    public void printHello() {
        System.out.println("Добро пожаловать!");
    }

    //Метод, выводящий на экран прощание в конце работы программы
    @Override
    public void printGoodBye() {
        System.out.println("До свидания!");
    }

    //Метод, выводящий на экран меню
    @Override
    public void printMenu() {
        printSeparator();
        System.out.println("Выберите пункт меню:");
        System.out.println("1. Показать все кредиты с заданными условиями");
        System.out.println("2. Указать максимальную процентную ставку");
        System.out.println("3. Указать необходимую сумму денег");
        System.out.println("4. Указать желательное время выплаты в месяцах");
        System.out.println("5. Очистить фильтры");
        System.out.println("6. Выйти");
        printSeparator();
    }

    /**
     * Метод, выводящий на экран все кредиты из списка
     *
     * @param credits
     */
    @Override
    public void printCredits(List<Credit> credits) {
        if (credits.size() == 0) System.out.println("Нет подходящих кредитов...");
        for (Credit credit : credits)
            System.out.println(credit);
    }

    //Метод, выводящий на экран ошибку ввода процетной ставки
    @Override
    public void printErrorRate() {
        System.out.print("Вы ввели неправильную процентную ставку, попробуйте еще раз:");
    }

    //Метод, выводящий на экран запрос процентной ставки
    @Override
    public void printTypeRate() {
        System.out.println("Введите процентную ставку (от 0% до 100%):");
    }

    //Метод, выводящий на экран ошибку ввода суммы кредита
    @Override
    public void printErrorSum() {
        System.out.print("Вы ввели неправильную сумму, попробуйте еще раз:");
    }

    //Метод, выводящий на экран запрос суммы кредита
    @Override
    public void printTypeSum() {
        System.out.println("Введите сумму кредита (от 1 руб):");
    }

    //Метод, выводящий на экран ошибку ввода количества месяцев
    @Override
    public void printErrorMonth() {
        System.out.print("Вы ввели неправильное количество месяцев, попробуйте еще раз:");
    }

    //Метод, выводящий на экран запрос количества месяцев
    @Override
    public void printTypeMonth() {
        System.out.println("Введите время выплаты в месяцах (от 1 месяца):");
    }

    //Метод, выводящий на экран ошибку выбора пункта меню
    @Override
    public void printErrorMenu() {
        System.out.println("Такого пункта меню нет");
    }

    //Метод, выводящий на экран разделитель
    @Override
    public void printSeparator() {
        System.out.println("------------------------------------------------------");
    }
}
