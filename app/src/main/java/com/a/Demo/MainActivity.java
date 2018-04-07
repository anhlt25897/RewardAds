package com.a.Demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private static final int START_LEVEL = 1;
//    private int mLevel;
//    private Button mNextLevelButton;
//    private TextView mLevelTextView;
//    private AdsActions adsActions;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        adsActions = AdsLoader.getInstance(this, "ca-app-pub-3940256099942544/5224354917");
//        adsActions.setupAds(new AdsLoader.BaseAdsEventListener() {
//            @Override
//            public void onVideoAdNotLoad() {
//                super.onVideoAdNotLoad();
//            }
//
//            @Override
//            public void onRewardedVideoAdLoaded() {
//                super.onRewardedVideoAdLoaded();
//                mNextLevelButton.setEnabled(true);
//            }
//
//            @Override
//            public void onRewarded(RewardItem rewardItem) {
//                super.onRewarded(rewardItem);
//            }
//
//            @Override
//            public void onRewardedVideoAdFailedToLoad(int i) {
//                super.onRewardedVideoAdFailedToLoad(i);
//            }
//
//            @Override
//            public void onRewardedVideoAdClosed() {
//                goToNextLevel();
//            }
//        });
//        // Create the next level button, which tries to show an interstitial when clicked.
//        mNextLevelButton = findViewById(R.id.next_level_button);
//        mNextLevelButton.setEnabled(false);
//        mNextLevelButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                adsActions.showAds();
//                mNextLevelButton.setEnabled(false);
//            }
//        });
//
//        // Create the text view to show the level number.
//        mLevelTextView = findViewById(R.id.level);
//        mLevel = START_LEVEL;
//
//        adsActions.loadAds("ca-app-pub-3940256099942544/5224354917");
//    }
//
//    @Override
//    public void onResume() {
//        adsActions.resume(this);
//        super.onResume();
//    }
//
//    @Override
//    public void onPause() {
//        adsActions.pause(this);
//        super.onPause();
//    }
//
//    @Override
//    public void onDestroy() {
//        adsActions.destroy(this);
//        super.onDestroy();
//    }
//
//    private void goToNextLevel() {
//        // Show the next level and reload the ad to prepare for the level after.
//        mLevelTextView.setText("Level " + (++mLevel));
//        adsActions.loadAds("ca-app-pub-3940256099942544/5224354917");
//    }
}
