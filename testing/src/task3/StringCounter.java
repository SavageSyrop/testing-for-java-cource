package task3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class StringCounter {
    String[] strArr;
    ArrayList<Integer> glasCount = new ArrayList();
    ArrayList<Character> glasnie = new ArrayList<>(Arrays.asList('а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю','е','ё','А', 'У', 'О', 'И', 'Э', 'Ы', 'Я', 'Ю','Е','Ё'));


    StringCounter(String str)
    {
        strArr = str.split(" ");

    }

    public void getGlasCount()
    {
        Integer count = 0;
        for (int i=0;i<strArr.length;i++)
        {
            char[] symbols = strArr[i].toCharArray();
            for (int j=0;j<symbols.length;j++)
            {
                if(glasnie.contains(symbols[j]))
                {
                    count++;
                }
            }
            glasCount.add(count);
            count=0;
        }

        Iterator<Integer> itr = glasCount.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();

    }

    public void printSorted()
    {
        Integer buffer = 0;
        String bufferStr = "";
        boolean sorted = false;
        while(!sorted)
        {
            sorted = true;
            for (int i = 0; i < glasCount.size() - 1; i++) {
                if (glasCount.get(i) > glasCount.get(i + 1)) {
                    sorted = false;
                    buffer = glasCount.get(i);
                    bufferStr = strArr[i];
                    glasCount.set(i, glasCount.get(i + 1));
                    strArr[i] = strArr[i + 1];
                    glasCount.set(i + 1, buffer);
                    strArr[i + 1] = bufferStr;
                }
            }
        }
        for (int i=0;i<strArr.length;i++)
        {
            System.out.print(strArr[i]+" ");
        }
        System.out.println();
    }

    public void uppercaseFirstGlas(String str)
    {
        char[] symbols = str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            if(glasnie.contains(symbols[i]))
            {
                symbols[i]=Character.toUpperCase(symbols[i]);
                break;
            }
        }
        str = String.copyValueOf(symbols);
        System.out.println(str);
    }

}
