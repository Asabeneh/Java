package com.company;

/**
 * Created by Asab on 4/11/2017.
 */
public class Car {

    private int dooors ;
    private int wheels;

    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }
        else{
            this.model = "Unknown";
        }


    }
    public String getModel(){
        return this.model;
    }



}
