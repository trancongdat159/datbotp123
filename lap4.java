Cylinder.java

package LAP;

public class Cylinder extends Cirlce{
    public double height;

    public double getHeight(){
        return this.height;
    }

    public double setHeight(double height){
        return this.height = height;
    }

    public double getVolume(){
        return super.getArea() * getHeight();
    }
}


Circle.java



package LAP;

public class Cirlce {
    public double radius;
    public String color;
    public double area;

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double setRadius(double radius){
        return this.radius = radius;

    }

    public String setColor(String color){
        return this.color = color;
    }

    public double getArea(){
        return this.area;
    }

    public String toString(){
        return "Cirlce: radius: " + getRadius() + ",Color: " + getColor() + ",Volume: " + getVolume() ;
    }

    private String getVolume() {
        return null;
    }
}

