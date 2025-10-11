import java.util.Scanner;
public class UcgenYildiz {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Bir sayı giriniz :");
        n= input.nextInt();
        for(int i=0;i<=n;i++)
        {
//            for(int j=n-1;i+j>=n;j--)
//            {
//                System.out.print("*");
//            }

            for(int j=0;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
