//import processing.sound.SoundFile;
import processing.sound.*;
import processing.core.*;
import java.util.*;
//import java.applet.*;

public class Game extends PApplet {

 SoundFile background1;
 SoundFile click,drawer;
 SoundFile knife;
 SoundFile fridgeRunning;
 PImage knifePointer,dicedTofu,backButton;
 PImage imgZ1,imgZ2,imgZ3,imgZ4,imgZ5,
 imgZ6,imgZ7,imgZ8,imgZ9,imgZ10;
 PImage D1Ba,D1Bb,D1Bc,D1Bd,pan;
 PImage D2Ba,D2Bb,D2Bc;
 PImage D3Ba,D3Bb,Display21A;
PImage sprinkle,skipSeasoning,addSeasoning;

 //alt sprites
 PImage D1Ba2,D1Bb2,D1Bc2,D1Bd2;
 PImage D2Ba2,D2Bb2,D2Bc2;
 PImage D3Ba2,D3Bb2;
  private ArrayList<Scene> scenes;
  private int current = 0;
  private int seasoningA = 0;
  private int seasoningB = 0;
  private int seasoningC = 0;
  private int sprinkleCounter = 0;
  private int tofuCounter = 0;
  private int slideshow;
  public void settings() {
    // size(width, height);
    // size(1500, 850);
    size(1400, 800);
  //  private PImage buttonPressed;
  }

  public void setup() {
    knifePointer = loadImage("knife.png");
    sprinkle = loadImage("sprinkle.png");
    skipSeasoning = loadImage("skipSeasoning.png");
    addSeasoning = loadImage("addSeasoning.png");
    dicedTofu = loadImage("dicedTofu.png");
    Display21A = loadImage("display20A.png");
    pan = loadImage("pan.png");
    dicedTofu = loadImage("dicedTofu.png");
    backButton = loadImage("backButton.png");
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
    //Drawer 1 family
    D1Ba = loadImage("D1Ba.png");
    D1Bb = loadImage("D1Bb.png");
    D1Bc = loadImage("D1Bc.png");
    D1Bd = loadImage("D1Bd.png");
    //Drawer 2 family
    D2Ba = loadImage("D2Ba.png");
    D2Bb = loadImage("D2Bb.png");
    D2Bc = loadImage("D2Bc.png");
    //Drawer 3 family
    D3Ba = loadImage("D3Ba.png");
    D3Bb = loadImage("D3Bb.png");


    //alt sprites
    D1Ba2 = loadImage("D1Ba2.png");
    D1Bb2 = loadImage("D1Bb2.png");
    D1Bc2 = loadImage("D1Bc2.png");
    D1Bd2 = loadImage("D1Bd2.png");
    //Drawer 2 family
    D2Ba2 = loadImage("D2Ba2.png");
    D2Bb2 = loadImage("D2Bb2.png");
    D2Bc2 = loadImage("D2Bc2.png");
    //Drawer 3 family
    D3Ba2 = loadImage("D3Ba2.png");
    D3Bb2 = loadImage("D3Bb2.png");
 background1 = new SoundFile(this, "background1.mp3");
 knife = new SoundFile(this, "knife.mp3");
//background1.amp(1/2);
//click.amp(1/2);
fridgeRunning = new SoundFile(this,"fridge.wav");
   click = new SoundFile(this, "click.wav");
  drawer = new SoundFile(this, "drawer.mp3");
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
    scenes.add(new Scene10A(this));
    scenes.add(new Scene11A(this)); //current 12
    //scene 12 family
    scenes.add(new Scene12A(this));
    scenes.add(new Scene12B(this));
    scenes.add(new Scene12C(this));
    scenes.add(new Scene12D(this)); //curent 16

    scenes.add(new Scene13A(this));//current 17
    scenes.add(new Scene14A(this));//curent 18
    //scene 15 family
    scenes.add(new Scene15A(this));//19
    scenes.add(new Scene15B(this));
    scenes.add(new Scene15C(this));

    scenes.add(new Scene16A(this));//22
    scenes.add(new Scene17A(this));//23
    //scene 18 family
    scenes.add(new Scene18A(this));//24
    scenes.add(new Scene18B(this));//25

    scenes.add(new Scene19A(this));//26
    scenes.add(new Scene20A(this));//27
    scenes.add(new Scene21A(this));//28
    scenes.add(new Scene22A(this));//29
    scenes.add(new Scene23A(this));//30
    scenes.add(new Scene24A(this));//31
    scenes.add(new endScene(this));//32

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
if(getCurrent() == 18){

if(mouseX > 827 && mouseX < 827 + 35 &&
mouseY > 590 && mouseY < 590+ 65) {
seasoningB = 1;

current = 19;

}
}
if(getCurrent() == 18){

if(mouseX > 867 && mouseX < 867 + 35 &&
mouseY > 590 && mouseY < 590+ 65) {
seasoningB = 2;

current = 20;

}
}
if(getCurrent() == 31){
 int seasoningA = 0;
 int seasoningB = 0;
 int seasoningC = 0;
 int sprinkleCounter = 0;
 int slideshow = 0;
  int tofuCounter = 0;
}
if(getCurrent() == 23){

if(mouseX > 833 && mouseX < 833 + 35 &&
mouseY > 680 && mouseY < 680 + 65) {
seasoningC = 1;
//rect(833,680,35,65);
//rect(903,680,35,65);
current =24;

}
}
if(getCurrent() == 23){

if(mouseX > 903 && mouseX < 903 + 35 &&
mouseY > 680 && mouseY < 680 + 65) {
seasoningC = 2;

//rect(903,680,35,65);
current =25;

}
}
if(getCurrent() == 18){

if(mouseX > 927 && mouseX < 927 + 35 &&
mouseY > 590 && mouseY < 590+ 65) {
seasoningB = 3;

current = 21;

}
}
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
        fridgeRunning.play();
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
    if (getCurrent() == 1) {
    if (mouseX > 655 && mouseX < 655 + 600 &&
     mouseY > 600 && mouseY < 600 + 90)  {
      click.play();
        current = 2;
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
if(mouseX > 110 && mouseX < 110 + 120 &&
mouseY > 365 && mouseY < 365 + 70) {
if(getCurrent() == 7){
  knife.play();
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
if(getCurrent() == 10){
if(mouseX > 500 && mouseX < 500 + 230 &&
mouseY > 300 && mouseY < 300 + 125) {


current = 11;

}
}
if(getCurrent() == 26){
  if(mouseX > 85 && mouseX < 85 + 90 &&
  mouseY > 85 && mouseY < 85 + 90) {

//
    //rect(85,85,90,90);
}
current = 28;
}

if(getCurrent() == 22){

     if(mouseX > 815 && mouseX < 815 + 150 &&
     mouseY > 675 && mouseY < 675 + 75) {

 //rect(815,605,150,75);
     current = 23;
}
     }
if(getCurrent() == 17){

    if(mouseX > 815 && mouseX < 815 + 150 &&
    mouseY > 605 && mouseY < 605 + 75) {
drawer.play();
      //rect(815,605,150,75);
      current = 18;

          }
     }
if(getCurrent() == 12){

if(mouseX > 825 && mouseX < 825 + 35 &&
mouseY > 515. && mouseY < 515 + 65) {
seasoningA = 1;

//p.rect(825,515,35,65);
current = 13;

}
}
if(getCurrent() == 11){

if(mouseX > 815 && mouseX < 815 + 150 &&
mouseY > 535 && mouseY < 535 + 75) {

// p.rect(815,535,150,75);
current = 12;

}
}
//#2
if(getCurrent() == 12){

if(mouseX > 865 && mouseX < 865 + 35 &&
mouseY > 515. && mouseY < 515 + 65) {
seasoningA = 2;
//p.rect(865,515,35,65);
current = 14;

}
}
//#3
if(getCurrent() == 12){

if(mouseX > 903 && mouseX < 903 + 25 &&
mouseY > 515. && mouseY < 515 + 65) {
drawer.play();
seasoningA = 3;
//p.rect(903,515,25,65);
current = 15;

}
}
//#4
if(getCurrent() == 12){

if(mouseX > 932 && mouseX < 932 + 25 &&
mouseY > 515 && mouseY < 515 + 65) {
seasoningA = 4;
//p.rect(932,515,25,65);
current = 16;

}
}

if(getCurrent() == 28){

if(mouseX > 535 && mouseX < 535+ 200 &&
mouseY > 305 && mouseY < 305 + 100) {
  current = 29;
//rect(535,305,200,100);

}
}
if(getCurrent() == 29){

if(mouseX > 85 && mouseX < 85 + 90 &&
mouseY > 85 && mouseY < 85 + 90) {
  current = 30;


}
}
if(getCurrent() == 30){

if(mouseX > 535 && mouseX < 535+ 200 &&
mouseY > 305 && mouseY < 305 + 100) {
  current = 31;
//rect(535,305,200,100);

}
}
if(getCurrent() == 28){
  if(mouseX > 535 && mouseX < 535+ 200 &&
  mouseY > 305 && mouseY < 305 + 100) {
  tofuCounter +=1;
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

if(sprinkleCounter == 1){
  image(sprinkle,575,310,120,80);
}
  if(sprinkleCounter == 2){
    image(sprinkle,575,310+40,120,80);
      }
  if(getCurrent() == 27){
      image(addSeasoning,980,145,200,125);
          }
      if(getCurrent() == 12 ||getCurrent() == 13 ||getCurrent() == 14 ||getCurrent() == 15 ||getCurrent() == 16 ||getCurrent() == 17 ||getCurrent() == 18
      ||getCurrent() == 19 ||getCurrent() == 20
      ||getCurrent() == 21||getCurrent() == 22
      ||getCurrent() == 23||getCurrent() == 24
      ||getCurrent() == 25){


      }
if(getCurrent() == 17 ||getCurrent() == 18
||getCurrent() == 19 ||getCurrent() == 20
||getCurrent() == 21||getCurrent() == 22
||getCurrent() == 23||getCurrent() == 24
||getCurrent() == 25||getCurrent() == 26){
  if(seasoningA ==1){
  image(D1Ba,755,345,45,65);
  }
  if(seasoningA ==2){
  image(D1Bb,755,345,45,65);
  }
  if(seasoningA ==3){
  image(D1Bc,755,345,45,65);
  }
  if(seasoningA ==4){
  image(D1Bd,755,345,45,65);
  }
    }
if(getCurrent() == 22||getCurrent() == 23
||getCurrent() == 24||getCurrent() == 25
||getCurrent() == 26){
  if(seasoningB == 1){
  image(D2Ba,805,345,45,65);
  }
  if(seasoningB == 2){
  image(D2Bb,805,345,45,65);
  }
  if(seasoningB == 3){
  image(D2Bc,805,365,35,65);
  }
}
if(getCurrent() == 26){
  if(seasoningC == 1){
  image(D3Ba,875,345,40,65);
  }
  if(seasoningC == 2){
  image(D3Bb,875,345,40,65);
  }
}
if(getCurrent() == 27 || getCurrent() == 28 && tofuCounter == 0){

  if(seasoningA ==1){
      image(D1Ba,mouseX,mouseY,40,65);
  }
  if(seasoningA ==2){
      image(D1Bb,mouseX,mouseY,40,65);
  }
  if(seasoningA ==3){
      image(D1Bc,mouseX,mouseY,40,65);
  }
  if(seasoningA ==4){
      image(D1Bd,mouseX,mouseY,40,65);
  }

  if(seasoningB ==1){
      image(D2Ba,mouseX+50,mouseY,40,65);
  }
  if(seasoningB ==2){
      image(D2Bb,mouseX+50,mouseY,40,65);
  }
  if(seasoningB ==3){
      image(D2Bc,mouseX+50,mouseY,40,65);
  }

  if(seasoningC ==1){
      image(D3Ba,mouseX+75,mouseY+25,40,65);
  }
  if(seasoningC ==2){
      image(D3Bb,mouseX+75,mouseY+25,40,65);
  }
}
if(getCurrent() == 28 && tofuCounter == 1){
      image(Display21A,0,0,1400,800);
      image(pan,490,255,320,200);
       image(dicedTofu,75,305,200,200);
  if(seasoningA ==1){
      image(D1Ba2,mouseX,mouseY,65,40);
  }
  if(seasoningA ==2){
      image(D1Bb2,mouseX,mouseY,65,40);
  }
  if(seasoningA ==3){
      image(D1Bc2,mouseX,mouseY,65,40);
  }
  if(seasoningA ==1){
      image(D1Bd2,mouseX,mouseY,65,40);
  }

  if(seasoningB ==1){
      image(D2Ba2,mouseX+50,mouseY,65,40);
  }
  if(seasoningB ==2){
      image(D2Bb2,mouseX+50,mouseY,65,40);
  }
  if(seasoningB ==3){
      image(D2Bc2,mouseX+50,mouseY,65,40);
  }

  if(seasoningC ==1){
      image(D3Ba2,mouseX+75,mouseY+25,65,40);
  }
  if(seasoningC ==2){
      image(D3Bb2,mouseX+75,mouseY+25,65,40);
  }
}
if(getCurrent() == 13){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 12;
}
  imageMode(CENTER);
  noCursor();
  image(D1Ba,mouseX,mouseY,45,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 745 && mouseX < 745 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 17;
}
}
if(getCurrent() == 14){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 12;
}
  imageMode(CENTER);
  noCursor();
  image(D1Bb,mouseX,mouseY,45,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 745 && mouseX < 745 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 17;
}
}
if(getCurrent() == 15){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 12;
}
  imageMode(CENTER);
  noCursor();
  image(D1Bc,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 745 && mouseX < 745 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 17;
}

}
if(getCurrent() == 19){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 18;
}
  imageMode(CENTER);
  noCursor();
  image(D2Ba,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 810 && mouseX < 810 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 22;
}

}
if(getCurrent() == 20){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 18;
}
  imageMode(CENTER);
  noCursor();
  image(D2Bb,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 810 && mouseX < 810 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 22;
}

}
if(getCurrent() == 24){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 23;
}
  imageMode(CENTER);
  noCursor();
  image(D3Ba,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 900 && mouseX < 900 + 55&&
  mouseY > 310 && mouseY < 310 + 100) {
  current = 26;
}

}
if(getCurrent() == 25){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 23;
}
  imageMode(CENTER);
  noCursor();
  image(D3Bb,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 900 && mouseX < 900 + 55&&
  mouseY > 310 && mouseY < 310 + 100) {
  current = 26;
}

}
if(getCurrent() == 21){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 18;
  drawer.play();
}
  imageMode(CENTER);
  noCursor();
  image(D2Bc,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 810 && mouseX < 810 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 22;
}

}


if(getCurrent() == 16){
  image(backButton,950,300,100,100);
  if(mouseX > 950 && mouseX < 950 + 100&&
  mouseY > 300 && mouseY < 300 + 100) {
  current = 12;
}
  imageMode(CENTER);
  noCursor();
  image(D1Bd,mouseX,mouseY,35,65);
  imageMode(CORNER);
  cursor();
  if(mouseX > 745 && mouseX < 745 + 55&&
  mouseY > 335 && mouseY < 335 + 75) {
  current = 17;
}
}
if(getCurrent() == 7){
    if(slideshow == 1){

      image(imgZ1,0,0,1400,800);
    }
    if(slideshow == 2){

      image(imgZ2,0,0,1400,800);
    }
    if(slideshow == 3){

      image(imgZ3,0,0,1400,800);
    }
    if(slideshow == 4){

      image(imgZ4,0,0,1400,800);
    }
    if(slideshow == 5){

      image(imgZ5,0,0,1400,800);
    }
    if(slideshow == 6){

      image(imgZ6,0,0,1400,800);
    }
    if(slideshow == 7){

      image(imgZ7,0,0,1400,800);
    }
    if(slideshow == 8){
      image(imgZ8,0,0,1400,800);
    }
    if(slideshow == 9){

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
