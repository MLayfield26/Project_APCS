

import processing.core.*;



public class Scene10A implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display10A, pan;

        private int current;
    public Scene10A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display10A = p.loadImage("Display10A.png");

pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display10A,0,0,1400,800);
      p.image(pan,490,255,320,200);
      p.image(dicedTofu,75,305,200,200);
  //    p.rect(815,535,150,75);


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
