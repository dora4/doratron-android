package com.doratron.wallet.ui.accountdetail.transaction;

import com.doratron.tronlib.TronNetwork;
import com.doratron.wallet.rxjava.RxJavaSchedulers;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class TransactionFragmentModule {

    @Binds
    public abstract TransactionView view(TransactionFragment fragment);

    @Provides
    static TransactionPresenter provideTransactionPresenter(TransactionView view, TronNetwork tronNetwork,
            RxJavaSchedulers rxJavaSchedulers) {
        return new TransactionPresenter(view, tronNetwork, rxJavaSchedulers);
    }
}