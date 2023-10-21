package Strategies;
import java.time.ZonedDateTime;
import java.util.List;
import Data.*;
//Написати програму “Магазин”, яка повинна містити відомості та
//        операції для роботи продуктового магазину.
//        Вимоги до функціонала програми:
//        ● Отримання товарів
//        ● Продаж товарів
//        ● Редагування товарів
//        ● Збереження історії покупок користувачів
//        ● Замовлення товарів
//        ● Генерація чека замовлення у .txt форматі.
//        ● Оплачений чек неможливо редагувати.
//        ● Для роботи із файлами створити клас Services.FileService.
//        ● Дані про кількість товарів та ціни потрібно завантажувати із файлу
//        на початку роботи програми.
//        ● Якщо у списку покупок є овочі або фрукти, для кожної позиції
//        товару необхідно додавати пакет.
//        ● Якщо у списку товарів є м’ясо або риба, необхідно згенерувати
//        коментар до чека у форматі “Не забудьте зберігати товари {товар_1},
//        {товар_2}...{}... у холодильнику”. (Коментар повинен бути
//        англійською мовою)
//        ● Написати метод для фільтрування та сортування усіх продуктів на
//        складі за ціною;
public interface MarketStrategy {
    List<Goods> getItems();
    double sellItems(List<Goods> goods);
    Good modifyItem(Good item);
    double orderGoods(List<Goods> goods);
    Order generateOrder(List<Goods> goods);
    void changeOrder(Order order);
    List<Goods> sortGoodsByPrice(List<Goods> goods);
    List<Goods> filterGoodsByPrice(double lowestPrice, double highestPrice);
    List<Goods> getSortedByPriceWarehouseGoods();
    List<Goods> getGoodsFromCustomer(Customer customer);

}