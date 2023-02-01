//
// Ball.java
//


import processing.core.*;


public class Ball
{
    public Ball(PApplet p,
                PVector position,
                PVector velocity,
                float radius,
                int color)
    {
        this.p = p;
        this.position = position;
        this.velocity = velocity;
        this.radius = radius;
        this.color = color;
    }

    public void display()
    {
        p.fill(color);


        position.add(velocity);

        if (position.x<radius || position.x>p.width-radius)
            velocity.x *= -1;

        if (position.y<radius || position.y>p.height-radius)
            velocity.y *= -1;
    }

    private PApplet p;
    private PVector position;
    private PVector velocity;
    private float radius;
    private int color;
}
