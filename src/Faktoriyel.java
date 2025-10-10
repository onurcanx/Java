import java.util.Scanner;
public class Faktoriyel {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n,r,fac=1,fac3=1,fac2=1;
        System.out.print("Sayı giriniz :");
        n= sc.nextInt();
        System.out.print("Sayı giriniz :");
        r= sc.nextInt();
        for(int i=1;n>=i ;i++)
        {
            fac*=i;
        }
        for(int j=1;r>=j ;j++)
        {
            fac2*=j;
        }
        for(int k=1;(n-r)>=k ;k++)
        {
            fac3*=k;
        }
        System.out.println(fac+"\n"+fac2+"\n"+fac3);
        System.out.println(fac/(fac2*fac3));


    }
}
