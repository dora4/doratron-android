package com.doratron.wallet.ui.backupaccount;

import android.support.annotation.NonNull;

import com.doratron.wallet.ui.mvp.IView;

public interface BackupAccountView extends IView {

    void displayAccountInfo(@NonNull String address, @NonNull String privateKey);

    void startMainActivity();
}
