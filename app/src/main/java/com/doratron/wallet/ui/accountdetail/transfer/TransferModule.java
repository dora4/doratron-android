package com.doratron.wallet.ui.accountdetail.transfer;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class TransferModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {TransferFragmentModule.class})
    public abstract TransferFragment contributeTransferFragment();
}