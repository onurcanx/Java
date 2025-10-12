import java.util.Scanner;

public class HesapMakinesi2 {
    static double toplama(int x , int y)
    {
        return x+y;
    }
    static double cikarma(int x , int y)
    {
        return x-y;
    }
    static int bolme(int x , int y)
    {
        return x/y;
    }
    static int carpma(int x , int y)
    {
        return x*y;
    }
    static int usluSayi(int x,int y)
    {
        int sonuc=0;
        for(int i=1 ; i<=y ; i++)
        {
            sonuc*=x;
        }
        return sonuc;
    }
    static int fac(int x)
    {
        int sonuc=0;
        for(int i=1;x>=i ;i++)
        {
            sonuc*=i;
        }
        return sonuc;
    }
    static int modAl(int x,int y)
    {
        return x%y;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        boolean cikis=false;
        while(!cikis) {
            System.out.println("Bir sayı giriniz");
            int x = sc.nextInt();
            System.out.println("Bir sayı giriniz");
            int y = sc.nextInt();
            System.out.println("İşlem seç\n" +
                    "1-Toplama\n" +
                    "2-Çıkarma\n" +
                    "3-Bölme\n" +
                    "4-Çarpma\n"+
                    "5-Üslü Sayı Hesaplama\n"+
                    "6-Faktöriyel Hesaplama\n"+
                    "7-Mod Alma\n"+
                    "8-Çıkış");
            int secim= sc.nextInt();
            switch (secim)
            {
                case 1:
                    System.out.println(toplama(x,y));
                    break;
                case 2:
                    System.out.println(cikarma(x,y));
                    break;
                case 3:
                    System.out.println(bolme(x,y));
                    break;
                case 4:
                    System.out.println(carpma(x,y));
                    break;
                case 5:
                    System.out.println(usluSayi(x,y));
                    break;
                case 6:
                    System.out.println(fac(x));
                    break;
                case 7:
                    System.out.println(modAl(x,y));
                    break;
                case 8:
                    cikis=true;
                    break;
                default:
                    cikis=true;
                    break;
            }
        }
    }
}
