

import processing.core.*;



public class Scene9A implements Scene{

  private PApplet p;
   private PImage dicedTofu;
 private PImage Display9A;
 private PImage pan;


        private int current;
    public Scene9A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display9A = p.loadImage("Display9A.png");
pan = p.loadImage("pan.png");



        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){

p.noCursor();

       p.image(Display9A,0,0,1400,800);
         p.image(dicedTofu,75,305,200,200);
          p.imageMode(p.CENTER);
          p.noCursor();
          p.image(pan,p.mouseX,p.mouseY,320,200);
   p.imageMode(p.CORNER);


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
