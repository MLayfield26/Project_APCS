

import processing.core.*;



public class Scene11A implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display11A, pan;

        private int current;
    public Scene11A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display11A = p.loadImage("Display11A.png");

pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);
//p.rect(600,500,50,80);
      p.image(Display11A,0,0,1400,800);
      p.image(pan,490,255,320,200);
      p.image(dicedTofu,75,305,200,200);

    //  p.rect(825,515,35,65);

    //  p.rect(865,515,35,65);

    //  p.rect(903,515,25,65);
  //    p.rect(932,515,25,65);


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
