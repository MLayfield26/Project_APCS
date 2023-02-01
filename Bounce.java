//
// Bounce.java
//not my code


import processing.core.*;
import java.util.*;


public class Bounce extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        balls = new ArrayList<Ball>();
        createBall();
    }

    public void createBall()
    {
        PVector position = new PVector(width/2, height/2);

        PVector velocity = PVector.random2D();
        velocity.setMag(random(3, 5));

        float radius = random(5, 20);
        int c = color(random(256), random(256), random(256));

        Ball ball = new Ball(this,
                             position,
                             velocity,
                             radius,
                             c);

        balls.add(ball);
    }

    public void draw()
    {
        background(0);

        for (Ball ball : balls)
            ball.display();
    }

    public void keyPressed()
    {
        for (int i=0; i<10; i++)
            createBall();
    }

    public static void main(String[] args)
    {
        PApplet.main("Bounce");
    }

    private ArrayList<Ball> balls;
}
