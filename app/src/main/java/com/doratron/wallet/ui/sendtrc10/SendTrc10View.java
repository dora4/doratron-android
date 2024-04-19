package com.doratron.wallet.ui.sendtrc10;

import com.doratron.wallet.ui.main.dto.Asset;
import com.doratron.wallet.ui.mvp.IView;

import java.util.List;

public interface SendTrc10View extends IView {

    void sendTokenResult(boolean result);

    void invalidPassword();

    void displayAccountInfo(List<Asset> assets);

    void invalidAddress();

    void connectionError();
}
