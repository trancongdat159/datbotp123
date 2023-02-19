import java.util.Scanner;
import java.lang.Math;


public class Bai4{

    /**
     * GIAI PHUONG TRINH BAT NHAT
     */
    private static void bt1() {
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

    /**
     * GIAI PHUONG TRINH BAT 2
     */
    private static void bt2(){
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

    private static void bt3(){
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
    /**
     * @param agrs
     * @throws Exception
     */
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.println("Chon 1 - Giai phuong trinh bat 1 \nChon 2 - Giai phuong trinh bat 2\nChon 3 - Tinh tien dien \nChon 4 - Thoat chuong trinh\n------------------------");
        int a = s.nextInt();
        
        switch(a){
            case 1 : bt1();break;
            case 2 : bt2();break;
            case 3 : bt3();break;
            case 4 : System.out.println("Hen gap lai!");break;
            default : System.out.print("Nhap sai xin nhap lai!");
        }
    }
