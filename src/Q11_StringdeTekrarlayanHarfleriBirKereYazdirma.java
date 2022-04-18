import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q11_StringdeTekrarlayanHarfleriBirKereYazdirma {
    public static void main(String[] args) {
       /* Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
        */

        String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));

        List<String> output = new ArrayList<String>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    if (!output.contains(arr[j])) {
                        output.add(arr[i]);
                    }

                }
            }

        }
        System.out.println(output);

    }


}

