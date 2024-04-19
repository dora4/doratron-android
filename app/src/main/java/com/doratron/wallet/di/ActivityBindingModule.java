package com.doratron.wallet.di;

import com.doratron.wallet.ui.about.AboutActivity;
import com.doratron.wallet.ui.accountdetail.AccountDetailActivity;
import com.doratron.wallet.ui.accountdetail.overview.AccountVoteActivity;
import com.doratron.wallet.ui.accountdetail.overview.AccountVoteActivityModule;
import com.doratron.wallet.ui.accountdetail.overview.OverviewModule;
import com.doratron.wallet.ui.accountdetail.representative.RepresentativeModule;
import com.doratron.wallet.ui.accountdetail.transaction.TransactionModule;
import com.doratron.wallet.ui.accountdetail.transfer.TransferModule;
import com.doratron.wallet.ui.address.AddressActivity;
import com.doratron.wallet.ui.address.AddressActivityModule;
import com.doratron.wallet.ui.backupaccount.BackupAccountActivity;
import com.doratron.wallet.ui.backupaccount.BackupAccountActivityModule;
import com.doratron.wallet.ui.blockdetail.BlockDetailActivity;
import com.doratron.wallet.ui.blockdetail.fragment.BlockInfoModule;
import com.doratron.wallet.ui.blockexplorer.BlockExplorerActivity;
import com.doratron.wallet.ui.createwallet.CreateWalletActivity;
import com.doratron.wallet.ui.createwallet.CreateWalletActivityModule;
import com.doratron.wallet.ui.exchange.ExchangeActivity;
import com.doratron.wallet.ui.exchange.ExchangeActivityModule;
import com.doratron.wallet.ui.importkey.ImportPrivateKeyActivity;
import com.doratron.wallet.ui.importkey.ImportPrivateKeyActivityModule;
import com.doratron.wallet.ui.intro.IntroActivity;
import com.doratron.wallet.ui.intro.IntroActivityModule;
import com.doratron.wallet.ui.login.LoginActivity;
import com.doratron.wallet.ui.login.LoginActivityModule;
import com.doratron.wallet.ui.main.MainActivity;
import com.doratron.wallet.ui.main.MainActivityModule;
import com.doratron.wallet.ui.market.MarketActivity;
import com.doratron.wallet.ui.market.MarketActivityModule;
import com.doratron.wallet.ui.more.MoreActivity;
import com.doratron.wallet.ui.more.MoreActivityModule;
import com.doratron.wallet.ui.myaccount.MyAccountActivity;
import com.doratron.wallet.ui.myaccount.MyAccountActivityModule;
import com.doratron.wallet.ui.mytransfer.MyTransferActivityModule;
import com.doratron.wallet.ui.mytransfer.TransferActivity;
import com.doratron.wallet.ui.node.NodeActivity;
import com.doratron.wallet.ui.node.NodeActivityModule;
import com.doratron.wallet.ui.previewwallet.PreviewWalletActivity;
import com.doratron.wallet.ui.previewwallet.PreviewWalletActivityModule;
import com.doratron.wallet.ui.qrscan.QrScanActivity;
import com.doratron.wallet.ui.representative.RepresentativeActivity;
import com.doratron.wallet.ui.representative.RepresentativeActivityModule;
import com.doratron.wallet.ui.requestcoin.RequestCoinActivity;
import com.doratron.wallet.ui.sendtrc10.SendTrc10Activity;
import com.doratron.wallet.ui.sendtrc10.SendTrc10ActivityModule;
import com.doratron.wallet.ui.sendtrc20.SendTrc20Activity;
import com.doratron.wallet.ui.sendtrc20.SendTrc20ActivityModule;
import com.doratron.wallet.ui.smartcontract.TestSmartContractActivity;
import com.doratron.wallet.ui.token.TokenActivity;
import com.doratron.wallet.ui.token.TokenActivityModule;
import com.doratron.wallet.ui.token.TokenDetailActivity;
import com.doratron.wallet.ui.vote.VoteActivity;
import com.doratron.wallet.ui.vote.VoteActivityModule;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = { IntroActivityModule.class })
    abstract IntroActivity bindIntroActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { LoginActivityModule.class })
    abstract LoginActivity bindLoginActivity();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract AboutActivity bindAboutActivity();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract TestSmartContractActivity bindTestSmartContractActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { AddressActivityModule.class })
    abstract AddressActivity bindAddressActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { BackupAccountActivityModule.class })
    abstract BackupAccountActivity bindBackupAccountActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { CreateWalletActivityModule.class })
    abstract CreateWalletActivity bindCreateWalletActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { ImportPrivateKeyActivityModule.class })
    abstract ImportPrivateKeyActivity bindImportPrivateKeyActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { MainActivityModule.class })
    abstract MainActivity bindMainActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { MarketActivityModule.class })
    abstract MarketActivity bindMarketActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { MoreActivityModule.class })
    abstract MoreActivity bindMoreActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { MyAccountActivityModule.class })
    abstract MyAccountActivity bindMyAccountActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { MyTransferActivityModule.class })
    abstract TransferActivity bindTransferActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { NodeActivityModule.class })
    abstract NodeActivity bindNodeActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { RepresentativeActivityModule.class })
    abstract RepresentativeActivity bindRepresentativeActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { SendTrc10ActivityModule.class })
    abstract SendTrc10Activity bindSendTokenActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { SendTrc20ActivityModule.class })
    abstract SendTrc20Activity bindSendTrc20Activity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { TokenActivityModule.class })
    abstract TokenActivity bindTokenActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { VoteActivityModule.class })
    abstract VoteActivity bindVoteActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {
            OverviewModule.class,
            TransactionModule.class,
            TransferModule.class,
            RepresentativeModule.class
    })
    abstract AccountDetailActivity bindAccountDetailActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {AccountVoteActivityModule.class})
    abstract AccountVoteActivity bindAccountVoteActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {
            com.doratron.wallet.ui.blockexplorer.overview.OverviewModule.class,
            com.doratron.wallet.ui.blockexplorer.account.AccountModule.class,
            com.doratron.wallet.ui.blockexplorer.block.BlockModule.class,
            com.doratron.wallet.ui.blockexplorer.transaction.TransactionModule.class,
            com.doratron.wallet.ui.blockexplorer.transfer.TransferModule.class
    })
    abstract BlockExplorerActivity bindBlockExplorerActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {
            BlockInfoModule.class,
            TransactionModule.class,
            TransferModule.class
    })
    abstract BlockDetailActivity bindBlockDetailActivity();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract QrScanActivity bindQrScanActivity();

    @ActivityScoped
    @ContributesAndroidInjector
    abstract RequestCoinActivity bindRequestCoinActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = {
            com.doratron.wallet.ui.token.overview.OverviewModule.class,
            com.doratron.wallet.ui.token.holder.HolderModule.class,
            com.doratron.wallet.ui.token.transfer.TransferModule.class
    })
    abstract TokenDetailActivity bindTokenDetailActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { ExchangeActivityModule.class })
    abstract ExchangeActivity exchangeActivity();

    @ActivityScoped
    @ContributesAndroidInjector(modules = { PreviewWalletActivityModule.class })
    abstract PreviewWalletActivity bindPreviewWalletActivity();
}
