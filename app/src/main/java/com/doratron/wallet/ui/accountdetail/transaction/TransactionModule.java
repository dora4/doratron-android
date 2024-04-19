package com.doratron.wallet.ui.accountdetail.transaction;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class TransactionModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {TransactionFragmentModule.class})
    public abstract TransactionFragment contributeTransactionFragment();
}