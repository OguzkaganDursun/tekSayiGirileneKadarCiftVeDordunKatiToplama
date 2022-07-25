import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int sayi, toplam = 0;

        //Kullanicidan veri girisi alindi ve istenilen deger girilene kadar veri islendi.
        System.out.println("-----------------------------\nMerhaba! \nGirdiginiz tum sayilar toplanacaktir." +
                "\nProgrami sonlandirmak icin tek sayi giriniz.\n-----------------------------");

        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("Toplamak Istediginiz Sayiyi Giriniz : ");
            sayi = scan.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0)
            {
                toplam += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.println("Girdiginiz Sayilarin Toplami : " + toplam);

    }
}
