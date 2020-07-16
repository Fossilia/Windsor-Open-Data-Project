package com.fossilia;

public class Menu {

    public static void main(String[] args) {
	    Group education = new Group("Education");
	    DataElement schools = new Schools();
	    education.addElement(schools);


    }
}
