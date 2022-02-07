package task5;

import java.util.ArrayList;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Библия", 1, 300));
        items.add(new Item("Мiвiна", 2, 28));
        items.add(new Item("Дефибрилятор", 4, 1500));
        items.add(new Item("Слиток золота", 2, 40000));
        items.add(new Item("Пачка баксов", 1, 5000));
        items.add(new Item("Кубинские сигары", 3, 3000));
        Integer safeSize = 9;
        System.out.println("Размер сейфа: " + safeSize);
        Safe flange9000 = new Safe(safeSize); //ввод размера сейфа
        flange9000.makeAllSets(items);
        ArrayList<Item> result = flange9000.getBestSet();
        if (result==null)
        {
            System.out.println("Решения нет");
        }
        else
        {
            System.out.println("Содержимое сейфа: ");
            Integer sum = 0;
            for (Item i: result)
            {
                sum+=i.getValue();
                System.out.println("Наименование: "+i.getName()+", Размер: " + i.getSize()+", Цена: " + i.getValue());
            }
            System.out.println("Суммарная ценность вещей в сейфе: " + sum);
        }
    }
}
