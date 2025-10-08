import java.util.Scanner;
public class CinZodyagı {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int yil;
        String havyan=" ";
        System.out.print("Doğum yılınızı giriniz :");
        yil=sc.nextInt();
        if(yil%12==0) havyan="Maymun";
        if(yil%12==1) havyan="Horoz";
        if(yil%12==2) havyan="Köpek";
        if(yil%12==3) havyan="Domuz";
        if(yil%12==4) havyan="Fare";
        if(yil%12==5) havyan="Öküz";
        if(yil%12==6) havyan="Kaplan";
        if(yil%12==7) havyan="Tavşan";
        if(yil%12==8) havyan="Ejderha";
        if(yil%12==9) havyan="Yılan";
        if(yil%12==10) havyan="At";
        if(yil%12==11) havyan="Koyun";
        System.out.println("Çin zodyağı Burcunuz: "+havyan);
    }
}
