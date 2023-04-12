

import processing.core.*;



public class Scene2A implements Scene{

  private PApplet p;
      private PImage Display2A;

        private int current;
    public Scene2A(PApplet p){
  Display2A = p.loadImage("Display2A.png");

        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
p.image(Display2A,0,0,1400,800);



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
