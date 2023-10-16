package labs.forlaba2.l23;

public class Circle {
    private String colour;
    private double rad;
    public double getPerim() {return Math.PI*this.getRad();}
    Point pnt = new Point(0 , 0);

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public Point getPnt() {
        return pnt;
    }

    public void setPnt(Point pnt) {
        this.pnt = pnt;
    }
}
