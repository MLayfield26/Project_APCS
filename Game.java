


import processing.core.*;
import java.util.*;


public class Game extends PApplet{

  private ArrayList<Scene> scenes;
  private int current = 0;
    public void settings(){
        size(600, 600);
        //size(800,800);
    }

    public void setup(){


      scenes = new ArrayList<Scene>();
     scenes.add(new OpeningScene(this));
      scenes.add(new PlayScene(this));
    //  scenes.add(new EndScene(this));
    }


    public void keyPressed(){
      if (keyCode == ' '){
              current++;
              if (current >= scenes.size())
                  current = 0;
          }

          scenes.get(current).handleKeyPressed();
    }

    public void draw(){
       scenes.get(current).display();
    }



    public static void main(String[] args){
        PApplet.main("Game");
    }

    //private ArrayList<Veggie> veggies;
}
