package com.doratron.wallet.ui.address;

import android.support.annotation.Nullable;

import com.doratron.wallet.ui.mvp.IView;

public interface AddressView extends IView {

    void addressResult(@Nullable AddressPresenter.AddressInfo addressInfo);

}
