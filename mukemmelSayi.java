import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,toplam=0;
        System.out.print("kontrol etmek istediğiniz sayıyı giriniz:");
        sayi=input.nextInt();
        for(int i=1; i<=(sayi/2);i++) {
            if(sayi%i==0) {
                toplam+=i;

            }
        }
        if(sayi==toplam) {
            System.out.println("Girilen sayı mükemmel sayıdır..");
        }else{
            System.out.println("Girilen sayı mükemmel sayı değildir..");
        }
    }
}
