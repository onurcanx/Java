
import java.util.Scanner;
public class WhileLogin {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPassSuccess=true;
        int password;
        while(isPassSuccess)
        {
            System.out.print("\nLütfen Şifreyi Giriniz :");
            password= sc.nextInt();
            if(password==123)
            {
                System.out.println("Şire Doğru.");
                isPassSuccess=false;
            }
            else
            {
                System.out.println("Şifre Yanlış Tekrar Deneyin.");

            }
        }
    }

}
