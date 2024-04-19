package com.doratron.wallet.ui.accountdetail.representative;

import com.doratron.wallet.di.FragmentScoped;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class RepresentativeModule {

    @FragmentScoped
    @ContributesAndroidInjector(modules = {RepresentativeFragmentModule.class})
    public abstract RepresentativeFragment contributeRepresentativeFragment();
}