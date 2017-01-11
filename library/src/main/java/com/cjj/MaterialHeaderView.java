package com.cjj;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.widget.FrameLayout;

public abstract class MaterialHeaderView extends FrameLayout implements MaterialHeadListener {

    public MaterialHeaderView(Context context) {
        this(context, null);
    }

    public MaterialHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    protected abstract void init(AttributeSet attrs, int defStyle);

//    @Override
//    protected void onAttachedToWindow() {
//        super.onAttachedToWindow();
//        density = getContext().getResources().getDisplayMetrics().density;
//        materialWaveView = new MaterialWaveView(getContext());
//        materialWaveView.setColor(waveColor);
//        addView(materialWaveView);
//
//        circleProgressBar = new CircleProgressBar(getContext());
//        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) density * progressSize, (int) density * progressSize);
//        layoutParams.gravity = Gravity.CENTER;
//        circleProgressBar.setLayoutParams(layoutParams);
//        circleProgressBar.setColorSchemeColors(progress_colors);
//        circleProgressBar.setProgressStokeWidth(progressStokeWidth);
//        circleProgressBar.setShowArrow(isShowArrow);
//        circleProgressBar.setShowProgressText(textType == 0);
//        circleProgressBar.setTextColor(progressTextColor);
//        circleProgressBar.setProgress(progressValue);
//        circleProgressBar.setMax(progressValueMax);
//        circleProgressBar.setCircleBackgroundEnabled(isShowProgressBg);
//        circleProgressBar.setProgressBackGroundColor(progressBg);
//        addView(circleProgressBar);
//    }

    @Override
    public void onComlete(MaterialRefreshLayout materialRefreshLayout) {
        ViewCompat.setTranslationY(this, 0);
        ViewCompat.setScaleX(this, 0);
        ViewCompat.setScaleY(this, 0);

    }

    @Override
    public void onBegin(MaterialRefreshLayout materialRefreshLayout) {
        ViewCompat.setScaleX(this, 0.001f);
        ViewCompat.setScaleY(this, 0.001f);
    }

    @Override
    public void onPull(MaterialRefreshLayout materialRefreshLayout, float fraction) {
        float a = Util.limitValue(1, fraction);
        ViewCompat.setScaleX(this, a);
        ViewCompat.setScaleY(this, a);
        ViewCompat.setAlpha(this, a);
    }

    @Override
    public void onRelease(MaterialRefreshLayout materialRefreshLayout, float fraction) {

    }

    @Override
    public void onRefreshing(MaterialRefreshLayout materialRefreshLayout) {
    }

}
