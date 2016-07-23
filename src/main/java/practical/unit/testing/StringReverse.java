package practical.unit.testing;


import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static String reverse(String s) throws IllegalArgumentException {
        if(s == null) {
            throw new IllegalArgumentException("Parameter is null!");
        }

        return new StringBuilder(s).reverse().toString();
    }

}
