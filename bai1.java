import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) throws Exception {
        Scanner So = new Scanner(System.in);

        System.out.println("Nhap a: ");
        float a = So.nextFloat();

        System.out.println("Nhap b:");
        float b = So.nextFloat();

        if( a == 0){
            if( b == 0){
                System.out.println("Phuong trinh vo so nghiep!");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
                float c;
                c = -b/a;
                System.out.printf("Phuong trinh co nghiem %.2f",c);
        }
    }
}


