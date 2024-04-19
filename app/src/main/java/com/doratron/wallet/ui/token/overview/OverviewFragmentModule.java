package com.doratron.wallet.ui.token.overview;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class OverviewFragmentModule {

    @Binds
    public abstract OverviewView view(OverviewFragment fragment);

    @Provides
    static OverviewPresenter provideHolderPresenter(OverviewView view, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new OverviewPresenter(view, tronNetwork, rxJavaSchedulers);
    }
}