import java.util.Arrays;
import java.util.Scanner;

public class Q3_EkCzm {
    public static void main(String[] args) {

        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

        Scanner scan=new Scanner(System.in);
        String metin = scan.nextLine().toLowerCase();

        hackerEkDili(metin);

    }

    private static void hackerEkDili(String metin) {
        String arr[] =new String[metin.length()];

        for (int i = 0; i < metin.length(); i++) {
            arr[i]=metin.substring(i,i+1);
            // System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("a")){
                arr[i]="4";
            }

            if (arr[i].contains("e")){
                arr[i]="3";
            }

            if (arr[i].contains("i")){
                arr[i]="1";
            }
            if (arr[i].contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);
        }

    }
}
