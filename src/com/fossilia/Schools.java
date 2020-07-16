package com.fossilia;

import java.io.File;

public class Schools extends DataElement {

    public Schools() {
        name = "Schools";
        date = "05/18/2020";
        description = "\nDataset Description:\n" +
                "These point files represent the location of various schools within the boundary of the City of Windsor, from four school boards, \nfor both elementary and secondary schools." +
                "Data Accuracy Comments:\n" +
                "The City of Windsor is not responsible for this data but attempts to validate this information yearly or more frequently as required. \nThe coordinates are for the approximate location of the various schools." +
                "Attributes:\n" +
                "The attributes include the Name, Address, School Board, URL and Northing and Easting or Latitude/Longitude depending on file format.\n" +
                "Coordinate System:\n" +
                "SHP formatted data are projected in UTM, NAD83, Zone 17 Metric and LL84. CSV formatted data is projected in LL84.\n DWG file is projected in UTM, NAD83, Zone 17 Metric. KMZ files have automatic transformation when applied.";
        tags = "Education, Building, kids";
    }

    public void printSchoolBoards(){

    }
}
