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

    public void display(){
        System.out.println("You picked the "+name+" group, these are the data elements in the group (type in a data elements number):");
        for(int i=1; i<=elements.size(); i++){
            System.out.println(i+". "+elements.get(i-1).getName());
        }

    }
}
