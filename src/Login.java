import java.util.Scanner;
public class Login {
    static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String username,password;
        System.out.print("Kullanıcı adını giriniz:");
        username=inp.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password=inp.nextLine();
        if (username.equals("onurcanx") && password.equals("onur123") )
        {
            System.out.print("Hoşgeldin "+username);
        }
        else
        {
            System.out.print("Kullanıcı adı veya şifre hatalı");
        }

    }
}
