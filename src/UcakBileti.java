import java.util.Scanner;
public class UcakBileti {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tip,yas;
        double sonToplam,yasIndirimOrani=0,km,toplamTutar,yasIndirimi,gidiDonusIndirimi=0,indirimliTutar;
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km= sc.nextDouble();
        System.out.print("Yaşınızı giriniz:");
        yas= sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1-> Tek Yön  2 -> Gidiş Dönüş) :");
        tip=sc.nextInt();
        toplamTutar=km*0.10;
        if(km<0) System.out.println("Hatalı mesafe girdiniz.");
        if(yas<12) yasIndirimOrani=0.5;
        if(yas>=12 && yas<=24) yasIndirimOrani=0.1;
        if(yas>65) yasIndirimOrani=0.3;
        yasIndirimi=toplamTutar*yasIndirimOrani;
        indirimliTutar=toplamTutar-yasIndirimi;
        switch (tip){
            case 1:
                System.out.println(indirimliTutar+" TL");
                break;
            case 2:
                gidiDonusIndirimi=indirimliTutar*0.2;
                sonToplam=(indirimliTutar-gidiDonusIndirimi)*2;
                System.out.println(sonToplam+" TL");
                break;
            default:
                System.out.println("Hatalı Bilet Tipi.");
                break;
        }








    }
}
