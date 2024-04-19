package com.doratron.wallet.ui.node;

import com.doratron.wallet.ui.mvp.IView;

public interface NodeView extends IView {

    void displayNodeList(int count);
    void errorNodeList();

}
