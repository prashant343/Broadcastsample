package iotapps.broadcastsample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Log;

/**
 * Created by prashantkaushik on 17/03/17.
 */


public class samplereceiver extends BroadcastReceiver {

    String TAG = getClass().getSimpleName();
    private Context mContext;

    @Override
    public void onReceive(Context context, Intent intent) {

        //mContext = context;
        if (intent.getAction().equalsIgnoreCase(WifiManager.WIFI_STATE_CHANGED_ACTION))
        {
            int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);
            if (wifiState == WifiManager.WIFI_STATE_DISABLED)
            {
                Log.e(TAG, " ----- Wifi  Disconnected ----- ");
            }

        }

        if(intent.getAction().equalsIgnoreCase("com.pk.CUSTOM_INTENT")) {
            Log.e(TAG, " ----- Received Custom Event ----- ");
        }


    }
}