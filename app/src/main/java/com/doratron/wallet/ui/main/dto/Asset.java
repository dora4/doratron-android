package com.doratron.wallet.ui.main.dto;

import com.doratron.wallet.common.Constants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Asset {

    private String name;

    private String displayName;

    private double balance;

    private int precision;

    @Override
    public String toString() {
        return displayName + " (" + Constants.tokenBalanceFormat.format(balance) + ")";
    }
}