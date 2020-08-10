package com.fossilia;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class DataElement {

    String name;
    String date;
    String description;
    String tags;
    int clicks = 0;
    ArrayList<File> files;
    static int counter;
    int id;

    public DataElement(){}

    @Override
    public String toString() {
        return "Name: " + name +
                "\n-------------------------------------------------"+
                "\nLast updated: " + date +
                "\n-------------------------------------------------"+
                "\nDescription: " + description +
                "\n-------------------------------------------------"+
                "\nTags: " + tags +
                "\n-------------------------------------------------";


    }

    public void openFile(int choice) throws IOException {
        Desktop.getDesktop().open(files.get(choice));

    }

    public void loadFiles(){
        files = new ArrayList<>();
        File folder = new File(name);
        for(File file: Objects.requireNonNull(folder.listFiles())){ //loading files from data element folder
            if(file.isFile()){
                files.add(file);
            }
        }
    }

    public void printFiles(){
        for(int i=1; i<=files.size(); i++){
            System.out.println(i+". "+files.get(i-1).getName());
        }
    }

    /**
     * gets the total of the size of all the files attached to the data element
     * @return the total file size
     */
    public int getTotalFileSize(){
        int total = 0;
        if(files!=null){
            for(File f: files){
                total+= files.size();
            }
        }
        return total;
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

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
}
