package com.example.tourguideapp;

public class PlaceList {

    //  Variable to store the value of Name of place and Location of the place
    private final String nNameOfPlace;
    private final double longitude;
    private final double latitude;


    /**
     * Constructor to create the object of PlaceList class
     * @param name          Name of the place to be  stored in nNameOfPlace variable
     * @param longitude     Longitude of the place to be stored in longitude
     * @param latitude      Latitude of the place to be stored in latitude
     */
     public PlaceList(String name, double longitude, double latitude){
        this.nNameOfPlace = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     *  Method to get the value of nNameOfPlace variable
     * @return  Returns the name of the place
     */
    public String getNameOfLocation(){
         return this.nNameOfPlace;
    }

    /**
     * Method to get the value of longitude variable
     * @return  Returns the longitude of the place
     */
    public double getLongitudeOfPlace(){
         return longitude;
    }

    /**
     * Method to get value of latitude variable
     * @return  Returns the latitude of the place
     */
    public double getLatitudeOfPlace(){
        return latitude;
    }
}
