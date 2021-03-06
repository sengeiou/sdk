package com.analytics.sdk.client.video;

import com.analytics.sdk.client.AdCommonListener;
import com.analytics.sdk.client.AdError;
import com.analytics.sdk.client.AdListeneable;

public interface RewardVideoAdListener extends AdCommonListener {

    /**
     * 广告被点击时调用，不代表满足计费条件（如点击时网络异常）
     */
    void onAdClicked();

    /**
     * 广告成功展示时调用，成功展示不等于有效展示
     */
    void onAdShow();

    /**
     * 广告视频播放完成
     */
    void onAdVideoCompleted();

    /**
     * 广告曝光时调用，此处的曝光不等于有效曝光（如展示时长未满足）
     */
    void onAdExposure();

    /**
     * 	广告关闭时调用，可能是用户关闭或者展示时间到。此时一般需要跳过开屏的 Activity，进入应用内容页面
     */
    void onAdDismissed();

}
