package com.a.arthurrewardads.AdsServices;

import android.content.Context;

/**
 * @arthur @labialabs
 */

public interface AdsActions {
    AdsActions setupAds(AdsLoader.BaseAdsEventListener listener);

    AdsActions loadAds(String adsUnitId);

    void showAds();

    void pause(Context context);

    void destroy(Context context);

    void resume(Context context);
}
