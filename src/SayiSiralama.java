import java.util.Scanner;
public class SayiSiralama {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b ,c;
        System.out.println("Lütfen bir sayı giriniz");
        a= sc.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        b= sc.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        c= sc.nextInt();
        if(a<b && a<c)
        {
            if(b<c) System.out.println(a+"<"+b+"<"+c);
            else System.out.println(a+"<"+c+"<"+b);
        }
        else if (b<a && b<c) {
            if(a<c) System.out.println(b+"<"+a+"<"+c);
            else System.out.println(b+"<"+c+"<"+a);

        }
        else if (c<a && c<b)
        {
            if(a<b) System.out.println(c+"<"+a+"<"+b);
            else System.out.println(c+"<"+b+"<"+a);

        }
    }
}
