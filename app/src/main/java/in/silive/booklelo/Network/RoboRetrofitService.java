package in.silive.booklelo.Network;

import in.silive.booklelo.Utils.Config;

/**
 * Created by akriti on 13/9/16.
 */
public class RoboRetrofitService extends RetrofitGsonSpiceService {

    @Override
    public void onCreate() {
        addRetrofitInterface(BookLeLo.class);
        super.onCreate();
    }

    @Override
    protected String getServerUrl() {
        return Config.BASE_URL;
    }

}
