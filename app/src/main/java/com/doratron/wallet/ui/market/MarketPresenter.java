package com.doratron.wallet.ui.market;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.ui.mvp.BasePresenter;

/**
 * Created by user on 2018. 5. 24..
 */

public class MarketPresenter extends BasePresenter<MarketView> {

    private TronNetwork mTronNetwork;
    private RxJavaSchedulers mRxJavaSchedulers;

    public MarketPresenter(MarketView view, TronNetwork tronNetwork, RxJavaSchedulers rxJavaSchedulers) {
        super(view);
        this.mTronNetwork = tronNetwork;
        this.mRxJavaSchedulers = rxJavaSchedulers;
    }

    @Override
    public void onCreate() {
        loadMarket();
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

    private void loadMarket() {
        mView.showLoadingDialog();

        this.mTronNetwork
        .getMarkets()
        .subscribeOn(mRxJavaSchedulers.getIo())
        .observeOn(mRxJavaSchedulers.getMainThread())
        .subscribe(
                markets -> mView.marketDataLoadSuccess(markets),
                t -> mView.showServerError()
        );
    }
}
