package com.doratron.wallet.ui.blockexplorer.transaction;

import com.doratron.wallet.ui.mvp.IView;

public interface TransactionView extends IView {

    void finishLoading(long total);
    void showLoadingDialog();
    void showServerError();
}
