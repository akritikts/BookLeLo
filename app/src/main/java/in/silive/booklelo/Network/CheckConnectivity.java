package in.silive.booklelo.Network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by akriti on 13/9/16.
 */
public class CheckConnectivity {
    public static boolean isNetConnected(Context mContext) {
        ConnectivityManager cm =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo = cm.getActiveNetworkInfo();

        return netInfo != null &&
                netInfo.isConnectedOrConnecting();
    }
}
