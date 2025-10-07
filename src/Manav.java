import java.util.Scanner;
public class Manav {
    static void main(String[] args) {
        double a,e,d,p,toplam,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        Scanner imp=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        a= imp.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        e= imp.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        d= imp.nextDouble();
        System.out.print("Patlican Kaç Kilo ? :");
        p= imp.nextDouble();
        toplam=(a*armut)+(e*elma)+(d*domates)+(p*patlican);
        System.out.print("Toplam Tutar :"+toplam);


    }
}
