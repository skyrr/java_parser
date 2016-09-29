import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by sky on 18.09.2016.
 */
public class Dispatcher {
    public static void main(String[] args) {
        String[] s = {"aobbbb", "Dickbbb", "Jack", "Serhiy", "Mariya", "ann", "Nick"};
        //Arrays.sort(s);
        System.out.println("Original text:");
        System.out.println(Arrays.toString(s));
        System.out.println("Converted text:");
        //System.out.println(s[0]);
        for (int a = 0; a < s.length; a++) {
            for (int i = 0; i < s[a].length(); i++) {
                System.out.print(s[a].charAt(i) + "  ");
            }
        }
        System.out.println();
        for (int a = 0; a < s.length; a++) {
            for (int i = 0; i < s[a].length(); i++) {
                int codePoint = s[a].codePointAt(i);
                //String hexim = Integer.toHexString(codePoint);
                codePoint = codePoint - 96;
                if (codePoint < 0) {
                    codePoint = codePoint + 32;
                }
                if (codePoint < 10) {
                    System.out.print(codePoint + "  ");
                } else {
                    System.out.print(codePoint + " ");
                }
            }
        }
        System.out.println();

    }
}
