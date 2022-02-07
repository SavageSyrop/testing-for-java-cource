package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class task4 {


    public static void main(String[] args) {
        String[][] digitAlphabet = new String[7][10];
        digitAlphabet[0][0] = "  ###   ";
        digitAlphabet[1][0] = " #   #  ";
        digitAlphabet[2][0] = "#     # ";
        digitAlphabet[3][0] = "#     # ";
        digitAlphabet[4][0] = "#     # ";
        digitAlphabet[5][0] = " #   #  ";
        digitAlphabet[6][0] = "  ###   ";

        digitAlphabet[0][1] = "   #   ";
        digitAlphabet[1][1] = "  ##   ";
        digitAlphabet[2][1] = " # #   ";
        digitAlphabet[3][1] = "   #   ";
        digitAlphabet[4][1] = "   #   ";
        digitAlphabet[5][1] = "   #   ";
        digitAlphabet[6][1] = " ##### ";

        digitAlphabet[0][2] = " #####  ";
        digitAlphabet[1][2] = "#     # ";
        digitAlphabet[2][2] = "      # ";
        digitAlphabet[3][2] = " #####  ";
        digitAlphabet[4][2] = "#       ";
        digitAlphabet[5][2] = "#       ";
        digitAlphabet[6][2] = "####### ";

        digitAlphabet[0][3] = " #####  ";
        digitAlphabet[1][3] = "#     # ";
        digitAlphabet[2][3] = "      # ";
        digitAlphabet[3][3] = " #####  ";
        digitAlphabet[4][3] = "      # ";
        digitAlphabet[5][3] = "#     # ";
        digitAlphabet[6][3] = " #####  ";

        digitAlphabet[0][4] = "#       ";
        digitAlphabet[1][4] = "#    #  ";
        digitAlphabet[2][4] = "#    #  ";
        digitAlphabet[3][4] = "#    #  ";
        digitAlphabet[4][4] = "####### ";
        digitAlphabet[5][4] = "     #  ";
        digitAlphabet[6][4] = "     #  ";

        digitAlphabet[0][5] = "####### ";
        digitAlphabet[1][5] = "#       ";
        digitAlphabet[2][5] = "#       ";
        digitAlphabet[3][5] = "######  ";
        digitAlphabet[4][5] = "      # ";
        digitAlphabet[5][5] = "#     # ";
        digitAlphabet[6][5] = " #####  ";

        digitAlphabet[0][6] = " #####  ";
        digitAlphabet[1][6] = "#     # ";
        digitAlphabet[2][6] = "#       ";
        digitAlphabet[3][6] = "######  ";
        digitAlphabet[4][6] = "#     # ";
        digitAlphabet[5][6] = "#     # ";
        digitAlphabet[6][6] = " #####  ";

        digitAlphabet[0][7] = "####### ";
        digitAlphabet[1][7] = "#    #  ";
        digitAlphabet[2][7] = "    #   ";
        digitAlphabet[3][7] = "   #    ";
        digitAlphabet[4][7] = "  #     ";
        digitAlphabet[5][7] = "  #     ";
        digitAlphabet[6][7] = "  #     ";

        digitAlphabet[0][8] = " #####  ";
        digitAlphabet[1][8] = "#     # ";
        digitAlphabet[2][8] = "#     # ";
        digitAlphabet[3][8] = " #####  ";
        digitAlphabet[4][8] = "#     # ";
        digitAlphabet[5][8] = "#     # ";
        digitAlphabet[6][8] = " #####  ";

        digitAlphabet[0][9] = " #####  ";
        digitAlphabet[1][9] = "#     # ";
        digitAlphabet[2][9] = "#     # ";
        digitAlphabet[3][9] = " ###### ";
        digitAlphabet[4][9] = "      # ";
        digitAlphabet[5][9] = "#     # ";
        digitAlphabet[6][9] = " #####  ";

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char[] charArray = num.toCharArray();
        ArrayList<Integer> digits = new ArrayList<Integer>();
        Integer max = 0;
        for (int i = 0; i < charArray.length; i++) {
            Integer number = Character.getNumericValue(charArray[i]);
            if (number>max)
                max=number;
            digits.add(number);
        }

        for (int i=0;i<7;i++)
        {
            digitAlphabet[i][max]=digitAlphabet[i][max].replace('#',(char)(max + '0'));
        }

        for (int i=0;i<7;i++)
        {
            String result = "";
            for (int j=0;j<digits.size();j++)
            {
                result+=digitAlphabet[i][digits.get(j)];
            }
            System.out.println(result);
        }

    }
}
