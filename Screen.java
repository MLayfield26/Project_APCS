


import processing.core.*;
import java.util.*;


public class Screen extends PApplet{
    public void settings(){
        size(600, 600);
    }

    public void setup(){
        veggies = new ArrayList<Veggie>();
        createVeggie();
    }

    public void createVeggie(){
        PVector position = new PVector(width/2, height/2);

        int size = 5;
        int greenish = color(0, 100, 100);

        Veggie veggie = new Veggie(this,position,size,greenish);
        //the veggies are armying
        veggies.add(veggie);
    }
    public void keyPressed(){
        for (int i=0; i<10; i++)
            createVeggie();
    }

    public void draw(){
        text("what?", 200, 200);
        background(0);

        for (Veggie veggie : veggies)
            veggie.display();
    }



    public static void main(String[] args){
        PApplet.main("Screen");
    }

    private ArrayList<Veggie> veggies;
}
