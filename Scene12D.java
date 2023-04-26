

import processing.core.*;



public class Scene12D implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display12D, pan;

        private int current;
    public Scene12D(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display12D = p.loadImage("Display12D.png");

pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display12D,0,0,1400,800);
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
