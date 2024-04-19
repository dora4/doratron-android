package com.doratron.wallet.ui.blockexplorer.account;

import com.doratron.wallet.ui.mvp.IView;

public interface AccountView extends IView {

    void finishLoading(long total);
    void showLoadingDialog();
    void showServerError();
}
