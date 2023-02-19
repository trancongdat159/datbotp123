import java.util.Scanner;

public class Bai7{
    public static void main(String[] agrs) throws Exception{
        Scanner s = new Scanner(System.in);

        int a,b,c,n;

        System.out.print("Nhap 3 so lien tiep:");
        n = s.nextInt();
        while( n < 0 && n > 999){
            System.out.println("Nhap lai:");
            n = s.nextInt();  
        }

        a = n / 100;
        n = n % 100;
        b = n / 10;
        n = n % 10;
        c = n;

        Dem(a);
        DocTram(a,b);
        Dem(b);
        DocleMuoi(b,c);
        Dem(c);
    }

    static int DocTram( int a , int b){
        if(a > 0){
            System.out.print(" Tram");
        }
        return 0;
    }
    static int DocleMuoi( int b, int c){
        if(b > 0){
            System.out.print(" Muoi");
        }else if(b ==0){
            System.out.print(" Le");
        }
        return 0;
    }
    static int Dem(int n){
        switch(n){
            case 1 : System.out.print(" Mot");break;
            case 2 : System.out.print(" Hai");break;
            case 3 : System.out.print(" Ba");break;
            case 4 : System.out.print(" Bon");break;
            case 5 : System.out.print(" Nam");break;
            case 6 : System.out.print(" Sau");break;
            case 7 : System.out.print(" Bay");break;
            case 8 : System.out.print(" Tam");break;
            case 9 : System.out.print(" Chin");break;
        }
        return 0;
    }
}
