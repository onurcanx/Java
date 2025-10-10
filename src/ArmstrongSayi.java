import java.util.Scanner;

public class ArmstrongSayi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;


        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Basamak Sayısı :"+basNumber);

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            System.out.println(basValue);
            result+=basValue;
            // 1*1*1*1 = 1^4
//            for (int i = 1; i <= basNumber; i++) {
//                System.out.println(basValue);
//            }
            tempNumber /= 10;
        }
        System.out.println(result);
    }
}
