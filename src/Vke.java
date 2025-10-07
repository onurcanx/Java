import java.util.Scanner;
public class Vke {
    static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        double boy, kilo,sonuc;
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy= imp.nextDouble();
        System.out.print("kilonuzu kg cinsinden giriniz:");
        kilo= imp.nextDouble();
        sonuc=kilo/(boy*boy);
        System.out.print("Vücut kitle endeksiniz:"+sonuc);

    }
}
