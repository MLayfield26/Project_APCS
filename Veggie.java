//
// Ball.java
//


import processing.core.*;


public class Game{
//food object (should be draggable)


    //Velocity to keep track of speed and position to keep track of pos
    //processing arraylist resource:
    // https://happycoding.io/tutorials/processing/arraylists

  //unfortunately i must use images because
  //i do not have the talent to draw non-ugly processing
  //images so I must figure out how to do that

//this is a vegtable
//PVector velocity,
public Veggie(PApplet p, PVector position,
 int color, int size){
this.p = p;
this.position = position;
//this.velocity = velocity;
//this.acceleration = acceleration;
this.size = size;

this.color = color;
}


    //who
//    private int gamestate????? no

//bamboozol yourself
    public void display(){
      //  p.fill(color);
        p.background(0);
        p. fill(255);
    //    p.rect(position.x, position.y, size*20, size*20);
      p.textSize(100);
     p.text("what?", 200, 200);

    }
    //dont let them trick you keep it here

    private PApplet p;
    private PVector position;
  //  private PApplet velocity;
  //  private PApplet acceleration;
    private int size;

    private int color;


}
