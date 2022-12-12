import java.util.Scanner;

public class algoritma {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sayi1,sayi2;

        System.out.print("1. sayisi giriniz: ");
        sayi1=s.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        sayi2=s.nextInt();

        if (sayi1<sayi2){
            for (int i=0; i<sayi2; i++ ){
                sayi1++;
            }
            System.out.println("Toplama sonucu: "+sayi1);
        }else {
            for (int i=0; i<sayi1; i++){
                sayi2++;
            }
            System.out.println("Toplama sonucu: "+sayi2);
        }
    }
}
