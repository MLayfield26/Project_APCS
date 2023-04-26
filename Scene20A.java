

import processing.core.*;



public class Scene20A implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display20A, pan;
   private PImage D3Ba;
        private int current;
    public Scene20A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display20A = p.loadImage("Display20A.png");
D3Ba = p.loadImage("D3Ba.png");
pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display20A,0,0,1400,800);
      p.image(pan,490,255,320,200);
      p.image(dicedTofu,75,305,200,200);
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
