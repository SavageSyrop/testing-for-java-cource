package task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Integer sum = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i=0;i<str.length();i++)
        {
            if (Character.isDigit(str.charAt(i))==true)
            {
                sum+=Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
