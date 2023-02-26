package bai1lop;

public class Square {
    private double canh;

    public Square() {
        this.canh = 0;
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return this.canh;
    }

    public void setCanh(double c) {
        this.canh = c;
    }

    public double dienTich() {
        return this.canh * this.canh;
    }

    public double chuVi() {
        return 4 * this.canh;
    }
}
