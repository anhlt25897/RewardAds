package com.a.arthurrewardads.AdsServices;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/**
 * @arthur @labialabs
 */

public class AdsLoader implements AdsActions {
    //region CONSTRUCTORS
    private AdsLoader() {
    }

    private AdsLoader(Activity activity) {
        this.mContext = activity;
    }

    public static AdsActions getInstance(Activity activity, String appId) {
        if (mInstance == null) {
            mInstance = new AdsLoader(activity);
            MobileAds.initialize(activity, appId);
        }
        return mInstance;
    }
    //endregion

    //region VIEW EVENTS
    @Override
    public AdsActions setupAds(BaseAdsEventListener listener) {
        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(mContext);
        mRewardedVideoAd.setRewardedVideoAdListener(listener);
        return this;
    }

    @Override
    public AdsActions loadAds(String adId) {
        mRewardedVideoAd.loadAd(adId, new AdRequest.Builder().build());
        return this;
    }

    @Override
    public void showAds() {
        // Show the ad if it's ready. Otherwise toast and reload the ad.
        if (mRewardedVideoAd != null && mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();
        } else if (mListener != null) {
            mListener.onVideoAdNotLoad();
            Log.i(TAG, "Ads not show because not loaded or null");
        }
    }

    @Override
    public void pause(Context context) {
        mRewardedVideoAd.pause(context);
    }

    @Override
    public void destroy(Context context) {
        mRewardedVideoAd.destroy(context);
    }

    @Override
    public void resume(Context context) {
        mRewardedVideoAd.resume(context);
    }
    //endregion

    //region VARS
    public static class BaseAdsEventListener implements RewardedVideoAdListener {
        public void onVideoAdNotLoad() {
        }

        @Override
        public void onRewardedVideoAdLoaded() {
        }

        @Override
        public void onRewardedVideoAdOpened() {
        }

        @Override
        public void onRewardedVideoStarted() {
        }

        @Override
        public void onRewardedVideoAdClosed() {
        }

        @Override
        public void onRewarded(RewardItem rewardItem) {
        }

        @Override
        public void onRewardedVideoAdLeftApplication() {
        }

        @Override
        public void onRewardedVideoAdFailedToLoad(int i) {
        }

        @Override
        public void onRewardedVideoCompleted() {
        }
    }

    private final String TAG = "AdsLoader";
    private static AdsActions mInstance;
    private Activity mContext;
    private RewardedVideoAd mRewardedVideoAd;
    private BaseAdsEventListener mListener;
    //endregion
}
