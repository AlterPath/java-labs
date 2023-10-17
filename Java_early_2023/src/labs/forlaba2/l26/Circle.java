package labs.forlaba2.l26;

public class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPer(){return Math.PI*this.getR();}
    public double getLength() {return 2 * Math.PI * r;}
    public static void comparec(Circle c1, Circle c2) {
        if (c1.getPer() < c2.getPer()) {
            System.out.println("Круг c1 меньше круга c2");
        }
        if (c1.getPer() > c2.getPer()) {
            System.out.println("Круг c1 больше круга c2 ");
        }
        if (c1.getPer() == c2.getPer()) {
            System.out.println("Круги равны по площади");
        }
    }
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
