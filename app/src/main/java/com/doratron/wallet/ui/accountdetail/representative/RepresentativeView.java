package com.doratron.wallet.ui.accountdetail.representative;

import com.doratron.wallet.ui.accountdetail.representative.model.BaseModel;
import com.doratron.wallet.ui.mvp.IView;

import java.util.List;

public interface RepresentativeView extends IView {
    void dataLoadSuccess(List<BaseModel> viewModels);
    void showLoadingDialog();
    void showServerError();
}
