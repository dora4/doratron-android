package com.doratron.tronlib.services;

import com.doratron.tronlib.dto.TriggerRequest;
import com.doratron.tronlib.dto.TriggerResult;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TronGridService {

    @POST("wallet/triggersmartcontract")
    public Single<TriggerResult> triggerSmartContract(@Body TriggerRequest request);
}
