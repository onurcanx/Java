import java.util.Scanner;
public class DoWhileLogin {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean askPassword=true;
        int password=123;
        do
        {
            System.out.println("Şifreyi Giriniz :");
            password=input.nextInt();
            if (password==123)
                {
                    System.out.println("Şifre Doğru");
                    askPassword=false;
                }
            else  System.out.println("Şifre Yanlış");
        }
        while (askPassword);

    }
}
