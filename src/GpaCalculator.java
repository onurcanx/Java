import java.io.StringReader;
import java.util.Scanner;
public class GpaCalculator {
    static void main() {
        int mat,turkce,kimya,fizik;
        Scanner inp=new Scanner(System.in);
        System.out.println("Notlarınızı ilgili alanla giriniz.");

        //Matematik
        System.out.println("Matematik Notunuzu Giriniz.");
        mat= inp.nextInt();

        //Türkçe
        System.out.println("Türkçe Notunuzu Giriniz.");
        turkce= inp.nextInt();

        //Kimya
        System.out.println("Kimya Notunuzu Giriniz.");
        kimya= inp.nextInt();

        //Fizik
        System.out.println("Fizik Notunuzu Giriniz.");
        fizik= inp.nextInt();

        double ort=(mat+turkce+kimya+fizik)/4.0;
        boolean durum = ort>=50.0;
        String str = durum ? "Geçtiniz ": "Kaldınız";
        System.out.println("Ortalamanız :"+ort+"\n"+str);

    }
}
