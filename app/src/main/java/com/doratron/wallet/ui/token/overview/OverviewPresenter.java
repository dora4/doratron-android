package com.doratron.wallet.ui.token.overview;

import android.support.annotation.NonNull;

import com.doratron.tronlib.TronNetwork;
import com.doratron.tronlib.dto.Token;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.ui.mvp.BasePresenter;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class OverviewPresenter extends BasePresenter<OverviewView> {


    private TronNetwork mTronNetwork;
    private RxJavaSchedulers mRxJavaSchedulers;

    public OverviewPresenter(OverviewView view, TronNetwork tronNetwork, RxJavaSchedulers rxJavaSchedulers) {
        super(view);
        this.mTronNetwork = tronNetwork;
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

    public void loadTokenInfo(@NonNull String tokenName) {
        mView.showLoadingDialog();

        mTronNetwork
                .getTokenDetail(tokenName)
                .observeOn(mRxJavaSchedulers.getMainThread())
                .subscribe(new SingleObserver<Token>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(Token token) {
                        mView.tokenInfoLoadSuccess(token);
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.showServerError();
                    }
                });
    }
}
