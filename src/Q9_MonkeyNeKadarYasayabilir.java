public class Q9_MonkeyNeKadarYasayabilir {
    public static void main(String[] args) {

            /*
There is a lonely monkey in the island
He needs to eat 4 bananas every day
there are just 165 bananas in that island
Create following variables and find how many days
monkey can survive.
Use do while loop, increment and decrement and if statements
int numberOfBananas =165, survivalDays = 1;
boolean monkeyAlive = true;
*/      // 1.yol
        int numberOfBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

      do {
          numberOfBananas=numberOfBananas-4;
          survivalDays++;
          if (numberOfBananas<4){
              monkeyAlive=false;
          }
       } while (monkeyAlive);
        System.out.println(survivalDays);

        // 2.yol
        survivalDays=numberOfBananas/4;

    }
}