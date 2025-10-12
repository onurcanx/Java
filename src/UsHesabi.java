import java.util.Scanner;

public class UsHesabi {
    static int usHesapla(int x,int y)
    {
        if(y==0) return 1;
        else if (y==1) { return x;

        }
        else return x*usHesapla(x,y-1);

    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x ,y;
        System.out.print("Taban değerini giriniz :");
        x=sc.nextInt();
        System.out.print("Üs değerini giriniz :");
        y=sc.nextInt();
        System.out.print("Sonuc :"+usHesapla(x,y));
    }
}
