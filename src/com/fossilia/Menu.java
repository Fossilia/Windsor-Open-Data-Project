package com.fossilia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	static ArrayList<Group> groups = new ArrayList<>();
	public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

    	//Creating groups
	    Group education = new Group("Education");
	    groups.add(education);
		Group law = new Group("Law");
		groups.add(law);
		Group agriculture = new Group("Agriculture");
		groups.add(agriculture);
		Group publicFacilities = new Group("Public Facilities");
		groups.add(publicFacilities);

		//creating elements
	    DataElement schools = new Schools();
	    schools.loadFiles();
		DataElement universities = new Universities();
		DataElement colleges = new Colleges();
		DataElement libraries = new Libraries();

		//adding elements to groups
	    education.addElement(schools);
		education.addElement(universities);
		education.addElement(colleges);

		publicFacilities.addElement(libraries);

		displayGroupMenu(); //start the menu
    }

	/**
	 * Displays the group menu then gets user input for groups, data elements, and files to open
	 * @throws IOException
	 */
	public static void displayGroupMenu() throws IOException {
		System.out.println("Welcome to the Windsor Open Data Project!");
		System.out.println("------------------------------------------");
		System.out.println("Please choose what data group you want to view (type in a groups number):");
		for(int i=1; i<=groups.size(); i++){ //print all groups
			System.out.println(i+". "+groups.get(i-1).getName());
		}

		int choice = getIntInput(1, groups.size()); //get input for for group
		Group chosenGroup = groups.get(choice-1);
		chosenGroup.display();

		choice = getIntInput(1, chosenGroup.getElements().size()); //gets input for element
		DataElement chosenDataElement = chosenGroup.getElement(choice-1);
		System.out.println(chosenDataElement);

		System.out.println("\nPlease choose what file you want to open (type in a files number):");
		chosenDataElement.printFiles(); //get input for file the user wants to open
		choice = getIntInput(1, chosenDataElement.getFiles().size());
		chosenDataElement.openFile(choice-1); //open file
	}

	/**gets an integer from the user between min and max (inclusive), checks for exceptions*/
	public static int getIntInput(int min, int max){
		int input = 0;
		boolean done = false;

		while(!done){
			try{
				input = sc.nextInt(); //gets input, may have an exception if user enters a string
				if(input>=min && input<=max && input!=0){ //checks if its in the range
					sc.nextLine();
					done = true;
				}
				else if(input == 0){
					System.exit(0);
				}
				else{
					System.out.println("Type in a valid number between "+min+" and "+max);
				}
			}
			catch(InputMismatchException e){ //catches case user types in a string
				sc.nextLine();
				System.out.println("Please type in a valid number.");
			}
		}
		return input;
	}

}
