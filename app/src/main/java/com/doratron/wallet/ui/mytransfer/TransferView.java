package com.doratron.wallet.ui.mytransfer;

import com.doratron.wallet.ui.mvp.IView;

/**
 * Created by user on 2018. 5. 17..
 */

public interface TransferView extends IView {

    void transferDataLoadSuccess(long total);

    void showLoadingDialog();

    void showServerError();
}
