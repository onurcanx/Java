import  java.util.Scanner;
public class CiftSayilar {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplamSayi=0,sayilar=0;
        System.out.print("Sayı Giriniz :");
        sayi= input.nextInt();
        for(int i =1 ;i<=sayi;i++)
        {
            /*if (i%2==0) System.out.println(i);*/ // ikiye tam bölünen sayıları yazdırma
            if ((i%3==0)&&(i%4==0))
            {
                sayilar+=i;
                toplamSayi++;
            }

        }
        double ortalama= sayilar/toplamSayi;
        System.out.println("Toplam :"+ortalama);



    }
}
