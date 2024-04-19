package com.doratron.wallet.ui.login;

import com.doratron.wallet.common.CustomPreference;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class LoginActivityModule {

    @Binds
    public abstract LoginView view(LoginActivity loginActivity);

    @Provides
    static LoginPresenter provideLoginPresenter(LoginView loginView, Tron tron,
            WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers,
            CustomPreference customPreference) {
        return new LoginPresenter(loginView, tron, walletAppManager, rxJavaSchedulers, customPreference);
    }
}
