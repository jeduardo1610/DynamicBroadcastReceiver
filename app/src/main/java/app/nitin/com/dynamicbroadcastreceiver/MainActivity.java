package app.nitin.com.dynamicbroadcastreceiver;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SystemBroadcast systemBroadcast = new SystemBroadcast();
    static final String ACTION =  "android.intent.action.AIRPLANE_MODE";
    IntentFilter iF = new IntentFilter(ACTION);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerReceiver(systemBroadcast, iF);

    }
}
