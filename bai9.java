import java.util.Scanner;

//NHẬP MẢNG VÀ SỬA MẢNG

public class Bai9{
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);

        int a,b;
        System.out.print("Nhap so mang:");
        a = s.nextInt();
        int[] c = new int[100];

        for(int i = 0; i <= a ; i++){
            System.out.printf("\nNhap Mang[%d] = ",i);
            c[i]= s.nextInt();
        }
        
        System.out.print("\nNhap so can xoa trong mang:\n");
        b = s.nextInt();

        for(int i = 0; i <= a; i++){
            if(c[i] == b){
                c[i] = 0;
            }
        }
        System.out.print("Mang sau khi sua la:\n");
        for(int i = 0;i <= a; i++){
            System.out.printf(" " + c[i] + " ");
        }
    }
}
