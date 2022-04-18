import java.util.ArrayList;
import java.util.List;

public class Q2_Random {
    public static void main(String[] args) {

        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemaının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        List<Integer> list = new ArrayList<Integer>();
        // list.add(10);
        // list.add(14);
        // list.add(17);
        // list.add(14);
        // list.add(19);
        // list.add(11);
        // list.add(18);
        // list.add(23);
        // list.add(27);
        // list.add(34);

        randomEkle(list);


    }

    private static void randomEkle(List<Integer> list) {

        for (int i = 0; i < 10 ; i++) {
            // Math.random classi double veri tipindedir.
            // int e cast yapmamaiz lazim
            // random() methodu 0-1 arasi sayi uretir.
            list.add((int)(Math.random() *20)); // 0-20 arasi random sayi ekler
        }
        int sayac =0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0) {
                list.set(i,111);
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println("Listede cift sayi yoktur.");
        }
        System.out.println(list);

    }
}
