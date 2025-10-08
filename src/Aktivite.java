import java.util.Scanner;
public class Aktivite {
    static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int heat;
      System.out.println("Sıcaklık değerini giriniz: ");
      heat=sc.nextInt();

      if(heat<5) System.out.println("Kayak yap");
      else if (heat >= 5 && heat <=25)
      {
          if (heat<=15) System.out.println("Sinemaya git");
          else System.out.println("Piknik");
      }
      else System.out.println("Yüzmeye yallah");
    }
}
