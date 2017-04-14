package com.company;

/**
 * Created by Asab on 4/14/2017.
 */
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResoulution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResoulution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResoulution = nativeResoulution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + ","+ y );
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResoulution() {
        return nativeResoulution;
    }
}
