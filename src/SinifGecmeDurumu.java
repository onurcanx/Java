import java.util.Scanner;
public class SinifGecmeDurumu {
    static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double mat,turkce,kimya,fizik;
        double ort=0;
        int sayac=0;
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat= inp.nextInt();
        if(mat>=0 && mat<=100) ort=mat+ort; sayac++;

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce= inp.nextInt();
        if(turkce>=0 && turkce<=100) ort+=turkce; sayac++;

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya= inp.nextInt();
        if(kimya>=0 && kimya<=100) ort+=kimya; sayac++;

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik= inp.nextInt();
        if(fizik>=0 && fizik<=100) ort+=fizik; sayac++;

        System.out.println("Ortalamanız:"+(ort/sayac));
        if(ort<55) System.out.println("Kaldınız");
        else System.out.println("Geçtiniz");
    }
}
