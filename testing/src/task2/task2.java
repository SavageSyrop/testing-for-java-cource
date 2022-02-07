package task2;

import java.util.Scanner;

public class task2 {
    public static void deconstruct(Double num,Integer div)
    {
        if (div>num) return;
        if (num%div==0)
        {
            System.out.print(div+" ");
            while(num % div==0)
            {
                num/=div;
            }
        }
        deconstruct(num,div+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: num=");
        Double num = sc.nextDouble();
        while (num%1!=0)
        {
            System.out.print("Ошибка, введено нецелое число, повторите ввод: ");
            System.out.print("num=");
            num = sc.nextDouble();
        }
        deconstruct(num,2);
    }
}
