package com.doratron.wallet.ui.myaccount;

import com.doratron.wallet.database.AppDatabase;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyAccountActivityModule {

    @Binds
    public abstract MyAccountView view(MyAccountActivity myAccountActivity);

    @Provides
    static MyAccountPresenter provideMyAccountPresenter(MyAccountView myAccountView, Tron tron,
            WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers, AppDatabase appDatabase) {
        return new MyAccountPresenter(myAccountView, tron, walletAppManager, rxJavaSchedulers,
                appDatabase);
    }
}
