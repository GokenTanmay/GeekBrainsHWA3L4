package com.example.rumpilstilstkin.lesson4.presenters.home;


import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.rumpilstilstkin.lesson4.data.models.GithubUser;
import com.example.rumpilstilstkin.lesson4.data.rest.NetApiClient;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


@InjectViewState
public class UserPresenter extends MvpPresenter<UserView>
        implements Observer<GithubUser> {

    @Override
    public void attachView(UserView view) {
        super.attachView(view);
        loadDate();
    }

    public void loadDate() {
        Log.d("Dto", "UserPresenter:loadData: ");
        getViewState().showLoading();
        NetApiClient.getInstance().getUser("rumpilstilstkin") //Первый пункт домашнего задания, мы же уже загружаем одного пользователя?
                .subscribe(this);
    }

    @Override
    public void onSubscribe(Disposable d) {
        //nope
    }

    @Override
    public void onNext(GithubUser githubUser) {
        Log.d("Dto", "UserPresenter:onNext: ");
        getViewState().showImage(githubUser.getAvatar());
        getViewState().showName(githubUser.getLogin());
    }

    @Override
    public void onError(Throwable e) {
        getViewState().showError(e);
    }

    @Override
    public void onComplete() {
        getViewState().hideLoading();
    }
}
