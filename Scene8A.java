

import processing.core.*;



public class Scene8A implements Scene{

  private PApplet p;
   private PImage dicedTofu;
 private PImage Display8A;


        private int current;
    public Scene8A(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
Display8A = p.loadImage("Display8A.png");



        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.cursor();

  p.image(dicedTofu,75,305,200,200);
       p.image(Display8A,0,0,1400,800);

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
