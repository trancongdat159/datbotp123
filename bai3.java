import java.util.Scanner;
public class Bai3{
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap vao so dien su dung trong thang nay:");
        float a = s.nextFloat();

        if( a > 0 && a <= 50){
            float t = 1000*a;
            System.out.printf("Tong tien dien cua ban la: %.2f",t);
        }else if(a > 50){
            float t = (a-50)*1200 + 50000;
            System.out.printf("Tong tien dien cua ban la: %.2f",t);
        }
    }
}
