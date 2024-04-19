package com.doratron.wallet.ui.main;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.common.CustomPreference;
import com.doratron.wallet.database.AppDatabase;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {

    @Binds
    public abstract MainView view(MainActivity mainActivity);

    @Provides
    static MainPresenter provideMainPresenter(MainView mainView, Tron tron, WalletAppManager walletAppManager,
            TronNetwork tronNetwork, RxJavaSchedulers rxJavaSchedulers, CustomPreference customPreference,
            AppDatabase appDatabase) {
        return new MainPresenter(mainView, tron, walletAppManager, tronNetwork, rxJavaSchedulers,
                customPreference, appDatabase);
    }
}
