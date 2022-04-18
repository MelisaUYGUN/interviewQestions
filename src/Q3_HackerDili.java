import java.util.Scanner;

public class Q3_HackerDili {
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

       hackerDili(metin);

    }

    private static void hackerDili(String metin) {

     // String arr [] = metin.split("");
     // System.out.println(Arrays.toString(arr));

        String newstr  = metin.replaceAll("a","4");
        String newstr1 = newstr.replaceAll("e","3");
        String newstr2 = newstr1.replaceAll("i","1");
        String newstr3 = newstr2.replaceAll("o","0");

        System.out.println(newstr3);
            }

        }

