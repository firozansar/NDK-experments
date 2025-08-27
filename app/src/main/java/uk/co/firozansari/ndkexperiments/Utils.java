package uk.co.firozansari.ndkexperiments;

import android.util.Base64;

/**
 * Created by firoz on 14/07/2017.
 */

public class Utils {
    /**
     * @param input
     * @return decoded string
     */
    public static String decode(String input) {
        String text = "";
        try {
            byte[] data = Base64.decode(input, Base64.DEFAULT);
            text = new String(data, "UTF-8");
            return text;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }

}
