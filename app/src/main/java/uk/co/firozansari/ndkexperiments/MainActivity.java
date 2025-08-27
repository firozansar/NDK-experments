package uk.co.firozansari.ndkexperiments;

import android.os.Bundle;
import android.util.Base64;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "NATIVE_APP";
    TextView hellotv, keytv;

    static {
        System.loadLibrary("native-lib");
    }

    public native String getndkstring(String value);
    public native String getNativeKey();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hellotv = (TextView) findViewById(R.id.tv);
        hellotv.setText(getndkstring("World"));

        keytv = (TextView) findViewById(R.id.key);
        keytv.setText(Utils.decode(getNativeKey()));
    }
}
