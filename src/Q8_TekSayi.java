import java.util.Scanner;

public class Q8_TekSayi {
    public static void main(String[] args) {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Tek indexlerini gormek istediginiz ifadeyi giriniz : ");
        String ifade = scan.nextLine();

        // 1.yol
        for (int i = 0; i < ifade.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(ifade.substring(i, i + 1) + " ");
            }
        }
        //2.yol ( bu ascıı de ki degerlere gore tekleri yazdiriyor )
        for (char i = 'a'; i <= 'z'; i++) {
            if ((Character.valueOf(i)) % 2 == 1) {
                System.out.print(i);
            }
        }
        // 3.yol


    }
}
