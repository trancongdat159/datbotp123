import java.util.Scanner;

//MA TRẬN ĐỐI XỨNG

public class Bai10 {
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);
        
        int[][] m = {{1,2},{1,2}};
        int a,b;
        for(int i = 0; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
                a = i + 1;
                b = j + 1;
                System.out.printf(" (%d,%d) ",a,b);
                if(j == 1){
                    System.out.print("\n");
                }
            }
        }

        for(int i = 0; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
                a = i + 1;
                b = j + 1;                
                System.out.printf("\nNhap (%d,%d) = ",a,b);
                m[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i <= 1; i++){
            for(int j = 0; j <= 1; j++){
                System.out.printf(" %d ",m[i][j]);
                if(j == 1){
                    System.out.print("\n");
                }
            }
        }
        if(m[0][0]*m[1][1] == 0 && m[0][1] == m[1][0]){
            System.out.print("\nDay la ma tran doi xung!");
        }else{
            System.out.print("\nDay khong phai la ma tran doi xung!");
        }
        
    }
}
