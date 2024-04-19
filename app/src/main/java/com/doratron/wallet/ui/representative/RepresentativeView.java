package com.doratron.wallet.ui.representative;

import com.doratron.wallet.ui.mvp.IView;

public interface RepresentativeView extends IView {

    void showLoadingDialog();

    void displayRepresentativeInfo(int witnessCount, long highestVotes);

    void showServerError();
}
