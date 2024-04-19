package com.doratron.wallet.ui.blockexplorer.block;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BlockModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {BlockFragmentModule.class})
    public abstract BlockFragment contributeBlockFragment();
}