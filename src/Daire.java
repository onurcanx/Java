import java.util.Scanner;
public class Daire {
    static void main(String[] args) {
        double r,pi=3.14,alan,cevre,aci,dilimAlan;
        Scanner imp=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        r=imp.nextDouble();
        System.out.println("Dairenin alfa açısını giriniz");
        aci= imp.nextDouble();
        dilimAlan=(pi*(r*r)*aci)/360;
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Darienin Alanı:"+alan+"\nDairenin Çevresi:"+cevre+"\nDilimlenmiş Alan:"+dilimAlan);


    }
}
