package com.doratron.wallet.ui.token.holder;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class HolderModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {HolderFragmentModule.class})
    public abstract HolderFragment contributeHolderFragment();
}