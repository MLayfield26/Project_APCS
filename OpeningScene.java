

import processing.core.*;



public class OpeningScene implements Scene{
    public OpeningScene(PApplet p){

      foodWall = p.loadImage("foodWall.png");
        this.p = p;

    }

    public void setup() {

    }
    public void display(){
    //  foodWall = p.loadImage("foodWall.jpg");
        p.image(foodWall,0,0,600,600);
      //  p.imageMode(p.CENTER);
      //  p.background(0);
        p.textAlign(PApplet.CENTER);
        p.textSize(50);
        p.noStroke();
        p.fill(200,100,100,500);
        //       p.rect(100,200,425,200);
          //   p.fill(100,100,120,100);
              //p.rect(0,0,800,800);
       p.fill(250,100,0);
    //    p.text("click to start", p.width/2, p.height/2);
    }

  public void handleKeyPressed(){

    }
    public static void main(String[] args) {
    PApplet.main("Game");
    }
  private PImage foodWall;
    private PApplet p;
}
