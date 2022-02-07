package task5;

import java.util.ArrayList;

public class Safe {
    private ArrayList<Item> itemsInside = null;
    private Integer capacity;
    private Integer bestValue;

    public Safe(Integer capacity)
    {
        this.capacity = capacity;
    }

    private Integer calcSizeIns(ArrayList<Item> items)
    {
        Integer sizeIns = 0;

        for(Item i: items)
        {
            sizeIns += i.getSize();
        }

        return sizeIns;
    }


    private Integer calcValue(ArrayList<Item> items)
    {
        Integer sumValue = 0;

        for (Item i: items)
        {
            sumValue += i.getValue();
        }

        return sumValue;
    }


    private void checkSetItems(ArrayList<Item> items)
    {
        if (bestValue == null)
        {
            if (calcSizeIns(items) <= capacity)
            {
                itemsInside = items;
                bestValue = calcValue(items);
            }
        }
        else
        {
            if(calcSizeIns(items) <= capacity && calcValue(items) > bestValue)
            {
                itemsInside = items;
                bestValue = calcValue(items);
            }
        }
    }

    public void makeAllSets(ArrayList<Item> items)
    {
        if (items.size() > 0)
            checkSetItems(items);

        for (int i = 0; i < items.size(); i++)
        {
            ArrayList<Item> newSet = new ArrayList<Item>(items);

            newSet.remove(i);

            makeAllSets(newSet);
        }

    }

    public ArrayList<Item> getBestSet()
    {
        return itemsInside;
    }

}
