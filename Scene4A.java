

import processing.core.*;



public class Scene4A implements Scene{

  private PApplet p;
     private PImage Display4A;
       private PImage cookedTofu;
         private int cooking;
  private PImage uncookedTofu;
        private int current;
    public Scene4A(PApplet p){
Display4A = p.loadImage("Display4A.png");
 cookedTofu = p.loadImage("cookedTofu.png");
 uncookedTofu = p.loadImage("uncookedTofu.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {
cooking = 0;
    }
    public void display(){
        p.imageMode(p.CORNER);
       p.image(Display4A,0,0,1400,800);

if(cooking == 0){
  p.imageMode(p.CENTER);
  p.image(uncookedTofu, p.mouseX, p.mouseY, 100, 100);
}
else if(cooking == 1){
  p.imageMode(p.CENTER);
    p.image(cookedTofu, p.mouseX, p.mouseY, 100, 100);
}

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
