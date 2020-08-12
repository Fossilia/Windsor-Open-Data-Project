package com.fossilia.Sorter;

import com.fossilia.DataElement;

import java.util.Comparator;

public class ElementSortByName  implements Comparator<DataElement> {
    @Override
    public int compare(DataElement o1, DataElement o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
