package com.doratron.wallet.ui.backupaccount;

import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class BackupAccountActivityModule {

    @Binds
    public abstract BackupAccountView view(BackupAccountActivity backupAccountActivity);

    @Provides
    static BackupAccountPresenter provideBackupAccountPresenter(BackupAccountView backupAccountView,
            Tron tron, WalletAppManager walletAppManager, RxJavaSchedulers rxJavaSchedulers) {
        return new BackupAccountPresenter(backupAccountView, tron, walletAppManager,
                rxJavaSchedulers);
    }
}
