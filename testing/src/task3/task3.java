package task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        StringCounter strc = new StringCounter(str);
        strc.getGlasCount();                    //подсчитывать количество гласных в словах
        strc.printSorted();
        strc.uppercaseFirstGlas("пример");      //делать первую гласную букву в слове заглавной
    }
}
