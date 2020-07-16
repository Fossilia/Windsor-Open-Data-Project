package com.fossilia;

import java.io.File;
import java.util.ArrayList;

public class DataElement {

    String name;
    String date;
    String description;
    String tags;
    ArrayList<File> files;
    static int counter;
    int id;

    public void display(){

    }

    public void openFile(int choice){

    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public int getId() {
        return id;
    }
}
