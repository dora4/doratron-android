package com.doratron.wallet.ui.importkey;

import com.doratron.wallet.ui.mvp.IView;

public interface ImportPrivateKeyView extends IView {

    void createdWallet();

    void passwordError();

    void registerWalletError();
}
