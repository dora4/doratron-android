package com.doratron.wallet.ui.token;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class TokenActivityModule {

    @Binds
    public abstract TokenView view(TokenActivity tokenActivity);

    @Provides
    static TokenPresenter provideTokenPresenter(TokenView view, Tron tron, TronNetwork tronNetwork,
            WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers) {
        return new TokenPresenter(view, tron, tronNetwork, walletAppManager, rxJavaSchedulers);
    }
}
