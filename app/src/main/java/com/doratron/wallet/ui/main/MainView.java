package com.doratron.wallet.ui.main;

import android.support.annotation.NonNull;

import com.doratron.tronlib.dto.CoinMarketCap;
import com.doratron.wallet.ui.main.dto.TronAccount;
import com.doratron.wallet.ui.mvp.IView;

public interface MainView extends IView {

    void showLoadingDialog();

    void displayAccountInfo(@NonNull TronAccount account);

    void setTronMarketInfo(CoinMarketCap coinMarketCap);

    void showInvalidPasswordMsg();

    void successCreateAccount();

    void successImportAccount();

    void failCreateAccount();

    void duplicatedAccount();

    void connectionError();

    void changePasswordResult(boolean result);

    void showChangePasswordDialog();

    void goToIntroActivity();

    void resultAddTrc20(int result);

    void finishSyncTrc20();

    void showSyncTrc20Loading();
}
