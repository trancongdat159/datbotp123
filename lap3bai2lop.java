//Main.java
package bai2lop;

public class Main {
    public static void main(String[] args) {
        Vecto vt1=new Vecto(4,5,2);
        Vecto vt2=new Vecto(3,5,7);
        System.out.println(vt1.nhanVoHuong(vt2));
    }
}

//Vecto.java 

package bai2lop;

public class Vecto {
    private double x;
    private double y;
    private double z;

    public Vecto() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vecto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vecto cong(Vecto a) {
        double newx = this.x + a.x;
        double newy = this.y + a.y;
        double newz = this.z + a.z;
        return new Vecto(newx, newy, newz);
    }

    public Vecto tru(Vecto a) {
        double newx = this.x - a.x;
        double newy = this.y - a.y;
        double newz = this.z - a.z;
        return new Vecto(newx, newy, newz);
    }

    public Vecto nhanHangSo(double a) {
        double newx = this.x * a;
        double newy = this.y * a;
        double newz = this.z * a;
        return new Vecto(newx, newy, newz);
    }

    public double nhanVoHuong(Vecto a) {
        return this.x * a.x + this.y * a.y + this.z * a.z;
    }

    @Override
    public String toString() {
        return "{" +
                " x='" + getX() + "'" +
                ", y='" + getY() + "'" +
                ", z='" + getZ() + "'" +
                "}";
    }
}
