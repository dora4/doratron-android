package com.doratron.wallet.ui.accountdetail.overview;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class OverviewFragmentModule {

    @Binds
    public abstract OverviewView view(OverviewFragment fragment);

    @Provides
    static OverviewPresenter provideOverviewPresenter(OverviewView view, Tron tron,  TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new OverviewPresenter(view, tron, tronNetwork, rxJavaSchedulers);
    }
}