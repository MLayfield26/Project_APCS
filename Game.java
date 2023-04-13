import processing.core.*;
import java.util.*;

public class Game extends PApplet {

  private ArrayList<Scene> scenes;
  private int current = 0;

  public void settings() {
    // size(width, height);
    // size(1500, 850);
    size(1400, 800);
  }

  public void setup() {
    scenes = new ArrayList<Scene>();
    scenes.add(new OpeningScene(this));
    scenes.add(new PlayScene(this));
    scenes.add(new Scene1A(this));
    scenes.add(new Scene2A(this));
    scenes.add(new Scene3A(this));
    scenes.add(new Scene4A(this));
      scenes.add(new Scene5A(this));
      scenes.add(new Scene6A(this));
    // scenes.add(new EndScene(this));
  }

  public void keyPressed() {
    // if (keyCode == 'A' && c.mouseX > 655 && c.mouseX < 655 + 600 &&
    // c.mouseY > 600 && c.mouseY < 600 + 90 && current = 1){
    // current++;
    // if (current >= scenes.size())
    // current = 0;
    // }
    if (keyCode == ' ') {
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

  public void mousePressed() {
    if (mouseX > 935 - 45 && mouseX < 935 + 45 &&
        mouseY > 520 - 45 && mouseY < 520 + 45) {
      if (getCurrent() == 2) {
        fill(0, 255, 0);
        current = 3;
      //  ellipse(935, 520, 50, 50);
      }
    }

    if(mouseX > 955 && mouseX < 955 + 230 &&
     mouseY > 110 && mouseY < 110 + 500) {
   if (getCurrent() == 3) {

     current = 4;
  //ellipse(995, 415, 40, 40);
   }
  //current++;
  }
    if (mouseX > 985 && mouseX < 985 + 40 &&
        mouseY > 410 && mouseY < 410 + 40) {
      if (getCurrent() == 4) {
        current = 5;
        // ellipse(985, 410, 40, 40);
      }
      // current++;
    }
    if(mouseX > 30 && mouseX < 30 + 275 &&
     mouseY > 275 && mouseY < 275 + 60) {
   if (getCurrent() == 5) {
//rect(30,275,200,60);
   delay(500);
     current = 6;

     //current = 7;

   }
  //current++;
}
if(mouseX > 130 && mouseX < 130 + 115 &&
 mouseY > 365 && mouseY < 365 + 85) {
if (getCurrent() == 6) {
//rect(130, 365, 115, 85);

 current = 7;

 //current = 7;

}
//current++;
}



    scenes.get(current).handleMousePressed();
  }

  public int getCurrent() {
    return current;
  }

  public void draw() {


    scenes.get(current).display();

  }

  public static void main(String[] args) {
    PApplet.main("Game");
  }

  // private ArrayList<Veggie> veggies;
}
