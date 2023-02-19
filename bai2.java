import java.util.Scanner;
import java.lang.Math;

public class Bai2{
    public static void main(String[] agrs) throws Exception{
        Scanner n = new Scanner(System.in);

        System.out.print("Nhap a: ");
        float a = n.nextFloat();

        System.out.print("Nhap b:");
        float b = n.nextFloat();

        System.out.print("Nhap c:");
        float c = n.nextFloat();
        
        if( a==0){
            if( b == 0){
                if( c == 0){
                    System.out.println("Phuong trinh vo so nghiem");
                }else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }else{
                System.out.printf("Phuong trinh co nghiem %.2f",(-c/b));
            }
        }else{
            float d = (float) (Math.pow(b,2) - 4*a*c);
            if(d < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if(d == 0){
                System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.2f",-b/2*a );
            }else if(d > 0){
                float x1 = (float) (-b + Math.sqrt(d)/2*a);
                float x2 = (float) (-b - Math.sqrt(d)/2*a);
                System.out.printf("Phuong trinh co 2 ngiem x1 = %.2f va x2 = %.2f",x1,x2);
            }
        }
    }
}
