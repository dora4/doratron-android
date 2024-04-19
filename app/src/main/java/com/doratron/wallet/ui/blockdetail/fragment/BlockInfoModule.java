package com.doratron.wallet.ui.blockdetail.fragment;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BlockInfoModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {BlockInfoFragmentModule.class})
    public abstract BlockInfoFragment contributeBlockInfoFragment();
}