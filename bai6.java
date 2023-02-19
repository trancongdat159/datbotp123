import java.util.Scanner;

// BÀI TẬP XÉP HẠNG HỌC SINH
public class Bai6{
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap so diem:");

        float a = s.nextFloat();

        if( a < 5.0){
            System.out.println("Hoc sinh kem!");
        }else if(a >= 5.0 && a < 7.0){
            System.out.println("Hoc sinh trung binh!");
        }else if( a >= 7.0 && a < 8.0){
            System.out.println("Hoc sinh kha!");
        }else if(a >= 8.0){
            System.out.println("Hoc sinh gioi!");
        }
    }
}
