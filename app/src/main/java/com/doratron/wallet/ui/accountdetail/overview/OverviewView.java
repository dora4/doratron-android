package com.doratron.wallet.ui.accountdetail.overview;

import android.support.annotation.NonNull;

import com.doratron.wallet.ui.main.dto.TronAccount;
import com.doratron.wallet.ui.mvp.IView;

public interface OverviewView extends IView {

    void showLoadingDialog();
    void showServerError();
    void finishLoading(@NonNull TronAccount account);
}
