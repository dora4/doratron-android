package com.doratron.wallet.ui.sendtrc20;

import com.doratron.wallet.database.AppDatabase;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class SendTrc20ActivityModule {

    @Binds
    public abstract SendTrc20View view(SendTrc20Activity sendTrc20Activity);

    @Provides
    static SendTrc20Presenter provideRepresentativePresenter(SendTrc20View view, Tron tron,
            AppDatabase appDatabase, RxJavaSchedulers rxJavaSchedulers) {
        return new SendTrc20Presenter(view, tron, appDatabase, rxJavaSchedulers);
    }
}
