

import processing.core.*;
import processing.sound.*;


public class Scene3A implements Scene{
 SoundFile fridgeRunning;
      private PApplet p;
      private PImage Display3A;
      private PImage uncookedTofu;

        private int current;
    public Scene3A(PApplet p){
Display3A = p.loadImage("Display3A.png");

 uncookedTofu = p.loadImage("uncookedTofu.png");
        this.p = p;
        this.current = current;

    }

    public void setup() {
fridgeRunning = new SoundFile(p,"fridge.mp3");
  fridgeRunning.play();
  fridgeRunning.amp(1);
    }
    public void display(){

p.image(Display3A,0,0,1400,800);
p.image(uncookedTofu, 940, 365, 100, 100);

    }
    public int getCurrent() {
          return ((Game)p).getCurrent();
      }

    public void handleKeyPressed(){

    }
    public void handleMousePressed() {

    }
    public static void main(String[] args) {
    PApplet.main("Game");
    }

}
