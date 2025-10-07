import java.util.Scanner;
public class Taksimetre {
    static void main(String[] args) {
        double baslagic=10,kmBasina=2.2,km,ucret;
        Scanner inp= new Scanner(System.in);
        System.out.print("Gidilen mesafeyi km cinsinden yazınız:");
        km=inp.nextDouble();
        ucret=(km*kmBasina)+baslagic;
        /*if (ucret<=20)
        {
            ucret=20;
            System.out.println("Gidilen mesafe (km cinsinden):"+km+"\nÖdenecek ücretiniz:"+ucret+"TL");
        }
        else System.out.println("Gidilen mesafe (km cinsinden):"+km+"\nÖdenecek ücretiniz:"+ucret+"TL");*/
        ucret=(ucret<20)? 20:ucret;
        System.out.println("Gidilen mesafe (km cinsinden):"+km+"\nÖdenecek ücretiniz:"+ucret+"TL");
    }
}
