package com.amberllo.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.Observable;

import com.amberllo.databinding.BR;
import com.amberllo.databinding.R;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseObservable {

    private String firstName;
    private String lastName;
    private int iconDefault;
    private String avatar;
    private List<Item> listItem;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iconDefault = R.mipmap.ic_launcher;
        this.listItem = new ArrayList<>();
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    @Bindable
    public int getIconDefault() {
        return iconDefault;
    }

    @Bindable
    public List<Item> getListItem() {
        return listItem;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
    public void setAvatar(String avatar) {
        this.avatar= avatar;
        notifyPropertyChanged(BR.avatar);
    }

    public void setIconDefault(int iconDefault) {
        this.iconDefault = iconDefault;
        notifyPropertyChanged(BR.iconDefault);
    }


    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
        notifyPropertyChanged(BR.listItem);
    }
}
