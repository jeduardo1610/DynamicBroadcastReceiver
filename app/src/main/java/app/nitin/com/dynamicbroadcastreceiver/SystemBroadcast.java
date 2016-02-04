package app.nitin.com.dynamicbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by nitingeetasagardasari on 2/4/16.
 */
public class SystemBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "System Broadcast", Toast.LENGTH_LONG).show();
    }
}
