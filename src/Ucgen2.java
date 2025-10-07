import java.util.Scanner;
public class Ucgen2 {
    static void main(String[] args) {
        double a,b,c,alan;
        Scanner inp= new Scanner(System.in);
        System.out.println("Lütfen dik üçgenin bir uzunluğunu giriniz:");
        a=inp.nextDouble();
        System.out.println("Lütfen dik üçgenin bir uzunluğunu giriniz:");
        b=inp.nextDouble();
        c=Math.sqrt((a*a)+(b*b));
        alan=(a*b)/2;
        System.out.println("Üçgenin hipotenüs uzunluğu:"+c+"\nÜçgenin Alanı:"+alan);
    }
}
