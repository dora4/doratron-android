package com.doratron.wallet.ui.mytransfer;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.TokenManager;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyTransferActivityModule {

    @Binds
    public abstract TransferView view(TransferActivity transferActivity);

    @Provides
    static TransferPresenter provideTransferPresenter(TransferView transferView, Tron tron,
            TronNetwork tronNetwork, TokenManager tokenManager, RxJavaSchedulers rxJavaSchedulers) {
        return new TransferPresenter(transferView, tron, tronNetwork, tokenManager, rxJavaSchedulers);
    }
}
