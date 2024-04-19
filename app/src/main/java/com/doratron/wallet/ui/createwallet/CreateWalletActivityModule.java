package com.doratron.wallet.ui.createwallet;

import com.doratron.wallet.common.CustomPreference;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class CreateWalletActivityModule {

    @Binds
    public abstract CreateWalletView view(CreateWalletActivity createWalletActivity);

    @Provides
    static CreateWalletPresenter provideCreateWalletPresenter(CreateWalletView createWalletView,
            Tron tron, RxJavaSchedulers rxJavaSchedulers, CustomPreference customPreference) {
        return new CreateWalletPresenter(createWalletView, tron, rxJavaSchedulers, customPreference);
    }
}
