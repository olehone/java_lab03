package Strategies;
//        ● Генерація чека замовлення у .txt форматі.
//        ● Оплачений чек неможливо редагувати.
//        ● Для роботи із файлами створити клас FileService.
//        ● Дані про кількість товарів та ціни потрібно завантажувати із файлу
//        на початку роботи програми.

import java.util.List;
import Data.*;
public interface FileStrategy {
    void toTxtFile(String name, String text);
    List<Goods> getGoods();
    List<Goods> getGoods(String fileName);



}
