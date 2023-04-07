public class Main {

    public static void main(String[] args) {

        MoveableCircle mc = new MoveableCircle();
        mc.moveRight();
        mc.moveDown();
        mc.moveLeft();
        mc.moveUp();

    }
}
public interface Moveable {

    abstract void moveUp();

    abstract void moveDown();

    abstract void moveLeft();

    abstract void moveRight();
    
 

}
class MoveableCircle implements Moveable
 {
   
     
  
    @Override
    public void moveUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveRight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    }
 class MoveablePoint implements Moveable{
      int x;
       int y;
       int xSpeed;
       int ySpeed;
           public MoveablePoint (int x,int y,int xSpeed,int ySpeed ){
               this.x=x;
               this.y=y;
               this.xSpeed=xSpeed;
               this.ySpeed=ySpeed;
           }
           public String toString (){
            return "MoveablePoint [x="+x+",y="+y+",xSpeed="+xSpeed+",ySpeed="+ySpeed+"]";
 
                    }
     

    @Override
    public void moveUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveDown() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveRight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    
     
 }


