

import processing.core.*;



public class Scene12B implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display12B, pan;

        private int current;
    public Scene12B(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display12B = p.loadImage("Display12B.png");

pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display12B,0,0,1400,800);
      p.image(pan,490,255,320,200);
      p.image(dicedTofu,75,305,200,200);



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
