

import processing.core.*;



public class Scene23A implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display23A, pan;
   private PImage D3Ba;
        private int current;
    public Scene23A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display23A = p.loadImage("Display23A.png");
D3Ba = p.loadImage("D3Ba.png");
pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display23A,0,0,1400,800);
      p.image(pan,490,255,320,200);
        p.imageMode(p.CENTER);
      p.image(dicedTofu,p.mouseX,p.mouseY,200,200);
        p.imageMode(p.CORNER);
    //  p.image(D3Ba,p.mouseX,p.mouseY,40,65);



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
