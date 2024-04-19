package com.doratron.wallet.ui.accountdetail.overview;

import android.support.annotation.NonNull;

import com.doratron.tronlib.TronNetwork;
import com.doratron.tronlib.dto.AccountVote;
import com.doratron.tronlib.dto.AccountVotes;
import com.doratron.wallet.common.AdapterDataModel;
import com.doratron.wallet.rxjava.RxJavaSchedulers;
import com.doratron.wallet.ui.mvp.BasePresenter;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class AccountVotePresenter extends BasePresenter<AccountVoteView> {

    private AdapterDataModel<AccountVote> mAdapterDataModel;
    private TronNetwork mTronNetwork;
    private RxJavaSchedulers mRxJavaSchedulers;

    public AccountVotePresenter(AccountVoteView view, TronNetwork tronNetwork, RxJavaSchedulers rxJavaSchedulers) {
        super(view);
        this.mTronNetwork = tronNetwork;
        this.mRxJavaSchedulers = rxJavaSchedulers;
    }

    public void setAdapterDataModel(AdapterDataModel<AccountVote> adapterDataModel) {
        this.mAdapterDataModel = adapterDataModel;
    }

    @Override
    public void onCreate() {

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

    public void getVotes(@NonNull String address, long startIndex, int pageSize) {
        mView.showLoadingDialog();

        mTronNetwork.getAccountVotes(address, startIndex, pageSize, "-votes")
                .observeOn(mRxJavaSchedulers.getMainThread())
                .map(accountVotes -> {
                    for (AccountVote accountVote : accountVotes.getData()) {
                        accountVote.setTotalVotes(accountVotes.getTotalVotes());
                    }

                    return accountVotes;
                })
                .subscribe(new SingleObserver<AccountVotes>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(AccountVotes accountVotes) {
                        mAdapterDataModel.addAll(accountVotes.getData());
                        mView.finishLoading(accountVotes.getTotalVotes(), accountVotes.getTotal());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
