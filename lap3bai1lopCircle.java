package bai1lop;

public class Circle {
    private double r;
    public Circle() {
        this.r = 0;
    }

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public double dienTich() {
        return Math.PI * this.r * this.r;
    }

    public double chuVi() {
        return 2 * Math.PI * this.r;
    }
    @Override
    public String toString() {
        return "{" +
            " r='" + getR() + "'" +
            "}";
    }
    
}
