

import processing.core.*;



public class endScene implements Scene{

   private PImage dicedTofu;
  private PApplet p;
   private PImage endScene, pan;
   private PImage D3Ba;
        private int current;
    public endScene(PApplet p){
      dicedTofu = p.loadImage("dicedTofu.png");
endScene = p.loadImage("endScene.png");
D3Ba = p.loadImage("D3Ba.png");
pan = p.loadImage("pan.png");
        this.p = p;
             this.current = current;

    }

    public void setup() {

    }
    public void display(){
        p.imageMode(p.CORNER);

      p.image(endScene,0,0,1400,800);

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
