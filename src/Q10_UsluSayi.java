import java.util.Scanner;

public class Q10_UsluSayi {
    public static void main(String[] args) {

        //Get 2 numbers from the user.
//first number base
//second number Top
//Write a code that calculates the prime of a number.
// 2, 3 --> 2^3 = 2*2*2= 8

// 4, 3 --> 4^3= 4*4*4 = 64

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter base number : \nPlease enter top number :");
        int base = scan.nextInt();
        int top = scan.nextInt();

        int sonuc = 1;
        if (base==0){
            System.out.println("sonuc = "+0);
        } else if (top==0){
            System.out.println("sonuc = "+1);
        } else {
            for (int i = 1; i <= top; i++) {
                sonuc*=base;

            }
            System.out.println(sonuc);
        }


    }
}
