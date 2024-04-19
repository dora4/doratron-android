package com.doratron.wallet.ui.accountdetail.overview;

import com.doratron.wallet.ui.mvp.IView;

public interface AccountVoteView extends IView {

    void finishLoading(long totalVotes, long total);
    void showLoadingDialog();
    void showServerError();
}
