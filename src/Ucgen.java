import java.util.Scanner;
public class Ucgen {
    static void main(String[] args) {
        double a,b,c,u,alan,cevre,alan2;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen üçgenin bir uzunluğunu giriniz");
        a=inp.nextDouble();
        System.out.println("Lütfen üçgenin bir uzunluğunu giriniz");
        b=inp.nextDouble();
        System.out.println("Lütfen üçgenin bir uzunluğunu giriniz");
        c=inp.nextDouble();
        u=(a+b+c)/2;
        cevre = 2*u;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:"+alan+"\nÜçgenin Çevresi:"+cevre);
    }
}
