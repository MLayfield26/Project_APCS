

import processing.core.*;



public class Scene5A implements Scene{

  private PApplet p;
   private PImage Display5A;

        private int current;
    public Scene5A(PApplet p){
    
Display5A = p.loadImage("Display5A.png");

        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);
      p.image(Display5A,0,0);



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
