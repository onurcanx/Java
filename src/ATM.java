import java.util.Scanner;
public class ATM {
    static void main(String[] args) {
    String username,password;
    Scanner sc=new Scanner(System.in);
    int right=3,secim;
    double bakiye=3546.98;

    while (right>0)
        {
            System.out.println("Kullanıcı adınızı giriniz");
            username= sc.nextLine();
            System.out.println("Şifrenizi giriniz");
            password= sc.nextLine();
            if(username.equals("onurcan")&&password.equals("123456"))
            {
                boolean cikis=false;
                while (!cikis)
                {
                    System.out.println("Hoşgeldiniz.\nYapmak istediğini işlemi seçiniz.");
                    System.out.println("1-Para Çekme.\n2-Para Yatırma.\n3-Bakiye Sorgulama.\n4-Çıkış.");
                    secim= sc.nextInt();
                    switch (secim)
                    {
                        case 1:
                            System.out.println("Çekmek istediğiniz tutarı giriniz");
                            double tutar= sc.nextDouble();
                            if(bakiye>=tutar)System.out.println("Yeni bakiyeniz :"+(bakiye-tutar));
                            else System.out.println("Bakiye yetersiz ");
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz tutarı giriniz:");
                            double yatirilan = sc.nextDouble();
                            bakiye += yatirilan;
                            System.out.println("Yeni bakiyeniz: " + bakiye);
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            right=-1;
                            cikis = true;
                            break;
                        default:
                            System.out.println("Geçersiz seçim!");
                    }
                }
            }
            else
            {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0)
                {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }
                else
                {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
