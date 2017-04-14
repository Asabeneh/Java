package com.company;

/**
 * Created by Asab on 4/14/2017.
 */
public class Bed {
    private String style;
    private int pillow;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillow, int height, int sheets, int quilt) {
        this.style = style;
        this.pillow = pillow;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("Bed -->Making");
    }

    public String getStyle() {
        return style;
    }

    public int getPillow() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
