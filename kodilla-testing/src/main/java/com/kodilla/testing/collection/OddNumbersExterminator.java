package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator
{
    public ArrayList<Integer> exterminate(ArrayList<Integer> list)
    {
        ArrayList<Integer> temp = new ArrayList<>();

        for (Integer i : list)
        {
            if(i % 2 == 0)
            {
                temp.add(i);
            }
        }
        return temp;
    }
}
