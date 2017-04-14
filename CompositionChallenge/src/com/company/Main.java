package com.company;

public class Main {

    //Create a single rom of a house using composition
    //Think about the things that should be included in the room.
    //Maybe physical parts of the house but furniture as well
    //Add at leas one method to access an object via a getter and\
    //then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    //but to access the object used in composition within the main class
    //like you saw in this video;

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("Eest");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);

        BedRoom bedRoom = new BedRoom("Tims",wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}
