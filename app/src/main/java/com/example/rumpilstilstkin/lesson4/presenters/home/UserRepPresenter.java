package com.example.rumpilstilstkin.lesson4.presenters.home;

import android.util.Log;

import com.arellomobile.mvp.MvpPresenter;
import com.example.rumpilstilstkin.lesson4.data.models.RepsModel;
import com.example.rumpilstilstkin.lesson4.data.models.UserRep;
import com.example.rumpilstilstkin.lesson4.data.rest.NetApiClient;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

public class UserRepPresenter extends MvpPresenter<UserRepView> implements Subscriber<List<UserRep>> {
    @Override
    public void onSubscribe(Subscription s) {
        Log.d("Dto", "UserRepPresenter:onSubscribe: ");
        s.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(List<UserRep> userRepList) {
        Log.d("Dto", "UserRepPresenter:onNext:userRepList.size = " + userRepList.size());
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onComplete() {
        Log.d("Dto", "onComplete: ");
    }

    public void loadData(String userName) {
        Log.d("Dto", "UserRepPresenter:loadData: ");
        NetApiClient.getInstance().getUserReps(userName)
                .subscribe(this);
    }
}
