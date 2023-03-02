

import processing.core.*;



public class PlayScene implements Scene{
  private int rectX;
  private int rectY;
  private int sizeX;
  private int sizeY;
  private int posX;
  private int posY;
  private int rectWidth;
  private int rectHeight;
  private PImage uncookedTofu;
  private PImage cookedTofu;
  private boolean cooking;
    private boolean fried;
  private PApplet c;
    public PlayScene(PApplet c){
     cookedTofu = c.loadImage("cookedTofu.png");
     uncookedTofu = c.loadImage("uncookedTofu.png");
        this.c = c;

    }

    public void setup() {

    boolean cooking = false;
    rectX =250;
    rectY = 250;
    sizeX =100;
    sizeY = 100;
    posX =375;
    posY = 275;
    rectWidth = 100;
    rectHeight = 100;

    }
    public void display(){

    //DO NOT PUT DISPLAY System.out.println(cooking);
    c.background(64);
        c.imageMode(c.CENTER);

    //add knife image
    //Swap between two things
    //plate
    c.fill(255, 0, 0);
    //x,y


  c.rect(300,200, 250,150);
    //  c.fill(0, 55, 0);
  //  c.rect(300,300, 30, 30);
  //c.mouseX > rectX && c.mouseX < rectX + rectWidth && c.mouseY > rectY && c.mouseY < rectY + rectHeight
      if (c.mouseX > 300 && c.mouseX < 300+ 200 && c.mouseY > 200 && c.mouseY < 200 + 125)
       {
         c.delay(2500);
     cooking = true;
    }


    if(cooking && !fried){
//c.delay(2000);
      c.image(uncookedTofu, 375,275, sizeX, sizeY);
  //    c.image(uncookedTofu, c.mouseX, c.mouseY, 1, 1);
  //c.delay(2000);

cooking = false;
fried = true;
sizeX = 1;
sizeY =1;
//    c.image(cookedTofu, 375, 375,100,100);
  }

  if(!cooking && !fried){

      c.image(uncookedTofu, c.mouseX, c.mouseY,100,100);

  }
  if(!cooking && fried){

    c.image(uncookedTofu, c.mouseX, c.mouseY,1,1);

   c.image(cookedTofu, c.mouseX, c.mouseY,100,100);
  }
  if(cooking && fried){

  //  c.image(uncookedTofu, c.mouseX, c.mouseY,1,1);

   c.image(cookedTofu, c.mouseX, c.mouseY,100,100);
  }
      //  fill(255, 0, 0);
    }
  public void handleKeyPressed(){

    }


}
