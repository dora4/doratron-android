package com.doratron.wallet.ui.intro;

import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class IntroActivityModule {

    @Binds
    public abstract IntroView view(IntroActivity introActivity);

    @Provides
    static IntroPresenter provideIntroPresenter(IntroView introView, Tron tron,
            WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers) {
        return new IntroPresenter(introView, tron, walletAppManager, rxJavaSchedulers);
    }
}
