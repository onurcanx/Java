import java.util.Scanner;
public class Kuvvetleri {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
         Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program
         */

       /*

        int sayi,sayac=1;
            System.out.println("Sayi giriniz");
            sayi= sc.nextInt();
        for (int i=0;sayi>=sayac;i++)
        {
            System.out.println(sayac);
            sayac*=2;
        }

        */

        /*

        Java döngüler ile girilen sayıya kadar olan
         4 ve 5'in kuvvetlerini ekrana yazdıran program

         */
        int sayi;
        System.out.println("Sayi giriniz");
        sayi= sc.nextInt();
        for (int i=1 , j=1;sayi>=i && sayi>=j;i*=4,j*=5)
        {
            System.out.println("Dördün kuvvetleri "+ i);
            System.out.println("Beşin kuvvetleri "+ j);
        }

    }

}
