import java.util.Scanner;
public class KDVCalculator {
    static void main(String[] args) {
        double kdv1 , sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz: ");
        sayi= inp.nextDouble();
        if(sayi>=0)
            if (sayi>1000)
            {
                kdv1=sayi+(sayi*0.08);
                System.out.print("\nKDV dahil fiyatı:"+kdv1);
            }
            else
            {
                kdv1=sayi+(sayi*0.18);
                System.out.print("\nKDV dahil fiyatı:"+kdv1);
            }
        else System.out.print("\nFiyat sıfırdan küçük olamaz");

    }
}
