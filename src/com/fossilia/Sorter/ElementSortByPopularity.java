package com.fossilia.Sorter;

import com.fossilia.DataElement;

import java.util.Comparator;

public class ElementSortByPopularity  implements Comparator<DataElement> {
        @Override
        public int compare(DataElement o1, DataElement o2) {
            return o2.getClicks() - o1.getClicks();
        }

}
