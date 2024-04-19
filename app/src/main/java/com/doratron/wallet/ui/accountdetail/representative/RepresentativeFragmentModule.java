package com.doratron.wallet.ui.accountdetail.representative;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class RepresentativeFragmentModule {

    @Binds
    public abstract RepresentativeView view(RepresentativeFragment fragment);

    @Provides
    static RepresentativePresenter provideRepresentativePresenter(RepresentativeView view, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new RepresentativePresenter(view, tronNetwork, rxJavaSchedulers);
    }
}