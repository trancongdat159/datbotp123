//TÍNH GIAI THỪA

import java.util.Scanner;

public class Bai8{
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);

        int a,b = 1;
        System.out.print("Nhap so: ");
        a = s.nextInt();

        for(int i = 1; i <= a; i++ ){
            b = b * i;
        }
        System.out.printf("Gai thua cua %d la %d",a,b);
    }
}
