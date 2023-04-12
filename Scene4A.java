

import processing.core.*;



public class Scene4A implements Scene{

  private PApplet p;
     private PImage Display4A;

        private int current;
    public Scene4A(PApplet p){
Display4A = p.loadImage("Display4A.png");

        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
       p.image(Display4A,0,0,1400,800);



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
