import java.util.Scanner;
import java.lang.Math;

//TÌM SỐ CHÍNH PHƯƠNG
public class Bai5{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap so:");
        int a = s.nextInt();

        int b = (int) Math.sqrt(a);

        int c = (int) Math.pow(b,2);

        if( c == a){
            System.out.printf("%d la so chinh phuong",a);
        }else{
            System.out.printf("%d khong phai la so chinh phuong",a);
        }
    }
}
