package com.doratron.wallet.common;

import android.content.Context;

import com.doratron.wallet.common.security.PasswordEncoder;
import com.doratron.wallet.database.AppDatabase;
import com.doratron.wallet.database.dao.WalletDao;

public class SecurityUpdater {

    private CustomPreference customPreference;
    private PasswordEncoder passwordEncoder;

    private WalletDao mWalletDao;

    public SecurityUpdater(Context context, CustomPreference customPreference, PasswordEncoder passwordEncoder, AppDatabase appDatabase) {
        this.customPreference = customPreference;
        this.passwordEncoder = passwordEncoder;
        mWalletDao = appDatabase.walletDao();
    }

    public boolean canUpdate() {
        return true;
    }

    public boolean doUpdate(String password) {
        return true;
    }
}
