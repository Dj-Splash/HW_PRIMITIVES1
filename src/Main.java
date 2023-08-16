public class Main {
    public static void main(String[] args) {
        int rub = 54333; // количество потраченных рублей
        int bonus = 20; // количество рублей за 1 бонусную милю
        int mile = rub / bonus; // вычисление полученных миль
        System.out.println("Клиент получит " + mile + " бонусных миль");
    }
}