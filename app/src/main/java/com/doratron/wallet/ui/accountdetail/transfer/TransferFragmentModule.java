package com.doratron.wallet.ui.accountdetail.transfer;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class TransferFragmentModule {

    @Binds
    public abstract TransferView view(TransferFragment fragment);

    @Provides
    static TransferPresenter provideTransferPresenter(TransferView view, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new TransferPresenter(view, tronNetwork, rxJavaSchedulers);
    }
}