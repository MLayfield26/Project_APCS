

import processing.core.*;



public class Scene6A implements Scene{

  private PApplet p;
 private PImage Display6A;
  private PImage knifePointer;

        private int current;
    public Scene6A(PApplet p){
Display6A = p.loadImage("Display6A.png");
knifePointer = p.loadImage("knife.png");

        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
   p.image(Display6A,0,0,1400,800);
p.cursor(knifePointer);


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
