import processing.core.*;
//import processing.sound.*;
public class PlayScene implements Scene {
  private int rectX;
  private int rectY;
  private int sizeX;
  private int sizeY;
  private int posX;
  private int posY;
  private int rectWidth;
  private PImage background;
  private PImage textBox;
  private PImage PressSpace;
  private int rectHeight;
  private PApplet c;

  public PlayScene(PApplet c) {

    background = c.loadImage("background.png");
    textBox = c.loadImage("textBox.png");
    PressSpace = c.loadImage("PressSpace.png");
    this.c = c;
  }


  public void setup() {
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
    c.imageMode(c.CORNER);


    c.fill(255, 0, 0);
    c.image(background, 0,0,1400,800);
    c.image(textBox,0,0);
    c.rect(655, 600, 340, 90);
    if (c.mouseX > 655 && c.mouseX < 655 + 600 &&
     c.mouseY > 600 && c.mouseY < 600 + 90) {
//current++;

        c.fill(0, 255, 0);
        c.rect(655, 600, 340, 90);
      //  c.image(textBox,0,0);
        c.image(PressSpace,0,0);
    }

}
public void handleKeyPressed() {

}
public void handleMousePressed() {

}
public int getCurrent() {
  return ((Game)c).getCurrent();
}
public static void main(String[] args) {
  PApplet.main("Game");
}

}
