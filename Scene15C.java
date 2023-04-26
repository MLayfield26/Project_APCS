

import processing.core.*;



public class Scene15C implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display15C, pan;

        private int current;
    public Scene15C(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display15C = p.loadImage("Display15C.png");

pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display15C,0,0,1400,800);
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
