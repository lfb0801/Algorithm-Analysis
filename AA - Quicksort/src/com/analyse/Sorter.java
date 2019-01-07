package com.analyse;

import java.util.List;

public class Sorter {
    public static Comparable[] quickSort(Comparable[] elements, int left, int right)
    {
        int i = left, j = right;
        Comparable pivot = elements[left + (right - left) / 2];

        while (i <= j)
        {
            while (elements[i].compareTo(pivot) < 0)
            {
                i++;
            }

            while (elements[j].compareTo(pivot) > 0)
            {
                j--;
            }

            if (i <= j)
            {
                // Swap
                Comparable tmp = elements[i];
                elements[i] = elements[j];
                elements[j] = tmp;

                i++;
                j--;
            }
        }

        // Recursive calls
        if (left < j)
        {
            quickSort(elements, left, j);
        }

        if (i < right)
        {
            quickSort(elements, i, right);
        }

        return elements;
    }
}
