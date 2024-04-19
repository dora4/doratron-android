package com.doratron.wallet.ui.blockexplorer.account;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AccountModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {AccountFragmentModule.class})
    public abstract AccountFragment contributeAccountFragment();
}