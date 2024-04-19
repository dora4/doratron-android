package com.doratron.wallet.ui.importkey;

import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class ImportPrivateKeyActivityModule {

    @Binds
    public abstract ImportPrivateKeyView view(ImportPrivateKeyActivity importPrivateKeyActivity);

    @Provides
    static ImportPrivateKeyPresenter provideImportPrivateKeyPresenter(ImportPrivateKeyView importPrivateKeyView,
            Tron tron, RxJavaSchedulers rxJavaSchedulers) {
        return new ImportPrivateKeyPresenter(importPrivateKeyView, tron, rxJavaSchedulers);
    }
}
