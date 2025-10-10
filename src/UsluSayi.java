import java.util.Scanner;
public class UsluSayi {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi,b,sonuc=1;
        System.out.print("Sayı gir :");
        sayi= sc.nextInt();
        System.out.print("Sayı gir :");
        b= sc.nextInt();
        for(int i=1 ; i<=b ; i++)
        {
            sonuc*=sayi;
        }
        System.out.println("Sonuc :"+sonuc);
    }
}
