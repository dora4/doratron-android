package com.doratron.wallet.ui.vote;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class VoteActivityModule {

    @Binds
    public abstract VoteView view(VoteActivity voteActivity);

    @Provides
    static VotePresenter provideVotePresenter(VoteView view, Tron tron, TronNetwork tronNetwork,
            WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers) {
        return new VotePresenter(view, tron, tronNetwork, walletAppManager, rxJavaSchedulers);
    }
}
