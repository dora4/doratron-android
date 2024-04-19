package com.doratron.wallet.ui.token.holder;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class HolderFragmentModule {

    @Binds
    public abstract HolderView view(HolderFragment fragment);

    @Provides
    static HolderPresenter provideHolderPresenter(HolderView view, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new HolderPresenter(view, tronNetwork, rxJavaSchedulers);
    }
}