import frames.NewFrame;

import javax.swing.*;
import java.awt.*;


public class Start{

    private String title;
    private PropertiesReturner propertyReturner;
    private int sizeX;
    private int sizeY;
    private Dimension size;

    public Start(){
        propertyReturner = new PropertiesReturner();
        title = propertyReturner.getTitleReturner();
        sizeX = propertyReturner.getSizeXReturner();
        sizeY = propertyReturner.getSizeYReturner();
        size = new Dimension(sizeX, sizeY);
    }

    public String getTitle(){
        return this.title;
    }

    public Dimension getDimension(){
        return this.size;
    }


    public static void main(String[] args){


        System.out.println("*****************************");
        System.out.println("START OF APPLICATION");

        Start start = new Start();
        NewFrame newFrame = new NewFrame(start.getTitle(), start.getDimension());
    }



}
