package com.doratron.wallet.ui.market;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MarketActivityModule {

    @Binds
    public abstract MarketView view(MarketActivity marketActivity);

    @Provides
    static MarketPresenter provideMarketPresenter(MarketView marketView, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new MarketPresenter(marketView, tronNetwork, rxJavaSchedulers);
    }
}
