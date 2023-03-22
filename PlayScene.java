import processing.core.*;

public class PlayScene implements Scene {
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
  private PImage backgroundOven;
  private int cooking;
  private int fried;
  private PApplet c;

  public PlayScene(PApplet c) {
    cookedTofu = c.loadImage("cookedTofu.png");
    uncookedTofu = c.loadImage("uncookedTofu.png");
    backgroundOven = c.loadImage("background.png");
    this.c = c;
  }


  public void setup() {
    cooking = 0;
    rectX = 250;
    rectY = 250;
    sizeX = 400;
    sizeY = 400;
    posX = 375;
    posY = 275;
    rectWidth = 100;
    rectHeight = 100;
  }

  public void display() {
    c.background(64);
    c.imageMode(c.CENTER);

    c.fill(255, 0, 0);

    // p.imageMode(p.CENTER);
c.image(backgroundOven,300,300);
  c.rect(300, 200, 250, 150);
    if (c.mouseX > 300 && c.mouseX < 300 + 200 && c.mouseY > 200 && c.mouseY < 200 + 125) {
    //  c.delay(2500);
      cooking = 1;
    }

    if (cooking == 1 && fried == 0) {
      c.image(uncookedTofu, 375, 275, sizeX, sizeY);
      cooking = 0;
      fried = 1;
      sizeX = 1;
      sizeY = 1;
    } else if (cooking == 0 && fried == 0) {
      c.image(uncookedTofu, c.mouseX, c.mouseY, 400, 400);
    } else if (cooking == 0 && fried == 1) {
      c.image(uncookedTofu, c.mouseX, c.mouseY, 1, 1);
      c.image(cookedTofu, c.mouseX, c.mouseY, 400, 400);
    } else if (cooking == 1 && fried == 1) {
      c.image(cookedTofu, c.mouseX, c.mouseY, 400, 400);
    }
  }

  public void handleKeyPressed() {

  }
  public static void main(String[] args) {
  PApplet.main("Game");
}

}
