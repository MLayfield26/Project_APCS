

import processing.core.*;



public class Scene14A implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display14A, pan;

        private int current;
    public Scene14A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display14A = p.loadImage("Display14A.png");

pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display14A,0,0,1400,800);
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
