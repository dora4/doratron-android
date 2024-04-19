package com.doratron.wallet.ui.token.overview;

import android.support.annotation.NonNull;

import com.doratron.tronlib.dto.Token;
import com.doratron.wallet.ui.mvp.IView;

public interface OverviewView extends IView {

    void tokenInfoLoadSuccess(@NonNull Token token);
    void showLoadingDialog();
    void showServerError();
}
