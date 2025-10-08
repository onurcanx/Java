import java.util.Scanner;
public class ForgotPassword {
    static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password="123456",password2,newPassword;
        System.out.print("Şifrenizi giriniz :");
        password2= inp.nextLine();
        if(!password2.equals(password))
        {
            int secim;
            System.out.println("Şifreniz Yanlış Değiştirmek isterseniz 1e basın.\nDeğiştirmek istemezseniz herhangi bir sayı yazınız.");
            secim=inp.nextInt();
            inp.nextLine();   // Buffer Temizleme
            switch (secim)
            {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword= inp.nextLine();
                    if(newPassword.equals(password))
                    {
                        System.out.println("Eski şifreniz ile yeni şifreniz aynı olamaz");
                        break;
                    }
                    else System.out.println("Şifreniz başarıyla değiştirildi.");password = newPassword;
                    System.out.print(password+" "+password2+" "+newPassword);
                    break;
                default:
                    System.out.println("Sistemden çıkış yapılıryor");
            }
        }
        else System.out.print("Şifreniz doğru");
    }
}
