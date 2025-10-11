import java.util.Scanner;
public class HarmonikSayilar
{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi;
        double toplam=0;
        System.out.print("Bir sayı giriniz :");
        sayi= sc.nextInt();
        for(int i=1 ; i<=sayi ; i++)
        {
            toplam=toplam+(1.0/i);
            System.out.println(i);
        }
        System.out.println(toplam);
    }

}
