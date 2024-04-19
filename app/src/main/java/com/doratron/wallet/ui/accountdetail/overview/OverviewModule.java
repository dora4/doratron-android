package com.doratron.wallet.ui.accountdetail.overview;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class OverviewModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {OverviewFragmentModule.class})
    public abstract OverviewFragment contributeOverviewFragment();
}