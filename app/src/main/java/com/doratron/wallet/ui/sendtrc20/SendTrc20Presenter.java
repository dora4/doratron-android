package com.doratron.wallet.ui.sendtrc20;

import com.doratron.wallet.database.AppDatabase;
import com.doratron.wallet.database.dao.Trc20ContractDao;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.tron.Tron;
import com.doratron.wallet.ui.mvp.BasePresenter;

import io.reactivex.Single;

public class SendTrc20Presenter extends BasePresenter<SendTrc20View> {

    private Tron mTron;
    private Trc20ContractDao mTrc20ContractDao;
    private RxJavaSchedulers mRxJavaSchedulers;

    public SendTrc20Presenter(SendTrc20View view, Tron tron, AppDatabase appDatabase,
            RxJavaSchedulers rxJavaSchedulers) {
        super(view);
        this.mTron = tron;
        this.mTrc20ContractDao = appDatabase.trc20ContractDao();
        this.mRxJavaSchedulers = rxJavaSchedulers;
    }

    @Override
    public void onCreate() {
        loadTrc20Tokens();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void loadTrc20Tokens() {
        mView.showLoadingDialog();

        Single.fromCallable(() -> mTrc20ContractDao.getAll())
                .subscribeOn(mRxJavaSchedulers.getIo())
                .observeOn(mRxJavaSchedulers.getMainThread())
                .subscribe(trc20ContractModels -> {

                });
    }
}
