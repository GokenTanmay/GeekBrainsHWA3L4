package com.example.rumpilstilstkin.lesson4.presenters.home;

import com.arellomobile.mvp.MvpView;
import com.example.rumpilstilstkin.lesson4.data.models.UserRep;

import java.util.List;

public interface UserRepView extends MvpView {
    void showUserReps(List<UserRep> userRepList);
}
