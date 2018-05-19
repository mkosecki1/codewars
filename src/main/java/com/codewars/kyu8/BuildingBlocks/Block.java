package com.codewars.kyu8.BuildingBlocks;

public class Block {
    private int width;
    private int lenght;
    private int height;

    public Block(int[] array) {
        width = array[0];
        lenght = array[1];
        height = array[2];
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return lenght;
    }

    public int getHeight(){
        return height;
    }

    public int getVolume(){
        return width * lenght * height;
    }

    public int getSurfaceArea(){
        return 2*(width*lenght + lenght*height + width*height);
    }
}
