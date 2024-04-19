package com.doratron.wallet.ui.representative;

import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class RepresentativeActivityModule {

    @Binds
    public abstract RepresentativeView view(RepresentativeActivity representativeActivity);

    @Provides
    static RepresentativePresenter provideRepresentativePresenter(RepresentativeView view, Tron tron,
            WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers) {
        return new RepresentativePresenter(view, tron, walletAppManager, rxJavaSchedulers);
    }
}
