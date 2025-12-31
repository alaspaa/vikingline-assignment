package com.assignment.vikingline.bubblesort;

import com.assignment.vikingline.models.NamedObject;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static <T extends NamedObject> List<T> bubbleSortByName(List<T> list) {
        boolean sorted = true;
        for (int currentIndex = 0; currentIndex < list.size() - 1; currentIndex++) {
            int nextIndex = currentIndex + 1;

            int comparisonResult = list.get(currentIndex).getObjectName()
                    .compareTo(
                            list.get(nextIndex).getObjectName()
                    );

            if (comparisonResult > 0) {
                Collections.swap(list, currentIndex, nextIndex);

                sorted = false;
            }
        }

        if (!sorted) {
            bubbleSortByName(list);
        }

        return list;
    }
}
