//import processing.sound.SoundFile;
import processing.sound.*;
import processing.core.*;
import java.util.*;
//import java.applet.*;

public class Game extends PApplet {

 SoundFile background1;
 SoundFile click;
 SoundFile knife;
 SoundFile fridgeRunning;
  PImage knifePointer,dicedTofu;
 PImage imgZ1,imgZ2,imgZ3,imgZ4,imgZ5,
 imgZ6,imgZ7,imgZ8,imgZ9,imgZ10;
  private ArrayList<Scene> scenes;
  private int current = 0;
    private int slideshow;
  public void settings() {
    // size(width, height);
    // size(1500, 850);
    size(1400, 800);
  //  private PImage buttonPressed;
  }

  public void setup() {
    knifePointer = loadImage("knife.png");
    dicedTofu = loadImage("dicedTofu.png");
    imgZ1 = loadImage("Z1.png");
    imgZ2 = loadImage("Z2.png");
    imgZ3 = loadImage("Z3.png");
    imgZ4 = loadImage("Z4.png");
    imgZ5 = loadImage("Z5.png");
    imgZ6 = loadImage("Z6.png");
    imgZ7 = loadImage("Z7.png");
    imgZ8 = loadImage("Z8.png");
    imgZ9 = loadImage("Z9.png");
    imgZ10 = loadImage("Z10.png");
 background1 = new SoundFile(this, "background1.mp3");
 knife = new SoundFile(this, "knife.mp3");
//background1.amp(1/2);
//click.amp(1/2);
fridgeRunning = new SoundFile(this,"fridge.wav");
   click = new SoundFile(this, "click.wav");
   background1.loop();
//  buttonPressed = loadImage("ButtonPressed.png");
    scenes = new ArrayList<Scene>();
    scenes.add(new OpeningScene(this));
    scenes.add(new PlayScene(this));
    scenes.add(new Scene1A(this));
    scenes.add(new Scene2A(this));
    scenes.add(new Scene3A(this));
    scenes.add(new Scene4A(this));
    scenes.add(new Scene5A(this));
    scenes.add(new Scene6A(this));
    scenes.add(new Scene7A(this));
    scenes.add(new Scene8A(this));
    scenes.add(new Scene9A(this));
    // scenes.add(new EndScene(this));
  }

  public void keyPressed() {
    // if (keyCode == 'A' && c.mouseX > 655 && c.mouseX < 655 + 600 &&
    // c.mouseY > 600 && c.mouseY < 600 + 90 && current = 1){
    // current++;
    // if (current >= scenes.size())
    // current = 0;
    // }
    if (keyCode == ' ') {
      click.play();
      current++;
      if (current >= scenes.size())
        current = 0;
        //click.play();
    }

    if (getCurrent() == 2 && keyCode == 'E') {
      current++;
  click.play();
      if (current >= scenes.size())
        current = 0;
    }
    scenes.get(current).handleKeyPressed();
  }

  public void mousePressed() {
    if (mouseX > 935 - 45 && mouseX < 935 + 45 &&
        mouseY > 520 - 45 && mouseY < 520 + 45) {
      if (getCurrent() == 2) {
        click.play();
        fill(0, 255, 0);
        current = 3;
      //  ellipse(935, 520, 50, 50);
      }
    }

    if(mouseX > 955 && mouseX < 955 + 230 &&
     mouseY > 110 && mouseY < 110 + 500) {
   if (getCurrent() == 3) {

     current = 4;
  //ellipse(995, 415, 40, 40);
   }
  //current++;
  }
    if (mouseX > 985 && mouseX < 985 + 40 &&
        mouseY > 410 && mouseY < 410 + 40) {
      if (getCurrent() == 4) {
        current = 5;
        // ellipse(985, 410, 40, 40);
      }
      // current++;
    }
    if(mouseX > 30 && mouseX < 30 + 275 &&
     mouseY > 275 && mouseY < 275 + 60) {
   if (getCurrent() == 5) {
//rect(30,275,200,60);
   delay(500);
     current = 6;

     //current = 7;

   }
  //current++;
}
if(mouseX > 130 && mouseX < 130 + 115 &&
mouseY > 365 && mouseY < 365 + 85) {
//if (getCurrent() == 6) {
//rect(130, 365, 115, 85);

 //current = 7;

 //current = 7;

//}
//current++;
}

if(mouseX > 285 && mouseX < 285 + 55 &&
mouseY > 360 && mouseY < 360 + 75) {
if (getCurrent() == 6) {


 current = 7;

}

}
if(mouseX > 545 && mouseX < 545 + 355 &&
mouseY > 465 && mouseY < 465 + 70) {
if (getCurrent() == 0) {
click.play();
current = 1;
//rect(545 ,465,355,70);

}

}

if(getCurrent() == 7){

if(mouseX > 110 && mouseX < 110 + 120 &&
mouseY > 365 && mouseY < 365 + 70) {

slideshow+=1;
}

}
if(slideshow == 10){
  current = 8;
}

if(getCurrent() == 8){

if(mouseX > 1010 && mouseX < 1010 + 250 &&
mouseY > 495 && mouseY < 495 + 300) {
  slideshow = 0;
//rect(1010,495,250,300);
current = 9;
}
}
if(getCurrent() == 9){
if(mouseX > 1040 && mouseX < 1040 + 215 &&
mouseY > 665 && mouseY < 665 + 100) {
  //rect(1040,665,215,100);

current = 10;
}
}
    scenes.get(current).handleMousePressed();
  }

  public int getCurrent() {
    return current;
  }
public void display(){

  if(getCurrent() == 4){
    //fridgeRunning.amp(1);
    fridgeRunning.play();
  }
else if(getCurrent() == 5){

fridgeRunning.stop();
}
}
  public void draw() {




    scenes.get(current).display();
if(getCurrent() == 7){
    if(slideshow == 1){
      knife.play();
      image(imgZ1,0,0,1400,800);
    }
    if(slideshow == 2){
      knife.play();
      image(imgZ2,0,0,1400,800);
    }
    if(slideshow == 3){
      knife.play();
      image(imgZ3,0,0,1400,800);
    }
    if(slideshow == 4){
      knife.play();
      image(imgZ4,0,0,1400,800);
    }
    if(slideshow == 5){
      knife.play();
      image(imgZ5,0,0,1400,800);
    }
    if(slideshow == 6){
      knife.play();
      image(imgZ6,0,0,1400,800);
    }
    if(slideshow == 7){
      knife.play();
      image(imgZ7,0,0,1400,800);
    }
    if(slideshow == 8){
      knife.play();
      image(imgZ8,0,0,1400,800);
    }
    if(slideshow == 9){
      knife.play();
      image(imgZ9,0,0,1400,800);
    }
    if(slideshow == 10){
    //  image(imgZ10,0,0,1400,800);
    //  image(dicedTofu,75,305,200,200);
      current = 8;
    }
}
    if(getCurrent() == 7){
      imageMode(CENTER);
     image(knifePointer,mouseX,mouseY,150,150);
       imageMode(CORNER);
       noCursor();
     }

  }

  public static void main(String[] args) {
    PApplet.main("Game");
  }

  // private ArrayList<Veggie> veggies;
}
