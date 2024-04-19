package com.doratron.wallet.ui.previewwallet;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PreviewWalletActivityModule {

    @Binds
    public abstract PreviewWalletView view(PreviewWalletActivity previewWalletActivity);

    @Provides
    static PreviewWalletPresenter providePreviewWalletPresenter(PreviewWalletView previewWalletView, Tron tron,
            TronNetwork tronNetwork, RxJavaSchedulers rxJavaSchedulers) {
        return new PreviewWalletPresenter(previewWalletView, tron, tronNetwork, rxJavaSchedulers);
    }
}
