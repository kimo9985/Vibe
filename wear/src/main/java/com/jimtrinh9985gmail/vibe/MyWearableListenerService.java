package com.jimtrinh9985gmail.vibe;

import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.WearableListenerService;

/**
 * Created by Kimo on 8/17/2016.
 */
public class MyWearableListenerService extends WearableListenerService {

    public final String LOG_TAG = MyWearableListenerService.class.getSimpleName();

    public MyWearableListenerService() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDataChanged(DataEventBuffer dataEventBuffer) {
        super.onDataChanged(dataEventBuffer);
    }
}
