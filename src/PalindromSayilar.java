import java.util.Scanner;
public class PalindromSayilar {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0)
        {
            System.out.println();
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(reverseNumber==number)
        {

            System.out.println("Palindrom sayıdır");
            return true;
        }
        else return false;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayı gir :");
        int number= sc.nextInt();
        isPalindrom(number);
    }
}
