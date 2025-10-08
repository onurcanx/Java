import java.util.Scanner;
public class ArtikYil {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int yil,artikYil;
        System.out.print("Yıl Giriniz :");
        yil=sc.nextInt();
        if(yil%400==0)
        {
            System.out.print(yil+" bir artık yıldır.");
        }
        else if (yil%100==0)
        {
            System.out.print(yil+" bir artık yıl değildir.");
        } else if (yil%4==0)
        {
            System.out.print(yil+" bir artık yıldır.");
        }
        else System.out.print(yil+" bir artık yıl değil.");

    }
}
