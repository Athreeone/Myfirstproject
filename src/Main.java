import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] array = new int[]{1, 3, 4, 5, 2134, 12412, 65, 12312, 45124, 123412, 541212, 12};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max) {
                max = array[i];

        }
           if (array[i]<min) {
                min = array[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

}
