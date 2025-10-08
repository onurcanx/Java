import java.util.Scanner;
public class HesapMakinesi {
    static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int s1,s2,islem;
        System.out.println("Lütfen sayı giriniz");
        s1=inp.nextInt();
        System.out.println("Lütfen sayı giriniz");
        s2=inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen işlem seçiniz:");
        islem=inp.nextInt();
        switch (islem)
        {
            case 1 :
                System.out.println("Sonuç:"+(s1+s2));
                break;
            case 2 :
                System.out.println("Sonuç:"+(s1-s2));
                break;
            case 3 :
                System.out.println("Sonuç:"+(s1*s2));
                break;
            case 4 :
                System.out.println("Sonuç:"+(s1/s2));
                break;
            default:
                System.out.println("Hatalı işlem seçimi.");
        }
    }
}
