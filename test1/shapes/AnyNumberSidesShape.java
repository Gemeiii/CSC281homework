package shapes;

import java.awt.*;
import java.util.*;

/**
 * This class is a simple AnyNumberSidesShape-3 shape class;
 */
public class AnyNumberSidesShape extends BasicShape {

        //color to fill the shape
        private Color fillColor= new Color(155,255,155,255);
        //color to stroke the shape;
        private Color strokeColor= new Color(0,155,55,255);
        //the radius of the Circumcircle
        private double radius = 30;
        //the number of sides;
        private int sides=3;
        public AnyNumberSidesShape(int x, int y) {
            super(x, y);
        }
    public AnyNumberSidesShape(int x, int y,int sidesNumber) {
        super(x, y);
        this.sides = sidesNumber;
    }
    @Override
    public void draw(Graphics g) {
        // cast the Graphics instance to the 2d version.
        Graphics2D g2d = (Graphics2D) g;

    /*Lists to hold the x and y coordinates of the Polygon.
     */
        java.util.List<Integer> xPoints = new ArrayList<Integer>();
        java.util.List<Integer> yPoints = new ArrayList<Integer>();

        // Create x and y coordinates of vertices of the Polygon
        for(int i = 0; i<this.sides;i++){
            double angle = i*2*Math.PI/this.sides;
            int x =(int) (this.radius * Math.cos(angle));
            int y =(int) (this.radius * Math.sin(angle));
            xPoints.add(this.x + x);
            yPoints.add(this.y + y);
        }


    /*
     * Add each point to the Polygon p. Each x and y value in the lists index correspondent. This
     * means that the ith point is made of up the ith index of xPoints and the ith index of yPoints.
     * For example, the first point is at index 0 and can be made with xPoints.get(0) and
     * yPoints.get(0).
     */
        Polygon p = new Polygon();
        for (int i = 0; i < xPoints.size(); ++i) {
            p.addPoint(xPoints.get(i), yPoints.get(i));
        }

    /*
     * Sets the outline or stroke properties for the class.
    */
    g2d.setColor(this.strokeColor);
        // set the stroke to have a width of 6.0f
        g2d.setStroke(new BasicStroke(4.0f));
        // draw the stroke outline of Polygon p
        g2d.draw(p);
    /*
     * Sets the internal or fill color of the polygon.
     */
        // set the fill color to be the active color
        g2d.setColor(this.fillColor);
        // fill Polygon p with fillColor
        g2d.fill(p);
    }
}
