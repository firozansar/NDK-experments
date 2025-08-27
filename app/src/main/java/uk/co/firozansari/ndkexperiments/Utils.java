package uk.co.firozansari.ndkexperiments;

import android.util.Base64;

public class Utils {

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
