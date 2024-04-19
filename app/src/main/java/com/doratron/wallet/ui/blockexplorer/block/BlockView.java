package com.doratron.wallet.ui.blockexplorer.block;


import com.doratron.tronlib.dto.Blocks;
import com.doratron.wallet.ui.mvp.IView;

/**
 * Created by user on 2018. 5. 25..
 */

public interface BlockView extends IView {
    void blockDataLoadSuccess(Blocks blocks, boolean added);
    void showLoadingDialog();
    void showServerError();
}
