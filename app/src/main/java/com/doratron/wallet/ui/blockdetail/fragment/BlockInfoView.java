package com.doratron.wallet.ui.blockdetail.fragment;

import android.support.annotation.NonNull;

import com.doratron.tronlib.dto.Block;
import com.doratron.wallet.ui.mvp.IView;

public interface BlockInfoView extends IView {
    void showLoadingDialog();
    void showServerError();
    void finishLoading(@NonNull Block block);
}
