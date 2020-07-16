package com.fossilia;

import java.util.ArrayList;

public class Group {
    String name;
    ArrayList<DataElement> elements;

    public Group(){}

    public Group(String name){
        elements = new ArrayList<>();
        this.name = name;
    }

    public void addElement(DataElement element){
        elements.add(element);
    }

    public String getName() {
        return name;
    }

    public ArrayList<DataElement> getElements() {
        return elements;
    }
}
