package com.doratron.wallet.ui.market;

import com.doratron.tronlib.dto.Market;
import com.doratron.wallet.ui.mvp.IView;

import java.util.List;

/**
 * Created by user on 2018. 5. 24..
 */

public interface MarketView extends IView {
    void marketDataLoadSuccess(List<Market> markets);
    void showLoadingDialog();
    void showServerError();
}
