

import processing.core.*;



public class PlayScene implements Scene{
    public PlayScene(PApplet p){
     cookedTofu = p.loadImage("cookedTofu.png");
     uncookedTofu = p.loadImage("uncookedTofu.png");
        this.p = p;

    }

    public void setup() {
      size(300, 300);
      p.fried = false;
    p.rectX = 50;
    p.rectY = 100;
    p.rectWidth = 200;
    p.rectHeight = 100;

    }
    public void display(){
      p.background(64);
        p.imageMode(p.CENTER);

      if (mouseX > rectX && mouseX < rectX + rectWidth && mouseY > rectY && mouseY < rectY + rectHeight) {
      p.fried = true;
    }

  if(!fried){
    p.image(uncookedTofu, mouseX, mouseY);

  }
  else(fried){
    p.image(cookedTofu, mouseX, mouseY);
  }
      //  fill(255, 0, 0);
    }
/*
    public void handleKeyPressed(){

    }
    */
    private float rectX;
    private float rectY;
    private float rectWidth;
    private float rectHeight;
      private PImage uncookedTofu;
        private PImage cookedTofu;
private boolean fried;
    private PApplet p;
}
