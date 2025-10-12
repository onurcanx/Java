import java.util.Scanner;

public class AsalSayi {
    static boolean isAsal(int x, int bolen) {
        if (x < 2) return false;        // 0 ve 1 asal değil
        if (bolen == 1) return true;    // 1'e kadar bölen bulunmadıysa asaldır
        if (x % bolen == 0) return false; // tam bölünüyorsa asal değildir
        return isAsal(x, bolen - 1);    // bir küçüğüyle kontrol et
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int x = sc.nextInt();

        if (isAsal(x, x / 2))
            System.out.println(x + " sayısı asaldır.");
        else
            System.out.println(x + " sayısı asal değildir.");
    }
}
