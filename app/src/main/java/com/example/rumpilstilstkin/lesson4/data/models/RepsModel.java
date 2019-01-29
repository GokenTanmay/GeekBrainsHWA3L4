package com.example.rumpilstilstkin.lesson4.data.models;


import com.google.gson.annotations.SerializedName;


public class RepsModel {
    public String name;
    public GithubUser owner;

    @SerializedName("full_name")
    public String fullName;
}
