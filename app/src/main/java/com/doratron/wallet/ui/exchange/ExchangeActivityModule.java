package com.doratron.wallet.ui.exchange;

import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ExchangeActivityModule {

    @Binds
    public abstract ExchangeView view(ExchangeActivity exchangeActivity);

    @Provides
    static ExchangePresenter provideExchangePresenter(ExchangeView view, Tron tron, RxJavaSchedulers rxJavaSchedulers) {
        return new ExchangePresenter(view, tron, rxJavaSchedulers);
    }
}
