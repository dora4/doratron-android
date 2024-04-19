package com.doratron.wallet.ui.sendtrc10;

import com.doratron.wallet.common.Constants;
import com.doratron.wallet.database.model.Trc10AssetModel;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.exception.InvalidAddressException;
import com.doratron.wallet.tron.exception.InvalidPasswordException;
import com.doratron.wallet.ui.main.dto.Asset;
import com.doratron.wallet.ui.mvp.BasePresenter;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class SendTrc10Presenter extends BasePresenter<SendTrc10View> {

    private Tron mTron;
    private RxJavaSchedulers mRxJavaSchedulers;

    public SendTrc10Presenter(SendTrc10View view, Tron tron, RxJavaSchedulers rxJavaSchedulers) {
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
        mTron.queryAccount(mTron.getLoginAddress())
            .subscribeOn(mRxJavaSchedulers.getIo())
            .map(account -> {
                List<Asset> assets = new ArrayList<>();

                assets.add(Asset.builder()
                        .name(Constants.TRON_SYMBOL)
                        .displayName(Constants.TRON_SYMBOL)
                        .balance(((double) account.getBalance()) / Constants.ONE_TRX)
                        .build());

                for (String key : account.getAssetV2Map().keySet()) {
                    Trc10AssetModel trc10Asset = mTron.getTrc10Asset(key);

                    assets.add(Asset.builder()
                            .name(key)
                            .displayName("[" + key + "]" + trc10Asset.getName())
                            .balance(trc10Asset.getPrecision() > 0 ?
                                    account.getAssetV2Map().get(key) / Math.pow(10, trc10Asset.getPrecision())
                                    : account.getAssetV2Map().get(key))
                            .precision(trc10Asset.getPrecision())
                            .build());
                }

                return assets;
            })
            .observeOn(mRxJavaSchedulers.getMainThread())
            .subscribe(assets -> {
                mView.displayAccountInfo(assets);
            }, e -> e.printStackTrace());
    }

    @Override
    public void onDestroy() {

    }

    public void sendTron(String password, String toAddress, long amount) {
        if (!mTron.isLogin()) {
            mView.invalidPassword();
            return;
        }

        mTron.sendCoin(password, toAddress, amount)
        .subscribeOn(mRxJavaSchedulers.getIo())
        .observeOn(mRxJavaSchedulers.getMainThread())
        .subscribe(new SingleObserver<Boolean>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(Boolean result) {
                mView.sendTokenResult(result);
            }

            @Override
            public void onError(Throwable e) {
                if (e instanceof InvalidAddressException) {
                    mView.invalidAddress();
                } else if (e instanceof InvalidPasswordException) {
                    mView.invalidPassword();
                } else if (e instanceof RuntimeException) {
                    mView.connectionError();
                } else {
                    e.printStackTrace();
                }
            }
        });
    }

    public void transferAsset(String password, String toAddress, String assetName, long amount) {
        if (!mTron.isLogin()) {
            mView.invalidPassword();
            return;
        }

        mTron.transferAsset(password, toAddress, assetName, amount)
        .subscribeOn(mRxJavaSchedulers.getIo())
        .observeOn(mRxJavaSchedulers.getMainThread())
        .subscribe(new SingleObserver<Boolean>() {

            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onSuccess(Boolean result) {
                mView.sendTokenResult(result);
            }

            @Override
            public void onError(Throwable e) {
                if (e instanceof InvalidAddressException) {
                    mView.invalidAddress();
                } else if (e instanceof InvalidPasswordException) {
                    mView.invalidPassword();
                } else if (e instanceof RuntimeException) {
                    mView.connectionError();
                } else {
                    e.printStackTrace();
                }
            }
        });
    }
}
