package com.doratron.wallet.ui.token.holder;

import com.doratron.wallet.ui.mvp.IView;

public interface HolderView extends IView {

    void finishLoading(long total);
    void showLoadingDialog();
    void showServerError();
}
