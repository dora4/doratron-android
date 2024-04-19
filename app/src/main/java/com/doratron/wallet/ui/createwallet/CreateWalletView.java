package com.doratron.wallet.ui.createwallet;

import android.support.annotation.NonNull;

import com.doratron.wallet.ui.mvp.IView;

public interface CreateWalletView extends IView {

    void createdWallet(@NonNull byte[] aesKey);

    void passwordError();

    void registerWalletError();
}
