package com.doratron.wallet.ui.login;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.Toast;

import com.doratron.wallet.R;
import com.doratron.wallet.common.CommonActivity;
import com.doratron.wallet.common.CustomPreference;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.tron.WalletAppManager;
import com.doratron.wallet.ui.main.MainActivity;
import com.marcoscg.fingerauth.FingerAuth;
import com.marcoscg.fingerauth.FingerAuthDialog;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends CommonActivity implements LoginView {

    @Inject
    Tron mTron;

    @Inject
    LoginPresenter mLoginPresenter;

    @Inject
    CustomPreference mCustomPreference;

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.input_password)
    EditText mInputPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.title_login);
        }

        mLoginPresenter.onCreate();

        boolean hasFingerprintSupport = FingerAuth.hasFingerprintSupport(this);
        boolean useFingerprint = mCustomPreference.getUseFingerprint();

        if (hasFingerprintSupport && useFingerprint) {
            new FingerAuthDialog(this)
                    .setTitle(getString(R.string.login_text))
                    .setCancelable(false)
                    .setMaxFailedCount(3)
                    .setPositiveButton(getString(R.string.use_password_text), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            // do something
                        }
                    })
                    .setOnFingerAuthListener(new FingerAuth.OnFingerAuthListener() {
                        @Override
                        public void onSuccess() {
                            mTron.loginWithFingerPrint();
                            loginResult(Tron.SUCCESS);
                        }

                        @Override
                        public void onFailure() {
                            Toast.makeText(LoginActivity.this, getString(R.string.invalid_fingerprint),
                                    Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onError() {
                            Toast.makeText(LoginActivity.this, getString(R.string.invalid_fingerprint),
                                    Toast.LENGTH_SHORT).show();
                        }
                    })
                    .show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
//        checkStoragePermission();
    }

    @OnClick(R.id.btn_login)
    public void onLoginClick() {
        String password = mInputPassword.getText().toString();

        showProgressDialog("", getString(R.string.loading_msg));
        mLoginPresenter.loginWallet(password);
    }

    @Override
    public void loginResult(int result) {
        hideDialog();

        if (result == WalletAppManager.ERROR) {
            Toast.makeText(LoginActivity.this, getString(R.string.invalid_password),
                    Toast.LENGTH_SHORT).show();
        } else if (result == Tron.SUCCESS) {
            Toast.makeText(LoginActivity.this, getString(R.string.login_success),
                    Toast.LENGTH_SHORT).show();

            startActivity(MainActivity.class);
            finishActivity();
        }
    }
}
