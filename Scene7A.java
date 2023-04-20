

import processing.core.*;



public class Scene7A implements Scene{

  private PApplet p;
 private PImage dicedTofu;

    private PImage Display7A;

        private int current;
    public Scene7A(PApplet p){
dicedTofu = p.loadImage("dicedTofu.png");
Display7A = p.loadImage("Display7A.png");


        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.cursor();

        p.image(Display7A,0,0,1400,800);
        p.image(dicedTofu,75,305,200,200);

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
