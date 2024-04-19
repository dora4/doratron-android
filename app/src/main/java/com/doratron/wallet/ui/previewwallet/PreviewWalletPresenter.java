package com.doratron.wallet.ui.previewwallet;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.common.AdapterDataModel;
import com.doratron.wallet.database.model.AccountModel;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.ui.mvp.BasePresenter;

public class PreviewWalletPresenter extends BasePresenter<PreviewWalletView> {

    private Tron mTron;
    private TronNetwork mTronNetwork;
    private RxJavaSchedulers mRxJavaSchedulers;
    private AdapterDataModel<AccountModel> mAdapterDataModel;

    public PreviewWalletPresenter(PreviewWalletView view, Tron tron, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        super(view);
        this.mTron = tron;
        this.mTronNetwork = tronNetwork;
        this.mRxJavaSchedulers = rxJavaSchedulers;
    }

    public void setAdapterDataModel(AdapterDataModel<AccountModel> adapterDataModel) {
        this.mAdapterDataModel = adapterDataModel;
    }

    @Override
    public void onCreate() {
        refreshAccount();
    }

    public void refreshAccount() {
        mTron.getAccountList()
                .subscribeOn(mRxJavaSchedulers.getIo())
                .observeOn(mRxJavaSchedulers.getMainThread())
                .subscribe(accountList -> {
                    mAdapterDataModel.clear();
                    mAdapterDataModel.addAll(accountList);
                    mView.finishRefresh();
                }, e -> mView.finishRefresh());
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
