import Data.*;
import Services.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

//        Написати програму “Магазин”, яка повинна містити відомості та
//        операції для роботи продуктового магазину.
//        Вимоги до функціоналу програми:
//        ● Отримання товарів
//        ● Продаж товарів
//        ● Редагування товарів
//        ● Збереження історії покупок користувачів
//        ● Замовлення товарів
//        ● Генерація чеку замовлення у .txt форматі.
//        ● Оплачений чек неможливо редагувати.
//        ● Для роботи із файлами створити клас FileService.
//        ● Дані про кількість товарів та ціни потрібно завантажувати із файлу
//        на початку роботи програми.
//        ● Якщо у списку покупок є овочі або фрукти, для кожної позиції
//        товару необхідно додавати пакет.
//        ● Якщо у списку товарів є м’ясо або риба, необхідно згенерувати
//        коментар до чеку у форматі “Не забудьте зберігати товари {товар_1},
//        {товар_2}...{}... у холодильнику”. (Коментар повинен бути
//        англійською мовою)
//        ● Написати метод для фільтрування та сортування усіх продуктів на
//        складі за ціною;
//        ● Написати метод для визначення середньої ціни всіх продуктів;
//        ● Написати метод для визначення всіх витрат заданого користувача за
//        заданий період часу;
//
//        ● Написати метод для отримання даних про сумарну кількість кожного
//        купленого продукту заданого користувача;
//        ● Написати метод для знаходження найпопулярнішого продукту;
//        ● Написати метод для знаходження найбільшого доходу за день.
//
//        Необхідно дотримувати принципів ООП
//        Завдання повинне бути виконане із використанням власних
//        Exception та із використанням Stream API. Якщо ж використовується
//        цикл замість Stream, на захисті потрібно пояснити чому саме цикл.
//        Самостійно визначити та створити усі класи, поля, додаткові
//        методи.
public class Main {
    public static void main(final String[] args) {

        final MarketService service = new MarketService();

        ProductInfo catFood = new ProductInfo(new Item("Cat food", ProductCategory.PET, StorageType.KILOGRAM), 1, 12, 14.);
        ProductInfo meat = new ProductInfo(new Item("Meat", ProductCategory.MEAT, StorageType.KILOGRAM), 1, 30., 180.);
        ProductInfo vegetables = new ProductInfo(new Item("Potato", ProductCategory.VEGETABLES, StorageType.KILOGRAM), 1, 100., 180.);
        ProductInfo bag = new ProductInfo(new Item("Bag", ProductCategory.BAG, StorageType.PIECE), 100, 0.04, 2.5);
        service.addProductsToStorage(catFood, meat, vegetables, bag);
        Customer customer = new Customer("Patric", "Sponge");
        Order testOrder = service.createOrder(vegetables, meat);
        service.payOrder(testOrder, customer);
        System.out.println(service.statisticByCustomer(customer));
    }
}
