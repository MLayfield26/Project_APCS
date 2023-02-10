

import processing.core.*;



public class PlayScene implements Scene{
    public PlayScene(PApplet c){
     cookedTofu = c.loadImage("cookedTofu.png");
     uncookedTofu = c.loadImage("uncookedTofu.png");
        this.c = c;

    }

    public void setup() {

    boolean fried = false;
    rectX = 50;
    rectY = 100;
    rectWidth = 200;
    rectHeight = 100;

    }
    public void display(){
      System.out.println(fried);
      c.background(64);
        c.imageMode(c.CENTER);
    //add knife image
    //Swap between two things
    //plate
  c.rect(rectX, rectY, rectWidth, rectHeight);
      if (c.mouseX > rectX && c.mouseX < rectX + rectWidth && c.mouseY > rectY && c.mouseY < rectY + rectHeight) {
      fried = true;
    }

  if(fried){
      c.image(cookedTofu, c.mouseX, c.mouseY);
    c.image(uncookedTofu, c.mouseX, c.mouseY, 1, 1);
}

  if(!fried){

      c.image(uncookedTofu, c.mouseX, c.mouseY);

  }
      //  fill(255, 0, 0);
    }
  public void handleKeyPressed(){

    }

    private float rectX;
    private float rectY;
    private float rectWidth;
    private float rectHeight;
    private PImage uncookedTofu;
    private PImage cookedTofu;
    private boolean fried;
    private PApplet c;
}
