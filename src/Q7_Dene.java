import java.util.Scanner;

public class Q7_Dene {
    public static void main(String[] args) {
/*
  AtbashCode ; bir metni şifrelemek veya şifresini çözmek
  için İbrani alfabesine temelli basit bir yöntemdir.
  Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
  "abcdefghijklmnopqrstuvwxyz"; 26 harf
  "zyxwvutsrqponmlkjihgfedcba";
 */

       Scanner scan =  new Scanner(System.in);
       System.out.println(" Sifrelenecek ifadeyi giriniz : ");
       String ifade = scan.nextLine().toLowerCase();

       String alfabe = "abcdefghijklmnopqrstuvwxyz";
       String yeni="";
        for (int i = 0; i < ifade.length(); i++) {
       yeni+=alfabe.length()-(alfabe.indexOf(ifade.substring(i,i+1)));

        }
        System.out.println(yeni);
        System.out.println(alfabe.substring(alfabe.length()-5));
    }
}
