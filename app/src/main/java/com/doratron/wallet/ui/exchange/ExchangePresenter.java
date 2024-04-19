package com.doratron.wallet.ui.exchange;

import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.ui.mvp.BasePresenter;

public class ExchangePresenter extends BasePresenter<ExchangeView> {

    private Tron mTron;
    private RxJavaSchedulers mRxJavaSchedulers;

    public ExchangePresenter(ExchangeView view, Tron tron, RxJavaSchedulers rxJavaSchedulers) {
        super(view);
        this.mTron = tron;
        this.mRxJavaSchedulers = rxJavaSchedulers;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }
}
