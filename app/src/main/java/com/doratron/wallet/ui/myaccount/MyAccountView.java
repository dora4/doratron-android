package com.doratron.wallet.ui.myaccount;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.doratron.wallet.ui.main.dto.TronAccount;
import com.doratron.wallet.ui.mvp.IView;

public interface MyAccountView extends IView {

    void displayAccountInfo(@NonNull String address, @Nullable TronAccount account);

    void showLoadingDialog();

    void hideDialog();

    void showServerError();

    void successFreezeBalance();

    void unableToUnfreeze();

    void showInvalidPasswordMsg();

    void successDelete();
}
