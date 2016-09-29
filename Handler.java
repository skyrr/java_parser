import java.util.Arrays;

/**
 * Created by sky on 17.09.2016.
 */
public class Handler {
    public static void main(String[] args) {
        String[] a = {"Ann", "Serg", "Andrew", "Mary", "Bohdan", "Bob", "Nick"};
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 3) {
                temp = new StringBuffer(a[i]);
                temp.setCharAt(3, 'A');
                a[i] = temp.toString();
                System.out.println(a[i]);
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
