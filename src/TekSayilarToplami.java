import java.util.Scanner; class TekSayilarToplami {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        Negatif bir değer girilene kadar
         kullanıcıdan girişleri kabul eden ve girilen değerlerden
        tek sayıları toplayıp ekrana basan program .
        */

        /*

        int sayi,tekSayilar=0;
        do {
            System.out.print("Sayı giriniz :");
            sayi=sc.nextInt();
            if(sayi%2==1) tekSayilar+=sayi;
        }
        while (sayi>0);
        System.out.println(tekSayilar);

        */


        /*
        tek bir sayı girilene kadar kullanıcıdan girişleri
        kabul eden ve girilendeğerlerden çift ve 4'ün katları olan
        sayıları toplayıp ekrana basan programı
         */

        int sayi,tekSayilar=0;
        do {
            System.out.print("Sayı giriniz :");
            sayi=sc.nextInt();
            if(sayi%2==0 && sayi%4==0) tekSayilar+=sayi;
        }
        while (sayi%2==0);
        System.out.println(tekSayilar);
    }
}
