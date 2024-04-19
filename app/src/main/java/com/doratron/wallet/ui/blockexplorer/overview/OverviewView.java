package com.doratron.wallet.ui.blockexplorer.overview;

import com.doratron.tronlib.dto.TronAccounts;
import com.doratron.wallet.ui.mvp.IView;

/**
 * Created by user on 2018. 5. 28..
 */

public interface OverviewView extends IView {

    void overviewDataLoadSuccess(TronAccounts topAddressAccounts);
    void showLoadingDialog();
    void showServerError();

}
