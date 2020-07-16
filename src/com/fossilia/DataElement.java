package com.fossilia;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DataElement {

    String name;
    String date;
    String description;
    String tags;
    ArrayList<File> files;
    static int counter;
    int id;

    public DataElement(){
        files = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "Name: " + name +
                "\n\nLast updated: " + date +
                "\n\nDescription: " + description +
                "\n\nTags: " + tags +
                "\n\nFiles: " + files +
                "\n\n Please type in the number ";

    }

    public void openFile(int choice) throws IOException {
        Desktop.getDesktop().open(files.get(choice));

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
