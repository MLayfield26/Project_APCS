


import processing.core.*;
import java.util.*;


public class Game extends PApplet{

  private ArrayList<Scene> scenes;
  private int current = 0;
    public void settings(){
  //
        //size(width, height);
  //      size(1500,850);
    size(1400,800);
    }

    public void setup(){


      scenes = new ArrayList<Scene>();
     scenes.add(new OpeningScene(this));
      scenes.add(new PlayScene(this));
  scenes.add(new Scene1A(this));
  scenes.add(new Scene2A(this));
  scenes.add(new Scene3A(this));
  scenes.add(new Scene4A(this));
    //  scenes.add(new EndScene(this));
    }


    public void keyPressed(){
    //  if (keyCode == 'A' && c.mouseX > 655 && c.mouseX < 655 + 600 &&
    //  c.mouseY > 600 && c.mouseY < 600 + 90 && current = 1){
    //          current++;
    //          if (current >= scenes.size())
    //              current = 0;
  // }
      if (keyCode == ' '){
              current++;
              if (current >= scenes.size())
                  current = 0;
          }


          if (getCurrent() == 2 && keyCode == 'E') {

                  current++;
                  if (current >= scenes.size())
                      current = 0;


}
       scenes.get(current).handleKeyPressed();
}

public void mousePressed(){
  if (mouseX > 935 - 45 && mouseX < 935 + 45 &&
mouseY > 520 - 45 && mouseY < 520 + 45) {
if (getCurrent() == 2) {
 fill(0, 255, 0);
 current = 3;
 //ellipse(935, 520, 50, 50);
}
}

if (mouseX > 995 && mouseX < 995 + 37 &&
    mouseY > 415 && mouseY < 415 + 37) {
  if (getCurrent() == 3) {

    current = 4;
//ellipse(995, 415, 40, 40);
  }
//current++;
}


scenes.get(current).handleMousePressed();

}

  public int getCurrent() {
    return current;
  }
    public void draw(){

         scenes.get(current).display();



    }



    public static void main(String[] args) {
    PApplet.main("Game");
  }


    //private ArrayList<Veggie> veggies;
}
