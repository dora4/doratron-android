package com.doratron.wallet.ui.intro;

import com.doratron.wallet.ui.mvp.IView;

interface IntroView extends IView {

    void startCreateAccountActivity();

    void startLoginActivity();

    void startBackupAccountActivity();

    void showErrorMsg();

    void doesNotSupportAlgorithm();

    void connectionError();
}
