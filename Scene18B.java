

import processing.core.*;



public class Scene18B implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage Display18B, pan;
 private PImage D3Bb;
        private int current;
    public Scene18B(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display18B = p.loadImage("Display18B.png");
D3Bb = p.loadImage("D3Bb.png");
pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(Display18B,0,0,1400,800);
      p.image(pan,490,255,320,200);
      p.image(dicedTofu,75,305,200,200);
    //   p.image(D3Bb,p.mouseX,p.mouseY,40,65);



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
