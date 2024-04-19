package com.doratron.wallet.ui.blockexplorer.transfer;

import com.doratron.wallet.ui.mvp.IView;

public interface TransferView extends IView {

    void finishLoading(long total);
    void showLoadingDialog();
    void showServerError();
}
