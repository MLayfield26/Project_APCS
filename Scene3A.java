

import processing.core.*;



public class Scene3A implements Scene{

  private PApplet p;
      private PImage Display3A;

        private int current;
    public Scene3A(PApplet p){
Display3A = p.loadImage("Display3A.png");

        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
p.image(Display3A,0,0,1400,800);



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
