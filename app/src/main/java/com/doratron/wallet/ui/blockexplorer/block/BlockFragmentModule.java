package com.doratron.wallet.ui.blockexplorer.block;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class BlockFragmentModule {

    @Binds
    public abstract BlockView view(BlockFragment fragment);

    @Provides
    static BlockPresenter provideBlockPresenter(BlockView view, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new BlockPresenter(view, tronNetwork, rxJavaSchedulers);
    }
}